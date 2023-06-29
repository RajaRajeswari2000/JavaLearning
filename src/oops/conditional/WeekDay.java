package oops.conditional;

public class WeekDay {
 int number;
 WeekDay(int number){
	 this.number=number;
 }
 public String isWeekday() {
	 switch(number) {
	 case 0:
    	 return "sunday";
     case 1:
    	 return "monday";
     case 2:
    	 return "tuesday";
     case 3:
    	 return "wednesday";
     case 4:
    	 return "thursday";
     case 5:
    	 return "friday";
     case 6:
    	 return "saturday";
    			 }
	 return "invalid";
 }
}

//case 0:
	 //System.out.println("no,this is weekend");
	 //break;
//case 1:
	// System.out.println("yes,this is weekday");
	 //break;
//case 2:
	// System.out.println("yes,this is weekday");
	 //break;
//case 3:
	 //System.out.println("yes,this is weekday");
	// break;
//case 4:
	 //System.out.println("yes,this is weekday");
	// break;
//case 5:
	 //System.out.println("yes,this is weekday");
	 //break;
//case 6:
	 //System.out.println("no,this is weekend");
	 //break;
//default:
//System.out.println("invalid");


	 



