package NumberOfDaysInMonth;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		int returnValue = getDaysInMonth(2,isLeapYear(2001));
		print(returnValue);	
	}
	 public static boolean isLeapYear(int year){
	        if( year<=9999 && year>=1){
	            if (year % 4 == 0) {
	                if(year % 100 == 0){
	                    if(year % 400 == 0){
	                        return true;
	                    }return false;
	                }return true;
	            } return false;
	        }return false;
	    }
	 
	 
	 
	  public static int getDaysInMonth(int month,boolean isLeapYear) {
		  if(month>12 || month<1) {
			   return -1;
			
		  }else
			 switch(month) {
		      case 1: case 3: case 5:
	            case 7: case 8: case 10:
	            case 12:
	                return 31;
	             
	            case 4: case 6:
	            case 9: case 11:
	            	return  30;
	             
	            case 2:
	                if (isLeapYear==true) {
	                	return 29;
	                }
	                else
	                	return 28;
	                
			 }
		return 1;
			 
		  }
	  
	  public static void print(int x) {

		  System.out.println(x);
		  }
}
