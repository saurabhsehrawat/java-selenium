package Threads;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

class MeraTask extends TimerTask
{
	public void run()
	{
		JFrame ff=new JFrame();
		ff.setSize(400,400);
		ff.setVisible(true);
	}
}
public class MyTimeTask 
{
	public static void main(String args[])
	{
		Timer timer=new Timer();
		timer.scheduleAtFixedRate(new MeraTask(),5000 , 3000);
		
	}
	
}
