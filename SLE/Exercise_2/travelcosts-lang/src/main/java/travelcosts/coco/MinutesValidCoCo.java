// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.*;
import travelcosts._cocos.TravelCostsASTTravelExpenseReportCoCo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MinutesValidCoCo implements TravelCostsASTTravelExpenseReportCoCo {

    protected static String message = "Minutes not valid";

    @Override
    public void check(ASTTravelExpenseReport node) {
        ASTDuration arrivalDuration = node.getArrival().getDuration();
        ASTTime arrivalStartTime = node.getArrival().getDuration().getStartTime();

        int arrivalStartMinutes = arrivalStartTime.getMinutes().getValue();
        compare(arrivalStartMinutes);


        ASTDuration departureDuration = node.getDeparture().getDuration();
        ASTTime departureStartTime = node.getDeparture().getDuration().getStartTime();

        int departureStartMinutes = departureStartTime.getMinutes().getValue();
        compare(departureStartMinutes);


        if (node.isPresentAllWorkDays()) {
          //  ASTAllWorkDays days = node.getAllWorkDays();
           // LocalTime start = getLocalTime(days.getBeginTime());
            ASTTime start = node.getAllWorkDays().getBeginTime();
          //  LocalTime end = getLocalTime(days.getEndTime());
            ASTTime end = node.getAllWorkDays().getBeginTime();

            int startMinutes = start.getMinutes().getValue();
            int endMinutes = end.getMinutes().getValue();
            compare(startMinutes);
            compare(endMinutes);
        } else {
            for (ASTWorkDay s : node.getWorkDayList()) {
                ASTDuration duration = s.getDuration();
               // LocalTime start = getLocalTime(duration.getStartTime());
                ASTTime start = duration.getStartTime();
                int startMinutes = start.getMinutes().getValue();
                compare(startMinutes);

                if (arrivalDuration.isPresentEndTime()) {
                    //LocalTime end = getLocalTime(duration.getEndTime());
                    ASTTime end = duration.getEndTime();
                    int endMinutes = end.getMinutes().getValue();
                    compare(endMinutes);
                }

            }
        }
    }


    private void compare(LocalTime first) {
        if (first.getMinute() > 59) {
            Log.error(message);
        }
    }

    private void compare(int first) {
        if (first > 59) {
            Log.error(message);
        }
    }


    private LocalTime getLocalTime(ASTTime time) {
        return LocalTime.of(time.getHours().getValue(), time.isPresentMinutes() ? time.getMinutes().getValue() :
                00);

    }
}
