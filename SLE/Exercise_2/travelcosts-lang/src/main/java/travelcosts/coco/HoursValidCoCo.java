// (c) https://github.com/MontiCore/monticore
package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.*;
import travelcosts._cocos.TravelCostsASTTravelExpenseReportCoCo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HoursValidCoCo implements TravelCostsASTTravelExpenseReportCoCo {

    protected static String message = "Hours not valid";

    @Override
    public void check(ASTTravelExpenseReport node) {
        ASTDuration arrivalDuration = node.getArrival().getDuration();
        ASTTime arrivalStartTime = node.getArrival().getDuration().getStartTime();

        int arrivalStartHours = arrivalStartTime.getHours().getValue();
        compare(arrivalStartHours);


        ASTDuration departureDuration = node.getDeparture().getDuration();
        ASTTime departureStartTime = node.getDeparture().getDuration().getStartTime();

        int departureStartHours = departureStartTime.getHours().getValue();
        compare(departureStartHours);


        if (node.isPresentAllWorkDays()) {
            //  ASTAllWorkDays days = node.getAllWorkDays();
            // LocalTime start = getLocalTime(days.getBeginTime());
            ASTTime start = node.getAllWorkDays().getBeginTime();
            //  LocalTime end = getLocalTime(days.getEndTime());
            ASTTime end = node.getAllWorkDays().getBeginTime();

            int startHours = start.getHours().getValue();
            int endHours = end.getHours().getValue();
            compare(startHours);
            compare(endHours);
        } else {
            for (ASTWorkDay s : node.getWorkDayList()) {
                ASTDuration duration = s.getDuration();
                // LocalTime start = getLocalTime(duration.getStartTime());
                ASTTime start = duration.getStartTime();
                int startHours = start.getHours().getValue();
                compare(startHours);

                if (arrivalDuration.isPresentEndTime()) {
                    //LocalTime end = getLocalTime(duration.getEndTime());
                    ASTTime end = duration.getEndTime();
                    int endHours = end.getHours().getValue();
                    compare(endHours);
                }

            }
        }
    }


    private void compare(LocalTime first) {
        if (first.getHour() > 23) {
            Log.error(message);
        }
    }

    private void compare(int first) {
        if (first > 23) {
            Log.error(message);
        }
    }


    private LocalTime getLocalTime(ASTTime time) {
        return LocalTime.of(time.getHours().getValue(), time.isPresentMinutes() ? time.getMinutes().getValue() :
                00);

    }
}


// (c) https://github.com/MontiCore/monticore
/*package travelcosts.coco;

import de.se_rwth.commons.logging.Log;
import travelcosts._ast.*;
import travelcosts._cocos.TravelCostsASTTravelExpenseReportCoCo;

import java.time.LocalTime;

public class HoursValidCoCo implements TravelCostsASTTravelExpenseReportCoCo {

    protected static String message = "Hours not valid";

    @Override public void check(ASTTravelExpenseReport node) {
        ASTDuration arrivalDuration = node.getArrival().getDuration();
        ASTTime startTime = node.getArrival().getDuration().getStartTime();

            int arrivalHours = startTime.getHours().getValue();
            compare(arrivalHours);
        if(arrivalHours!=666) {
            return;
        }


        ASTDuration departureDuration = node.getDeparture().getDuration();
        ASTTime departureTime = node.getArrival().getDuration().getStartTime();
        int startHours = startTime.getHours().getValue();
        compare(departureTime);

        if(arrivalDuration.isPresentEndTime()) {
            LocalTime departureEnd = getLocalTime(departureDuration.getEndTime());
            compare(departureEnd);
        }

        if(node.isPresentAllWorkDays()){
            ASTAllWorkDays days = node.getAllWorkDays();
            LocalTime start = getLocalTime(days.getBeginTime());
            LocalTime end = getLocalTime(days.getEndTime());
            compare(start);
            compare(end);
        }
        else{
            for(ASTWorkDay s : node.getWorkDayList()){
                ASTDuration duration = s.getDuration();
                LocalTime start = getLocalTime(duration.getStartTime());
                compare(start);

                if(arrivalDuration.isPresentEndTime()) {
                    LocalTime end = getLocalTime(duration.getEndTime());
                    compare(end);
                }

            }
        }
    }


    private void compare(LocalTime first) {
        if(first.getHour() > 23){
            Log.error(message);
        }
    }
    private void compare(int first) {
        if(first > 23){
            Log.error(message);
        }
    }


    private LocalTime getLocalTime(ASTTime time) {
        return LocalTime.of(time.getHours().getValue(), time.isPresentMinutes() ? time.getMinutes().getValue() :
                00);

    }
}
*/