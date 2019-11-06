
public class LocalVariable {
	
	int x;
	void show()
	{
		int y;
		System.out.println(x);
		//System.out.println(y);
	}
	
	public static void main(String args[])
	{
		LocalVariable ll=new LocalVariable();
		ll.show();
		
	}

}
