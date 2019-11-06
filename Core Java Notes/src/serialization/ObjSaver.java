package serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjSaver
{
public static void main(String[] args)throws IOException
	{
			Student s1=new Student(101,"Abhishek","Java");
			Student s2=new Student(102,"Naren","Testing");
			Student s3=new Student(103,"Sandeep","SAS");
			
			System.out.println("following object are serializable" );
			s1.display();
			s2.display();
			s3.display();
			
ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("c:\\abhishek\\std.data"));
			o.writeObject(s1);
			o.writeObject(s2);
			o.writeObject(s3);
			
			System.out.println("object are successfully written to a file");
	}

}
