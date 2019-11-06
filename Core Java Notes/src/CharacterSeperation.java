
public class CharacterSeperation 
{	
	public static void main(String s[])
	{
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digitCount=0;
		String ss="This is My String 98";
		for(int i =0;i<ss.length();i++)
		{
		char ch=ss.charAt(i);
		if(Character.isLowerCase(ch))
		{
			System.out.println("LowerCase Character"+":"+ss.charAt(i));
			lowerCaseCount++;
			
		}
		if(Character.isUpperCase(ch))
		{
			System.out.println("UpperCase Character"+":"+ss.charAt(i));
			upperCaseCount++;
		}
		if(Character.isDigit(ch))
		{
			System.out.println("Digits"+":"+ss.charAt(i));
			
			digitCount++;
		}
		}
		System.out.println("No. of UpperCase chars"+":"+upperCaseCount);
		System.out.println("No. of LowerCase chars"+":"+lowerCaseCount);
		System.out.println("No. of Digits"+":"+digitCount);
	}

}
