package bridgelabz;

public class AddingPartTime {
//public static void main (String[] args) {
	public static void PartTime() {
		var check = Math.floor(Math.random()*10)%2;
		int fullDayHours = 8;
		int wagePerHour = 20;
		int dailyWage = (fullDayHours*wagePerHour);
		int parttimeDailyWage = (fullDayHours/2)*20;		
		if( check == 0) {
			System.out.println("employee is present and his daily wage is "+dailyWage);
			
		}else if (check == 1){
			System.out.println("employee is present but part time so his daily wage is "+parttimeDailyWage );
		}
	    		 

	}
//}
}
