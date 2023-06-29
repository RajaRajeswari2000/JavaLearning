package exerciseprogram.Common;

public class Booksrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     System.out.println("noOfCopies");
             Books javabook=new Books(36);
	         Books artOfComputerProgramming =new Books(40);
	         Books effectiveJava =new Books(30);
	         Books cleanCode  =new Books(20);
	         System.out.println(artOfComputerProgramming.getnoOfCopies());
	         System.out.println(effectiveJava.getnoOfCopies());
	         System.out.println(cleanCode.getnoOfCopies());
	         System.out.println(javabook.getnoOfCopies());
	         
	         System.out.println("after restoring: ");
	         artOfComputerProgramming.setnoOfCopies(30);
	         artOfComputerProgramming.increasenoOfCopies(10);
	         artOfComputerProgramming.decreasenoOfCopies(45);
	         System.out.println(artOfComputerProgramming.getnoOfCopies());
	         effectiveJava.setnoOfCopies(10);
	         System.out.println(effectiveJava.getnoOfCopies());
	         cleanCode.setnoOfCopies(280);
	         System.out.println(cleanCode.getnoOfCopies());
	        

	}

}
