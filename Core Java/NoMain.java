class NoMain
{
	static
	{
		System.out.println("Static run before main method in java 6");
		//System.exit(2);      exits the program and don't allow main method to run
	}
	
	public static void main(String... s)
	{
		System.out.println("Main run first before static in java 8");
	}
}