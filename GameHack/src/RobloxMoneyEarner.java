import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

 class JakesHack implements Runnable {

	 Robot robot; 
	 public JakesHack() throws AWTException{
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
/*				robot.keyPress(KeyEvent.VK_W);
				Thread.sleep(125);
				robot.keyRelease(KeyEvent.VK_W);*/
				robot.keyPress(KeyEvent.VK_A);
				Thread.sleep(50);
				robot.keyRelease(KeyEvent.VK_A);
/*				robot.keyPress(KeyEvent.VK_S);
				Thread.sleep(125);
				robot.keyRelease(KeyEvent.VK_S);*/
				Thread.sleep(500);
				robot.keyPress(KeyEvent.VK_D);
				Thread.sleep(50);
				robot.keyRelease(KeyEvent.VK_D);
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("HAI. IMMA SPAM U.");
		}
    }
}


 class RobloxMoneyEarner implements NativeMouseInputListener {
	public volatile static String command;
	static Thread jThread ;
	public static void main(String[] args) throws AWTException, InterruptedException {
		Thread.sleep(5000);
		JakesHack jHack = new JakesHack();
		jThread = new Thread(jHack);
		jThread.start();

		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		try{
			GlobalScreen.registerNativeHook();
			// Construct the example object.
			RobloxMoneyEarner example = new RobloxMoneyEarner();

			// Add the appropriate listeners.
			GlobalScreen.addNativeMouseListener(example);
			GlobalScreen.addNativeMouseMotionListener(example);

		}catch(Exception e){
			System.out.println("ERROR=   "+e.getMessage());
		}
	}
	@Override
	public void nativeMouseClicked(NativeMouseEvent event) {
		// TODO Auto-generated method stub
		try{
			jThread.interrupt();
		}catch(Exception e){}
		
		System.exit(0);
		
	}
	@Override
	public void nativeMousePressed(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nativeMouseReleased(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nativeMouseDragged(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nativeMouseMoved(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
