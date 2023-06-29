package oops.methodOverloading;

public class Tablerunner {
	public void printMultiTable()
	{
		printMultiTable(5);
		//for(int i=0;i<=10;++i) {
			//System.out.printf("%d*%d=%d",i,5,i*5).println();
		//}
		
	}
	public void printMultiTable(int number)
	{
		for(int i=0;i<=number;++i) {
			System.out.printf("%d*%d=%d",i,number,i*number).println();
		}
		
	}
	public void printMultiTable(int number1,int number2)
	{
		for(int i=0;i<=number1;++i) {
			if(number1 !=number2) {
			System.out.printf("%d*%d=%d",i,number1,i*number1).println();
		}}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablerunner print=new Tablerunner();
 print.printMultiTable();
 print.printMultiTable(6);
 print.printMultiTable(8,7);
 
	}

}
