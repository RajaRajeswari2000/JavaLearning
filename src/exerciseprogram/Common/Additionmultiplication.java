package exerciseprogram.Common;

public class Additionmultiplication {
	private int num1;
	private int num2;
	
	Additionmultiplication(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
    public int add() {//method overloading
  
         return num1+num2;
    	
    }
    public int add(int num3) {//method overloading
    	int add=0;
    	if(num3>0) {
		 add= num1+num2+num3;
    	}
		return add;
    }
    public int multiplication() {
         return num1*num2;
    }
    
}
