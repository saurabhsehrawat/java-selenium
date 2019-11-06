import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ran extends JFrame implements ActionListener {
/**
* 
*/
private static final long serialVersionUID = 1L;
/**
* @param args
*/
JFrame f1,f2;
JButton b1;
JLabel l1;
String s1;
Ran()
{
f1 = new JFrame("1st Form");
f2 = new JFrame("2nd Form");
b1 = new JButton("Click");
s1 = "Hello\n"+"HI";
l1 = new JLabel(s1);
b1.addActionListener(this);
}
public void Show()
{
f1.setSize(1025,585);
f1.setLayout(null);
f1.add(b1);
b1.setBounds(200,200, 100, 50);
f1.setVisible(true);
f2.setSize(1025,585);
f2.setLayout(null);
f2.add(l1);
l1.setBounds(200, 200, 100, 50);
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Ran obj = new Ran();
obj.Show();
}
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
if(e.getSource()==b1)
{
f2.setVisible(true);
}
}
}