// (c) https://github.com/MontiCore/monticore
package travelcosts.prettyprint;

import de.monticore.MCCommonLiteralsPrettyPrinter;
import de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral;
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
    public void visit(ASTTravelNumber node) {
        printer.print("Reisenummer ");
    }

    @Override
    public void endVisit(ASTTravelNumber node) {
        printer.println();
    }

    @Override
    public void visit(ASTArrival node) {
        printer.print("Anreise ");
    }

    @Override
    public void endVisit(ASTArrival node) {
        printer.println();
    }

    @Override
    public void visit(ASTWorkDay node) {
        printer.print("Arbeitstag ");
    }

    @Override
    public void endVisit(ASTWorkDay node) {
        printer.println();
    }

//    @Override
//    public void traverse(ASTAllWorkDays node) {
//        printer.print("Arbeitstage ");
//        traverse(node.getBeginTime());
//        printer.print(" - ");
//        traverse(node.getEndTime());
//        printer.println();
//    }

    @Override
    public void visit(ASTAllWorkDays node) {
        printer.print("Arbeitstage ");
    }

    @Override
    public void traverse(ASTAllWorkDays node) {
        if (null != node.getBeginTime()) {
            node.getBeginTime().accept(getRealThis());
        }
        printer.print(" - ");
        if (null != node.getEndTime()) {
            node.getEndTime().accept(getRealThis());
        }
    }

    @Override
    public void endVisit(ASTAllWorkDays node) {
        printer.println();
    }

//
//    @Override
//    public void traverse(ASTDeparture node) {
//        printer.print("Abreise ");
//        traverse(node.getDuration());
//    }

    @Override
    public void visit(ASTDeparture node) {
        printer.print("Abreise ");
    }

    @Override
    public void endVisit(ASTDeparture node) {
        printer.println();
    }

    @Override
    public void visit(ASTCostItems node) {
        printer.println("Kosten {");
        printer.indent();
    }

//    @Override
//    public void traverse(ASTCostItems node) {
//        for (ASTCostItem a : node.getCostItemList()) {
//            traverse(a);
//        }
//    }

    @Override
    public void endVisit(ASTCostItems node) {
        printer.unindent();
        printer.println("}");
    }

//    @Override
//    public void traverse(ASTCostItem node) {
//        if (node.getCurrency() == 2) {
//            printer.print(node.getId().getDigits() + ") ");
////            visit(node.getAmount());
//            printer.print("210");
//            printer.print(" $ ");
//            visit(node.getCost());
//        } else if (node.getCurrency() == 4) {
//            printer.print(node.getId().getDigits() + ") ");
////            visit(node.getAmount());
//
//            printer.print(" € ");
//            visit(node.getCost());
//        } else if (node.getCurrency() == 6) {
//            printer.print(node.getId().getDigits() + ") ");
////            visit(node.getAmount());
//            printer.print(" - ");
//            visit(node.getCost());
//        }
//    }

    @Override
    public void visit(ASTCostItem node) {
        if (node.isPresentId()) {
            handle(node.getId());
            printer.print(") ");
        }

        node.getAmount().accept(getRealThis());

        if (node.getCurrency() == 4) {
            //printer.println(node.getId().getDigits() + ")" + node.getAmount() + "€");
            printer.print(" €");
        } else if (node.getCurrency() == 3) {
            //printer.println(node.getId() + ")" + node.getAmount() + "$");
            printer.print(" -");
        } else if (node.getCurrency() == 2) {
            //printer.println(node.getId() + ")" + node.getAmount() + "-");
            printer.print(" $");

        }
        printer.print(" ");
        node.getCost().accept(getRealThis());
    }

    @Override
    public void handle(ASTCostItem node) {
        getRealThis().visit(node);
        getRealThis().endVisit(node);
    }

    @Override
    public void endVisit(ASTCostItem node) {
        printer.println();
    }

    @Override
    public void visit(ASTHotelCost node){
        printer.print("Hotel ");
    }

//    @Override
//    public void traverse(ASTTransportCost node) {
//        printer.print("Fahrt " + node.getTravelMeans());
//        if (node.isPresentDescription()) {
//            printer.print(node.getDescription());
//        }
//        printer.println();
//    }

    @Override
    public void visit(ASTTransportCost node){
        printer.print("Fahrt ");
        handle(node.getTravelMeans());
    }

    @Override
    public void visit(ASTExtraCost node){
        printer.print("Nebenkosten ");
    }

