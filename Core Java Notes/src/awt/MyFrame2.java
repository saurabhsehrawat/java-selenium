package awt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame2 implements ActionListener
{
	JFrame f;
	JButton b1,b2;
	JTextField tf;
	
	MyFrame2(String s)
	{
		f=new JFrame(s);
		
		b1=new JButton("Hello");
		b2=new JButton("Cancel");
		tf=new JTextField();
		tf.setBounds(20,40,200,30);
		f.add(tf);
		
		b1.setBounds(20,70,70,30);
		f.add(b1);
		
		b2.setBounds(100,70,90,30);
		f.add(b2);
		
		b1.addActionListener(this);
		//Outer o=new Outer(this);
		
		//b1.addActionListener(o);
		
		
		//b1.addActionListener(new ActionListener()
		//{public void actionPerformed(ActionEvent ae)
		//{if(ae.getSource()==b1)
		//	tf.setText("anonymous");}});
			
		b2.addActionListener(this);
		
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			//tf.setText(" ");
			tf.setText("You pressed Hello Button");
		if(ae.getSource()==b2)
			tf.setText("You pressed cancel button");
	}
	public static void main(String args[])
	{
	new MyFrame2("my frame");
		
	}
	

}
