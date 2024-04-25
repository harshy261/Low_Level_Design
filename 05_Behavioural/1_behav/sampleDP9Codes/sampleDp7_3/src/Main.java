import cmdPattern.*;
import corPattern.AbstractHandler;
import corPattern.EngineIssueHandler;
import corPattern.PressureIssueHandler;
import corPattern.PressureIssueRequest;

public class Main {
    public static void main(String[] args) {



        //cmdPattern

        //setting up the system
        BreakMechanism breakMechanism = new BreakMechanism();
        AirSuspensionMechanism airSuspensionMechanism = new AirSuspensionMechanism();

        EngageBreakCommand breakCmd = new EngageBreakCommand(breakMechanism);
        AirSuspensionCommand airCmd = new AirSuspensionCommand(airSuspensionMechanism);

        Panel btnPanel = new Panel();

        btnPanel.setCommand(0, airCmd);
        btnPanel.setCommand(1, breakCmd);

        ///try different buttons
        //btnPanel.liftSuspension();
        btnPanel.applyBreak();


        //corPattern
        //sabse pehle chain create kardo

//        AbstractHandler pressureHandler = new PressureIssueHandler(null);
//        EngineIssueHandler engineIssueHandler = new EngineIssueHandler(pressureHandler);
//
//        //request re4ady karo
//        PressureIssueRequest pressureIssueRequest = new PressureIssueRequest();
//
//        engineIssueHandler.handleRequest(pressureIssueRequest);


//        // int[][] locationTejas;
//        Tejas plane = new Tejas();
//        for(int i=0; i<5; i++) {
//            //fetch src location from location array
//            int srcX = 5;
//            int srcY = 10;
//
//            int destX = 100;
//            int destY = 515;
//            int speed = 15;
//            System.out.println("Time: " +
//                    plane.getTotalTimeToReachDestination(srcX, srcY, destX, destY, speed));
//        }
    }
}