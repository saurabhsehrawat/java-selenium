package inheritance;

class Dadaji
{
	int x=10;
}

class Beta extends Dadaji
{
	int x=20;
}

class Pota extends Beta
{
	int x=30;
	
	void show()
	{
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(((Dadaji)this).x);
		
	}
	
	public static void main(String args[])
	{
		Pota pp=new Pota();
		pp.show();
		Dadaji bb=new Pota();
		System.out.println(bb.x);
	}
	
}