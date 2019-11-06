package awt;

import java.awt.event.*;

public class Outer implements ActionListener
{

MyFrame2 mf;

Outer(MyFrame2 mf)
{
	this.mf=mf;
}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==mf.b1);
		mf.tf.setText("Helloo from outer");	
	}

}
