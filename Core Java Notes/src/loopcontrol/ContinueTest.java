package loopcontrol;

public class ContinueTest
{
	public static void main(String args[])
	{
		int number[]={10,11,12,13,14,15};
		for(int x:number)
		{
			if(x==13)
			{
				continue;
			}
			System.out.println(x);
		}
	}

}
