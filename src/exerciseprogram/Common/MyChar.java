package exerciseprogram.Common;

public class MyChar {
	char ch1;
	public MyChar(char ch1) {
		this.ch1=ch1;
			}
    public void isVowel() {
		if(ch1== 'A'||ch1=='a'||ch1== 'E'||ch1=='e'||ch1== 'I'||ch1=='i'||ch1== 'O'||ch1=='o'||ch1== 'U'||ch1=='u') {
			System.out.println("isvowel");
			}else {
		System.out.println("notvowel");}
		
}

	public boolean isDigit() {
		if(ch1>49&&ch1<57)
		return true; 
			return false;
	}
	
	public boolean isAlphabet() {
		if(ch1>=65&&ch1<=90||ch1>=97&&ch1<=122) //A TO Z
		return true; 
	    return false;
	
	}

	 public void printLowerCaseAlphabets() {
		for(char ch='a';ch<='z';++ch) {
			System.out.println(ch);
		}
		
	}

	public void printUpperCaseAlphabets() {
		for(char ch='A';ch<='Z';++ch) {
			System.out.println(ch);
		}
		
	}

}