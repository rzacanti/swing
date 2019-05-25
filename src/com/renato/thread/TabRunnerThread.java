package com.renato.thread;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.renato.model.RunnerModel;

public class TabRunnerThread implements Runnable {

    @Override
    public void run() {
        try {
            Robot robot = new Robot();
            while (RunnerModel.go) {
            	robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.delay(200);
				robot.keyRelease(KeyEvent.VK_ALT);
				robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(RunnerModel.timer);                
            }
        } catch (AWTException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}