package com.renato.model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TesteModel {

public static void main(String[] args) throws InterruptedException {
try {
Robot robot;
robot = new Robot();
int qtdPrograma = 4;
for(int i=1; i<= qtdPrograma; i++)
{ 
//qtd maxima
robot.keyPress(KeyEvent.VK_ALT);
for(int x1=1; x1<=i; x1++)
robot.keyPress(KeyEvent.VK_TAB);
    robot.delay(200);
    robot.keyRelease(KeyEvent.VK_ALT);
    for(int x2=1; x2<=i; x2++)
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(30000);
}
      for(int z=1; z<=60000; z++) //colocar aqui loop quantas vezes
      {
            robot.keyPress(KeyEvent.VK_ALT);
for(int x1=1; x1<=qtdPrograma; x1++)
robot.keyPress(KeyEvent.VK_TAB);
    robot.delay(200);
    robot.keyRelease(KeyEvent.VK_ALT);
    for(int x2=1; x2<=qtdPrograma; x2++)
    robot.keyRelease(KeyEvent.VK_TAB);
    
    robot.delay(30000);
      }
    
      
        
}
    
    catch (AWTException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
    


}

}

