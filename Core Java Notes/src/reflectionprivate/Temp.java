package reflectionprivate;
import java.lang.reflect.*;
 
 class PrivateObject
 {
	 private String privateString=null;
	 
	 public PrivateObject(String privateString)
	 {
		 this.privateString=privateString;
	 } 
 }
public class Temp
{
	public static void main(String args[]) throws SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException
	{
		PrivateObject pri=new PrivateObject("The Private String value");
		
		//NoSuchFieldException, SecurityException
		Field privateStringField=PrivateObject.class.getDeclaredField("privateString");
		
		// throws SecurityException
		privateStringField.setAccessible(true);
		
		//throws IllegalArgumentException, IllegalAccessException
		String fieldvalue=(String)privateStringField.get(pri);
		System.out.println("Field value = "+ fieldvalue);
		
	}

}
