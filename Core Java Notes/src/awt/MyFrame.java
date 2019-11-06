package awt;
import java.awt.*;
import javax.swing.*;
// Via Inheritance
public class MyFrame extends Frame
{
	MyFrame(String s)
	{
		super(s);
		setLayout(null);
		setSize(400,400);
		//getContentPane().setBackground(Color.RED);	
		setVisible(true);
	}
	public static void main(String args[])
	{	
		MyFrame f=new MyFrame("My First Frame");
		MyFrame f1=new MyFrame("My Second Frame");
		MyFrame f2=new MyFrame("My Third Frame");
	}
	
	
}
