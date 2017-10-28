import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

 class JakesHack2 implements Runnable {

	 Robot robot; 
	 public JakesHack2() throws AWTException{
		 robot= new Robot();
	 }
    public void run() {
   	
		while(true){

			try {
/*				robot.keyRelease(KeyEvent.VK_D);
				robot.keyPress(KeyEvent.VK_W);
				TimeUnit.SECONDS.sleep(1);
				robot.keyRelease(KeyEvent.VK_W);
				robot.keyPress(KeyEvent.VK_A);
				TimeUnit.SECONDS.sleep(0.5);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyPress(KeyEvent.VK_S);
				TimeUnit.SECONDS.sleep(1);
				robot.keyRelease(KeyEvent.VK_S);
				robot.keyPress(KeyEvent.VK_D);
				TimeUnit.SECONDS.sleep(1);*/
				robot.keyPress(KeyEvent.VK_W);
				Thread.sleep(1000);
				robot.keyRelease(KeyEvent.VK_W);
				Thread.sleep(20000);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(20);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(5000);
/*				robot.keyPress(KeyEvent.VK_W);
				Thread.sleep(125);
				robot.keyRelease(KeyEvent.VK_W);*/
/*				robot.keyPress(KeyEvent.VK_S);
				Thread.sleep(125);
				robot.keyRelease(KeyEvent.VK_S);*/
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("HAI. IMMA SPAM U.");
		}
    }
}


 class MoneyEarner2 {
	public volatile static String command;
	static Thread jThread ;
	public static void main(String[] args) throws AWTException, InterruptedException {
		Thread.sleep(5000);
		JakesHack2 jHack = new JakesHack2();
		jThread = new Thread(jHack);
		jThread.start();

	}


}