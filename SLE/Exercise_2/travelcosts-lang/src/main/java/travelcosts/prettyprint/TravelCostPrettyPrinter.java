// (c) https://github.com/MontiCore/monticore
package travelcosts.prettyprint;

import de.monticore.MCCommonLiteralsPrettyPrinter;
import de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral;
import de.monticore.prettyprint.IndentPrinter;
import travelcosts._ast.*;
import travelcosts._visitor.TravelCostsInheritanceVisitor;
import travelcosts._visitor.TravelCostsVisitor;

import java.util.Iterator;
import java.util.List;

public class TravelCostPrettyPrinter extends MCCommonLiteralsPrettyPrinter implements TravelCostsInheritanceVisitor {

    private TravelCostsVisitor realThis = this;

    public TravelCostPrettyPrinter(IndentPrinter printer) {
        super(printer);
    }

    @Override
    public void setRealThis(TravelCostsVisitor realThis) {
        this.realThis = realThis;
    }

    @Override
    public TravelCostsVisitor getRealThis() {
        return realThis;
    }

    public String prettyprint(ASTTravelCostsNode a) {
        a.accept(getRealThis());
        return printer.getContent();
    }

    @Override
    public void visit(ASTTravelExpenseReport node) {
        printer.println("Dienstreise " + node.getName() + " {");
        printer.indent();
    }

    @Override
    public void endVisit(ASTTravelExpenseReport node) {
        printer.unindent();
        printer.println("}");
    }

    @Override
    public void traverse(ASTTravelNumber node) {
        printer.println("Reisenummer " + node.getTravelNo().getDigits());
    }


    @Override
    public void traverse(ASTArrival node) {
        printer.print("Anreise ");
        traverse(node.getDuration());
    }

    @Override
    public void traverse(ASTWorkDay node) {
        printer.print("Arbeitstag ");
        traverse(node.getDuration());
    }

    @Override
    public void traverse(ASTAllWorkDays node) {
        printer.print("Arbeitstage ");
        traverse(node.getBeginTime());
        printer.print(" - ");
        traverse(node.getEndTime());
        printer.println();
    }

    @Override
    public void traverse(ASTDeparture node) {
        printer.print("Abreise ");
        traverse(node.getDuration());
    }

    @Override
    public void visit(ASTCostItems node) {
        printer.println("Kosten {");
        printer.indent();
        for(ASTCostItem a:node.getCostItemList() ){
            traverse(a);
        }
    }

    @Override
    public void endVisit(ASTCostItems node) {
        printer.unindent();
        printer.println("}");
    }

    @Override
    public void traverse(ASTCostItem node) {
        if (node.getCurrency() == 2) {
            printer.print(node.getId().getDigits() + ") ");
            visit(node.getAmount());
            printer.print(" $ ");
            visit(node.getCost());
        } else if (node.getCurrency() == 4) {
            printer.print(node.getId().getDigits() + ") ");
            visit(node.getAmount());
            printer.print(" € ");
            visit(node.getCost());
        } else if (node.getCurrency() == 6) {
            printer.print(node.getId().getDigits() + ") ");
            visit(node.getAmount());
            printer.print(" - ");
            visit(node.getCost());
        }
    }

    @Override
    public void visit(ASTNumericLiteral node) {
        if(node.isEmpty_PostComments()){
            printer.print(node.toArray_PreComments());

        }else {
            printer.print(node.toArray_PreComments());
            printer.print(".");
            printer.print(node.toArray_PostComments());
        }

    }

    @Override
    public void visit(ASTHotelCost node) {
        printer.println("Hotel");
    }

    @Override
    public void visit(ASTTransportCost node) {
        printer.print("Fahrt " + node.getTravelMeans());
        if(node.isPresentDescription()) {
            printer.print(node.getDescription());
        }
        printer.println();
    }

    @Override
    public void visit(ASTExtraCost node) {
        printer.print("Nebenkosten ");
        traverse(node.getDescription());
    }

    @Override
    public void visit(ASTTravelMeans node){
        if(node.getIntValue() == 0){
            printer.print("Zug ");
        }
        else if(node.getIntValue() == 1){
            printer.print("Flug ");
        }
        else if(node.getIntValue() == 2){
            printer.print("ÖPNV ");
        }
        else if(node.getIntValue() == 3){
            printer.print("Taxi ");
        }
    }

    @Override
    public void visit(ASTDescription node){
        if(node.isPresentLong()){
            printer.print(node.getLong());
        }
        else if(node.isPresentShort()){
            printer.print(node.getShort());
        }
    }

    @Override
    public void traverse(ASTISODate node){
        if(node.isPresentYear()) {
            printer.print(node.getYear().getDigits() + "-" + node.getMonth().getDigits() + "-" + node.getDay().getDigits());
        } else {
            printer.print(node.getMonth().getDigits() + "-" + node.getDay().getDigits());
        }
        printer.print(" ");
    }

    @Override
    public void traverse(ASTTime node) {
        if(node.isPresentLeadingZero()) {
            printer.print(node.getLeadingZero().getDigits());
        }
        printer.print(node.getHours().getDigits());
        if(node.isPresentMinutes()) {
            printer.print(":" + node.getMinutes().getDigits());
        }
    }

    @Override
    public void traverse(ASTDuration node) {
        this.traverse(node.getStartDate());
        this.traverse(node.getStartTime());
        if (node.isPresentEndDate() && node.isPresentEndTime()) {
            printer.print(" - ");
            traverse(node.getEndDate());
            traverse(node.getEndTime());
        }
        else if (node.isPresentEndDate()) {
            printer.print(" - ");
            traverse(node.getEndDate());
        }
        else if (node.isPresentEndTime()) {
            printer.println(" - ");
            traverse(node.getEndTime());
        }
        printer.println();

    }


}
