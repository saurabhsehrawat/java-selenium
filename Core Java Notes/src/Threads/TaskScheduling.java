package Threads;

import java.awt.*;
import java.util.*;

public class TaskScheduling extends TimerTask
{
	public void run()
	{		
		Frame f=new Frame();
		f.setSize(250,250);
		f.setVisible(true);
	}
public static void main(String args[])
{
	Timer time=new Timer();
	TaskScheduling tt=new TaskScheduling();
	time.scheduleAtFixedRate(tt,5000,3000);
	
	//time.scheduleAtFixedRate(new TaskScheduling(),5000,3000);
}
	
}
