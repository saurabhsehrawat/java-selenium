package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjReader
{
public static void main(String[] args)throws IOException, ClassNotFoundException
{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:\\abhishek\\std.data"));
System.out.println("following object are deserializable");
			
Student s4=(Student)in.readObject();
Student s5=(Student)in.readObject();
Student s6=(Student)in.readObject();
			
	s4.display();
	s5.display();
	s6.display();
			
		}

}
