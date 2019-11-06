class Dadaji
{
	void show()
	{
		System.out.println("Hello from dadaji");
	}
}

class Beta extends Dadaji
{
	void show()
	{
		System.out.println("Hello from beta");
	}
}

class Pota extends Beta
{
	void show()
	{
		System.out.println("Hello form Pota");
	}
public static void main(String args[])
{
	Dadaji dd=new Dadaji();
	dd.show();
	
	Dadaji d2=new Beta();
	d2.show();
	
	Beta bb=new Pota();
	bb.show();
}

}
