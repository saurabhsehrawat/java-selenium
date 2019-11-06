import java.awt.event.*;
import javax.swing.*;
public class TestFrame extends JFrame implements ActionListener
{
	JFrame jf;
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton jb1,jb2;
	
	TestFrame(String s)
	{
		super(s);
		jf=new JFrame();
		
		l1=new JLabel("Here is your text");
		l1.setBounds(20,20,200,50);
		jf.add(l1);
		
		tf1=new JTextField();
		tf1.setBounds(300,20,150,50);
		jf.add(tf1);
		
		jb1=new JButton("Hello");
		jb1.setBounds(300, 200, 150,50);
		jb1.addActionListener(this);
		jf.add(jb1);
		
		
		jb2=new JButton("Hiiii");
		jb2.setBounds(100,200,150,50);
		jb2.addActionListener(this);
		
		jf.add(jb2);
		
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==jb2)
	{
		tf1.setText("Hiiiiiiii");
	}
	if(ae.getSource()==jb1)
	{
		tf1.setText("Hello Admin");
	}
	}

	public static void main(String args[])
	{
		new TestFrame("My Frame");
	}
}
