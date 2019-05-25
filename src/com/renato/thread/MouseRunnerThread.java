package com.renato.thread;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.renato.model.RunnerModel;

public class MouseRunnerThread implements Runnable {

    @Override
    public void run() {
        try {
            Robot robot = new Robot();
            while (RunnerModel.go) {
            	robot.mouseMove(400, 300);
				robot.delay(200);
				robot.mouseMove(400, 400);
                robot.delay(RunnerModel.timer);                
            }
        } catch (AWTException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}