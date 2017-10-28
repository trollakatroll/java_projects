import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AutoClicker {

   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
               Thread.sleep(100);
               robot.mousePress(InputEvent.BUTTON1_MASK);
               robot.mouseRelease(InputEvent.BUTTON1_MASK);
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}