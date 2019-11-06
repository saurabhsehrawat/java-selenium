package reallife;
class StringReplaceUnwantedChars
{
	public static void main(String args[])
	{
		String str="(011)-421-422";
		//str=str.replaceAll("[()]","");
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}
}