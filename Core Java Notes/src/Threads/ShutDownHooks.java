package Threads;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class ShutDownHooks
{
	  public static void main(String[] args)
	  {
		  
		Thread tt=new Thread();  
	    System.out.println( "Running Main Application..." );
	    Runtime.getRuntime().addShutdownHook( new Hook() );
	    JFrame jf=new JFrame();
	    
	    JLabel jl=new JLabel("Exiting");
	    jl.setBounds(200,200,100,100);
	    jf.add(jl);
	    
	    jf.setLayout(null);
	    jf.setSize(400,400);
	    jf.setVisible(true);
	    System.out.println("Exiting");
	  }

	  private static class Hook extends Thread
	  {
	    public void run()
	    {
	      System.out.println( "Running Clean Up..." );
	    }
	  }
}
