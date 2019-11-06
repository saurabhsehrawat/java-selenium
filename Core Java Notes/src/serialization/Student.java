package serialization;
import java.io.Serializable;

public class Student implements Serializable
{
		int id;
		String name,course;
		public Student(int id, String name, String course)
		{
			this.id = id;
			this.name = name;
			this.course = course;
		}
		public void display()
		{
			System.out.println(id+"\t"+name+"\t"+course);
		}

}
