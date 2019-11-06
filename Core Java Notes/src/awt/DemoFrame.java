package awt;
import java.awt.*;

public class DemoFrame
{
Frame f;
DemoFrame(String s)
{
	f=new Frame(s);
	f.setSize(400,400);
	f.setBackground(Color.RED);
	f.setVisible(true);
}

public static void main(String args[])
{

	DemoFrame df=new DemoFrame("My Frame via Association");
}	
}
