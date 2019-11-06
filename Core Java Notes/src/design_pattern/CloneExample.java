package design_pattern;
class Employee implements Cloneable {
 
 private String name;
 private String designation;
 
 public Employee()
 {
 setDesignation("Programmer");
 setName("Laalu Yadav");
 
 }
 public String getDesignation() {
 return designation;
 }
 
 public void setDesignation(String designation) {
 this.designation = designation;
 }
 
 public String getName() {
 return name;
 }
 
 public void setName(String name) {
 this.name = name;
 }
 
 public Object clone() throws CloneNotSupportedException
 {
 return super.clone();
 }
}
 
public class CloneExample {
 public static void main(String arg[]){
 Employee laalu = new Employee();
 try {
 Employee chhotu = (Employee) laalu.clone();
 chhotu.setName("Kaalu Yadav");
 System.out.println(laalu.getName());
 System.out.println(chhotu.getName());
 System.out.println(chhotu.getDesignation());
 } catch (CloneNotSupportedException cnse) {
 System.out.println("Cloneable should be implemented. " + cnse );
 }
 }
}