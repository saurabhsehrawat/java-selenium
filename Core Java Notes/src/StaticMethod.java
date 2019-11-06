
public class StaticMethod 
{
	static int x=10;
	
	void show1()
	{
		x=x+20;
		System.out.println(x);
	}
	
	static void show()
	{
		//x=x+20;
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
	StaticMethod st=new StaticMethod();
	
	st.show1();
	show();
	}

}
