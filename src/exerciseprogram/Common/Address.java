package exerciseprogram.Common;

public class Address {
	String line1;
	String city;
	String zip;
	Address(String line1,String city,String zip){
		this.line1=line1;
		this.city=city;
		this.zip=zip;
	}
	public String toString() {
		return line1+" "+city +" "+zip;
	}

}
