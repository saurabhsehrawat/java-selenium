import java.util.*;
class AskMe
{
	int i=10;
	public AskMe()
	{
		i=20;
	}
	void show()
	{
		System.out.println(i);
	}
	public static void main(String args[])
	{
		//Calendar cc=Calendar.getInstance();
		//Date date=cc.getTime();
		//System.out.println(date);
		//System.out.println(3+7);
		//System.out.println(""+3+7+"");
		AskMe ask=new AskMe();
		ask.show();
	}
}