// (c) https://github.com/MontiCore/monticore
package travelcosts.prettyprint;

import de.monticore.MCCommonLiteralsPrettyPrinter;
import de.monticore.prettyprint.IndentPrinter;
import travelcosts._ast.*;
import travelcosts._visitor.TravelCostsInheritanceVisitor;
import travelcosts._visitor.TravelCostsVisitor;

import java.util.Iterator;

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
  
  @Override public void visit(ASTTravelExpenseReport node) {
    printer.println("Dienstreise " + node.getName() + " {");
    printer.indent();
  }
  
  @Override public void endVisit(ASTTravelExpenseReport node) {
    printer.unindent();
    printer.print("}");
  }
  
  @Override public void visit(ASTTravelNumber node) {
    printer.print("Reisenummer ");
  }
  
  @Override public void endVisit(ASTTravelNumber node) {
    printer.println();
  }
  
  @Override public void visit(ASTArrival node) {
    printer.print("Anreise ");
  }
  
  @Override public void endVisit(ASTArrival node) {
    printer.println();
  }
  
  @Override public void traverse(ASTAllWorkDays node) {
    printer.print("Arbeitstage ");
    node.getBeginTime().accept(getRealThis());
    printer.print(" - ");
    node.getEndTime().accept(getRealThis());
    printer.println();
  }
  
  @Override public void visit(ASTWorkDay node) {
    printer.print("Arbeitstag ");
  }
  
  @Override public void endVisit(ASTWorkDay node) {
    printer.println();
  }
  
  @Override public void visit(ASTDeparture node) {
    printer.print("Abreise ");
  }
  
  @Override public void endVisit(ASTDeparture node) {
    printer.println();
  }
  
  @Override public void traverse(ASTCostItems node) {
    printer.println("Kosten { ");
    printer.indent();
    for (ASTCostItem ci : node.getCostItemList()) {
      ci.accept(getRealThis());
      printer.println();
    }
    printer.unindent();
    printer.println("}");
  }
  
  @Override public void traverse(ASTCostItem node) {
    if (node.isPresentId()) {
      node.getId().accept(getRealThis());
      printer.print(") ");
    }
    node.getAmount().accept(getRealThis());
    if(node.getCurrency() == ASTConstantsTravelCosts.EURO) {
      printer.print("€");
    } else if(node.getCurrency() == ASTConstantsTravelCosts.DOLLAR) {
      printer.print("$");
    } else if(node.getCurrency() == ASTConstantsTravelCosts.ELSE) {
      printer.print("-");
    }
    printer.print(" ");
    node.getCost().accept(getRealThis());
  }
  
  @Override public void visit(ASTHotelCost node) {
    printer.print("Hotel");
  }
  
  @Override public void visit(ASTTransportCost node) {
    printer.print("Fahrt ");
    if(node.getTravelMeans().equals(ASTTravelMeans.TRAIN)) {
      printer.print("Zug ");
    } else if(node.getTravelMeans().equals(ASTTravelMeans.PLANE)) {
      printer.print("Flug ");
    } else if(node.getTravelMeans().equals(ASTTravelMeans.PUBLICTRANSPORT)) {
      printer.print("ÖPNV ");
    } else if(node.getTravelMeans().equals(ASTTravelMeans.CAB)) {
      printer.print("Taxi ");
    }
  }
  
  @Override public void visit(ASTExtraCost node) {
    printer.print("Nebenkosten ");
  }
  
  @Override public void traverse(ASTDescription node) {
    if (node.isPresentLong()) {
      node.getLong().accept(getRealThis());
    } else {
      printer.print(node.getShort());
    }
  }
  
  @Override public void traverse(ASTISODate node) {
    if (node.isPresentYear()) {
      node.getYear().accept(getRealThis());
      printer.print("-");
    }
    node.getMonth().accept(getRealThis());
    printer.print("-");
    node.getDay().accept(getRealThis());
  }
  
  @Override public void traverse(ASTTime node) {
    if (node.isPresentLeadingZero()) {
      node.getLeadingZero().accept(getRealThis());
    }
    node.getHours().accept(getRealThis());
    if (node.isPresentMinutes()) {
      printer.print(":");
      node.getMinutes().accept(getRealThis());
    }
  }
  
  @Override public void traverse(ASTDuration node) {
    node.getStartDate().accept(getRealThis());
    printer.print(" ");
    node.getStartTime().accept(getRealThis());
    if (node.isPresentEndTime()) {
      printer.print(" - ");
      if (node.isPresentEndDate()) {
        node.getEndDate().accept(getRealThis());
        printer.print(" ");
      }
      node.getEndTime().accept(getRealThis());
    }
  }
  
}
