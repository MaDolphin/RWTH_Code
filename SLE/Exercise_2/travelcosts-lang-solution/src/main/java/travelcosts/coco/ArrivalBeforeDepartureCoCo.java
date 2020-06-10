// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.*;
import travelcosts._cocos.TravelCostsASTTravelExpenseReportCoCo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArrivalBeforeDepartureCoCo implements TravelCostsASTTravelExpenseReportCoCo {
  
  protected static String message = "Departure starts before Arrival is completed";
  
  @Override public void check(ASTTravelExpenseReport node) {
    ASTArrival arrival = node.getArrival();
    ASTDeparture departure = node.getDeparture();
    LocalDateTime start = toLocalDateTime(arrivalDay(arrival), arrivalTime(arrival));
    LocalDateTime endDate = toLocalDateTime(departureDay(departure), departureTime(departure));
    if (!start.isBefore(endDate)){
      Log.error(message);
    }
  }
  
  protected ASTISODate arrivalDay(ASTArrival arrival){
    if(arrival.getDuration().isPresentEndDate()){
      return arrival.getDuration().getEndDate();
    }
    return arrival.getDuration().getStartDate();
  }
  
  protected ASTTime arrivalTime(ASTArrival arrival){
    if(arrival.getDuration().isPresentEndTime()){
      return arrival.getDuration().getEndTime();
    }
    return arrival.getDuration().getStartTime();
  }
  
  protected ASTISODate departureDay(ASTDeparture departure){
    return departure.getDuration().getStartDate();
  }
  
  protected ASTTime departureTime(ASTDeparture departure){
    return departure.getDuration().getStartTime();
  }
  
  protected LocalDate toLocalDate(ASTISODate date){
    int year = date.isPresentYear()? date.getYear().getValue(): LocalDate.now().getYear();
    int month = date.getMonth().getValue();
    int day = date.getDay().getValue();
    return LocalDate.of(year,month,day);
  }
  
  protected LocalDateTime toLocalDateTime(ASTISODate date, ASTTime time){
    int hours = time.getHours().getValue();
    int minutes = time.isPresentMinutes() ? time.getMinutes().getValue():0;
    return toLocalDate(date).atTime(hours, minutes);
  }
  
  
}
