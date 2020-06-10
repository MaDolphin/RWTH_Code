// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.*;
import travelcosts._cocos.TravelCostsASTTravelExpenseReportCoCo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArrivalBeforeDepartureCoCo implements TravelCostsASTTravelExpenseReportCoCo {

    protected static String message = "Departure starts before Arrival is completed";

    @Override public void check(ASTTravelExpenseReport node)  {
        ASTDuration arrivalDuration = node.getArrival().getDuration();
        LocalDateTime arrivalStart = getLocalDateTime(arrivalDuration.getStartDate(), arrivalDuration.getStartTime());

        ASTDuration departureDuration = node.getDeparture().getDuration();
        LocalDateTime departureStart = getLocalDateTime(departureDuration.getStartDate(), departureDuration.getStartTime());

        if (arrivalDuration.isPresentEndDate() || arrivalDuration.isPresentEndTime()) {
            if (arrivalDuration.isPresentEndTime()) {
                ASTISODate date = arrivalDuration.isPresentEndDate() ? arrivalDuration.getEndDate() : arrivalDuration.getStartDate();
                LocalDateTime arrivalEnd = getLocalDateTime(date, arrivalDuration.getEndTime());
                compare(departureStart, arrivalEnd);
            } else {
                LocalDate arrivalEnd = getLocalDate(arrivalDuration.getEndDate());
                compare(departureStart, arrivalEnd.atStartOfDay());
            }
        } else {
            compare(departureStart, arrivalStart);
        }
    }

    private void compare(LocalDateTime first, LocalDateTime end) {
        if (first.compareTo(end) <= 0) {
            Log.error(message);
        }
    }

    private LocalDateTime getLocalDateTime(ASTISODate date, ASTTime time) {
        return LocalDateTime.of(date.isPresentYear() ? date.getYear().getValue() : LocalDate.now().getYear(),
                date.getMonth().getValue(),
                date.getDay().getValue(),
                time.getHours().getValue(),
                time.isPresentMinutes() ? time.getMinutes().getValue() : 0);
    }

    private LocalDate getLocalDate(ASTISODate date) {
        return LocalDate.of(date.getYear().getValue(),
                date.getMonth().getValue(),
                date.getDay().getValue());
    }
}

