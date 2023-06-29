package oops.inheritance;

public class PersonRunner {

	public static void main(String[] args) {
		// Person obj =new Person();
		Employee person1 = new Employee();
		Employee person = new Employee("raji");
		boolean result = person instanceof Person;// check whether obj is an instance of class or not.
		System.out.println(result);
		person.setTitle("software engineer");
		person.setEmployer("manager");
		person.setEmployerGrade('A');
		person.setSalary(38000);
		person.setPhone("7339640429");
		person.setEmail("rajeshwarimeera0503@gmail.com");
		String value = person.toString();
		System.out.println(value);
	}

}
