package oops.string;// string is a class

public class Stringrunner {
	String str="this is special class in java";
	
	public void runnerSomePuzzle()
	{
		System.out.println(str.length());
		System.out.println(str.substring(5));
		//indexOf() contains() equals()
		System.out.println(str.indexOf("class"));
		System.out.println(str.contains("is"));
		System.out.println(str.equals("this is special class in java"));
		System.out.println(str.isEmpty());
		System.out.println(str.concat("-called string"));
		//immutability-once a instance of string class is created with a specific value-not able to change the specific value;
		System.out.println(str);
		System.out.println(str.toUpperCase());//toLowerCase();
		System.out.println(str + "=called STRING");
		for(int i=0;i<=str.length();++i) {
			System.out.print(str.toCharArray());		}
		// IF YOU WANT TO WHAT METHOD TO USE--- string variable.
		//Stringbuffer
		//syntax
		//Stringbuffer str=new Stringbuffer("test");---mutable(change the specific value)
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringrunner run=new Stringrunner();
		run.runnerSomePuzzle();
	}

}
