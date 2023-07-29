package exerciseprogram.conditionalAndLoop;

public class LeapYear {
	public boolean isLeapYear(int year) {
		if(year!=0) {
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
                
            }else{
                return true;
            }
        }else {
        	return false;
        }
		}
       return false;
    }

	public static void main(String[] args) {
		
		LeapYear yearCheck=new LeapYear();
        boolean checked= yearCheck.isLeapYear(1881);
        System.out.println(checked);
		// TODO Auto-generated method stub

	}

}
