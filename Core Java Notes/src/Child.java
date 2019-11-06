class Base
{
	int x=10;
	int y=20;
	
}
public class Child extends Base {
int x=30;
	public static void main(String args[])
	{
		Base bb=new Child();
		System.out.println(bb.x);
		boolean bool[]=new boolean[10];
		boolean bool2[]=new boolean[10];
		System.out.println(bool[0]);
		System.out.println(bool[10]);
	}
}
