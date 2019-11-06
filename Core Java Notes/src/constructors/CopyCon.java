package constructors;

class CopyCon
{
	int x;
	int y;
	
	CopyCon(int x, int y)
	{
		this.x=x;
		this.y=y;	
	}
	
	
	CopyCon(CopyCon z)
	{
		x=z.x;
		y=z.y;
	}
	
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[])
	{
		CopyCon cc=new CopyCon(10,20);
		cc.show();
		CopyCon cc2=new CopyCon(cc);
		cc2.show();
		
	}
	
	
	
}