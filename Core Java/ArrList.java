import java.util.ArrayList;
import java.util.*;
public class ArrList{
	void display()
	{
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Manish");
		a1.add("Saurabh");
		a1.add("Akshay");
		a1.add("Sumi");
		a1.add(2,"Neha");
		System.out.println(a1);

		ArrayList<String> a2= new ArrayList<>();
		a2.add("Hello");
		a2.add("Bye");
		a2.add(0,"Hi");
		a1.addAll(a2);
		System.out.println("After adding...."+a1);
	}
	public static void main(String[] args)
	{
		ArrList ab=new ArrList();
		ab.display();
	}
}
