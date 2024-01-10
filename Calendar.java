
public class Calendar{	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 
	
	public static void main(String args[]) {
	    int currentyear = Integer.parseInt(args[0]);
	 	while (year < currentyear) {
	 		while (month < 13) {
				nDaysInMonth = nDaysInMonth(month, year);
				for(int i = 1; i <= nDaysInMonth; i++){
					if(dayOfWeek == 7){
						dayOfWeek = 1;
					}else {
						dayOfWeek++;
					}
				}
				month++;
			}
		year++;
		month = 1;
		}
		month = 1;
		for(int j = 1; j <= 12; j++){
			advance(dayOfMonth, month, year);
			month++;
		}
		if (month == 13){
			month = 1;	
		}
		year++;
		
}	


	 private static void advance(int dayOfMonth, int month, int year) {
		for(dayOfMonth = 1; dayOfMonth <= nDaysInMonth(month, year); dayOfMonth++){
			System.out.print(dayOfMonth + "/" + month + "/" + year);
			if(dayOfWeek == 1){
				System.out.print(" Sunday");
			}
			if(dayOfWeek == 7){
				dayOfWeek = 1;
			} else {
				dayOfWeek++;
			}
		
			System.out.println();
	 	}
	} 
		 
	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
			return true;
			} else {
			return false;
			}
	}


	public static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if(isLeapYear(year)){
					return 29;
				} else{
					return 28;
				}
			default:
				return 31;
		}
	}
}