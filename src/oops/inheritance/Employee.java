package oops.inheritance;

public class Employee extends Person {
 private String title;
 private String employer;
 private char employerGrade;
 private int salary;
 Employee(){
	 //implicitly super();
	 super();
	 System.out.println("constructor2");
 }
 
 Employee(String name) {
	 super(name);//The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods)
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getEmployer() {
	return employer;
}
public void setEmployer(String employer) {
	this.employer = employer;
}
public char getEmployerGrade() {
	return employerGrade;
}
public void setEmployerGrade(char employerGrade) {
	this.employerGrade = employerGrade;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
 public String toString() {
	 return super.toString()+" "+title+" "+" "+employer+" "+employerGrade+" "+salary;
 }
 
}
