public class InitStatic {
	{
		System.out.println("Init block");
	}//block with no name is INIT block, it executes after static but before constructor

	static//static block 
	{
		System.out.println("Hello Static");
	}
	}