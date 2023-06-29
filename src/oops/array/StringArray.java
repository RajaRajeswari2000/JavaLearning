package oops.array;

public class StringArray {
	String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public void lengthOfDays() {
		String daysWithLongChar=" ";
		for(int i=0;i<days.length;++i) {
			if(daysWithLongChar.length() <= days.length) {
			daysWithLongChar=days[i];
			}
		}
		System.out.println(daysWithLongChar);
	}
	public void reverseTheDays() {
		for(int i=days.length-1;i>=0;--i) {
			System.out.println(days[i]);
		}
		
	}

}
