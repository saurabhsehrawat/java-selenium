class New
{
	int show;
	Experi ex;
	void show(int show)
	{
		this.show=show;
	}
	void display()
	{
		System.out.println();
		System.out.println(show);
	}
	public static void main(String args[])
	{
	New nn=new New();
	nn.show(1);
	nn.display();
	}
}