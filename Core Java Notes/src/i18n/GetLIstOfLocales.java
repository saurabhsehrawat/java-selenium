package i18n;

import java.util.Locale;

public class GetLIstOfLocales 
{
	public void getLocale()
	{
		String[] locales=Locale.getISOCountries();
		
		for(String countryCode:locales)
		{
			Locale obj=new Locale("",countryCode);
			System.out.println("Country Code: "+obj.getCountry()+", Country Name="+obj.getDisplayCountry());
			
		}
		System.out.println("Done");
	}
	
	public static void main(String args[])
	{
		GetLIstOfLocales gll=new GetLIstOfLocales();
		gll.getLocale();
	}

}
