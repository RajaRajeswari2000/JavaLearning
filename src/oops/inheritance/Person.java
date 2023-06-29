package oops.inheritance;

public class Person {
  private String name;
  private String phone;
  private String email;
Person(){
	System.out.println("constructor1");
}
public Person(String name) {
	super();
	this.name = name;
}


public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  public String toString() {
	  return name+" "+phone+" "+email;
  }

}