//    public void traverse(ASTTravelMeans node) {
//        if (node.getIntValue() == 0) {
//            printer.print("Zug ");
//        } else if (node.getIntValue() == 1) {
//            printer.print("Flug ");
//        } else if (node.getIntValue() == 2) {
//            printer.print("ÖPNV ");
//        } else if (node.getIntValue() == 3) {
//            printer.print("Taxi ");
//        }
//    }

    @Override
    public void visit(ASTTravelMeans node){
        if(node == ASTTravelMeans.TRAIN){
            printer.print("Zug ");
        }
        else if(node == ASTTravelMeans.PLANE){
            printer.print("Flug ");
        }
        else if(node == ASTTravelMeans.PUBLICTRANSPORT){
            printer.print("ÖPNV ");
        }
        else if(node == ASTTravelMeans.CAB){
            printer.print("Taxi ");
        }
    }

//    @Override
//    public void traverse(ASTDescription node) {
//        if (node.isPresentLong()) {
//            printer.print(node.getLong());
//        } else if (node.isPresentShort()) {
//            printer.print(node.getShort());
//        }
//    }

    @Override
    public void  traverse(ASTDescription node){
        if (node.isPresentLong()) {
            node.getLong().accept(getRealThis());
        }
        if(node.isPresentShort()) {
            printer.print(node.getShort());
        }
    }

//    @Override
//    public void traverse(ASTISODate node) {
//        if (node.isPresentYear()) {
//            printer.print(node.getYear().getDigits() + "-" + node.getMonth().getDigits() + "-" + node.getDay().getDigits());
//        } else {
//            printer.print(node.getMonth().getDigits() + "-" + node.getDay().getDigits());
//        }
//        printer.print(" ");
//    }

    @Override
    public void visit(ASTISODate node){
        if(node.isPresentYear() == true) {
            //printer.println(node.getYear().getDigits() + "-" + node.getMonth().getDigits() + "-" + node.getDay().getDigits());
            handle(node.getYear());
            printer.print("-");
            handle(node.getMonth());
            printer.print("-");
            handle(node.getDay());
        } else {
            //printer.println(node.getMonth().getDigits() + "-" + node.getDay().getDigits());
            handle(node.getMonth());
            printer.print("-");
            handle(node.getDay());
        }
    }

    @Override
    public void handle(ASTISODate node){
        getRealThis().visit(node);
        getRealThis().endVisit(node);
    }

    @Override
    public void endVisit(ASTISODate node){
        printer.print(" ");
    }

//    @Override
//    public void traverse(ASTTime node) {
//        if (node.isPresentLeadingZero()) {
//            printer.print(node.getLeadingZero().getDigits());
//        }
//        printer.print(node.getHours().getDigits());
//        if (node.isPresentMinutes()) {
//            printer.print(":" + node.getMinutes().getDigits());
//        }
//    }

    @Override
    public void visit(ASTTime node) {
        if(node.isPresentLeadingZero() == true) {
            printer.print("0");
        }
        printer.print(node.getHours().getDigits());
        if(node.isPresentMinutes() == true) {
            printer.print(":" + node.getMinutes().getDigits());
        }
    }

    @Override
    public void handle(ASTTime node){
        getRealThis().visit(node);
        getRealThis().endVisit(node);
    }


//    @Override
//    public void traverse(ASTDuration node) {
//        this.traverse(node.getStartDate());
//        this.traverse(node.getStartTime());
//        if (node.isPresentEndDate() && node.isPresentEndTime()) {
//            printer.print(" - ");
//            traverse(node.getEndDate());
//            traverse(node.getEndTime());
//        }
//        else if (node.isPresentEndDate()) {
//            printer.print(" - ");
//            traverse(node.getEndDate());
//        }
//        else if (node.isPresentEndTime()) {
//            printer.println(" - ");
//            traverse(node.getEndTime());
//        }
//        printer.println();
//
//    }

    @Override
    public void traverse(ASTDuration node) {
        if (null != node.getStartDate()) {
            node.getStartDate().accept(getRealThis());
        }
        if (null != node.getStartTime()) {
            node.getStartTime().accept(getRealThis());
        }

        if (node.isPresentEndTime() || node.isPresentEndDate()) {
            printer.print(" - ");
        }

        if (node.isPresentEndDate()) {
            node.getEndDate().accept(getRealThis());
        }
        if (node.isPresentEndTime()) {
            node.getEndTime().accept(getRealThis());
        }
    }


}
