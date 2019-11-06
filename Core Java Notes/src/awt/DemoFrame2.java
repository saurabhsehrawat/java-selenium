package awt;

import java.awt.*;
import java.awt.event.*;
public class DemoFrame2
{
Frame f;
Button b;
Label l;
TextField tf;

DemoFrame2(String s)
{
f=new Frame(s);

l=new Label("Enter The Number");
l.setBounds(20, 20, 120, 50);
f.add(l);

tf=new TextField();
tf.setBounds(20,90 , 80, 30);
f.add(tf);
//f.addWindowListener(new WindowAdapter () {
	//public void windowClosing ( WindowEvent evt )
	//{
	//	System.exit(0);
	//}
//});
b=new Button("OK");
b.setBounds(20,140, 100, 50);
b.setBackground(Color.YELLOW);
f.add(b);

f.setLayout(null);
f.setSize(400, 400);
f.setVisible(true);
}

public static void main(String args[])
{
	DemoFrame2 dd=new DemoFrame2("my Second Frame");
}
}
