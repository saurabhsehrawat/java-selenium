//Serializable, saving state  of an object, ObjectOutputStream, ObjectInputStream
//Interface: Serializable, marker interface, interface which is blank with no methods
//Serializable process is for non static data members only
import java.io.*;

class Student implements Serializable
{
	int id;
	String name, course;
	public Student(int id, String name, String course)
	{
		this.id=id;
		this.name=name;
		this.course=course;
	}
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+course);
	}
}

public class WriteObj
{
	public static void main(String a[]) throws IOException, ClassNotFoundException
	{
		Student s1=new Student(23,"Saurabh","Java");
		Student s2=new Student(2,"Komal","MPO");
		Student s3=new Student(34,"Sakshi","Lecturer");
		System.out.println("These objects are serializable....");
		s1.display();
		s2.display();
		s3.display();
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("abc.txt"));
		o.writeObject(s1);
		o.writeObject(s2);
		o.writeObject(s3);
		System.out.println("Objects are successfully written to a file....");
		ObjectInputStream n=new ObjectInputStream(new FileInputStream("abc.txt"));
		s1=(Student)n.readObject();
		s2=(Student)n.readObject();
		s3=(Student)n.readObject();
		System.out.println("These objects are deserializable....");
		s1.display();
		s2.display();
		s3.display();
	}
}