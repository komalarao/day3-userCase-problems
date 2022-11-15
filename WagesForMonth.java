package bridgelabz;

public class WagesForMonth {
//public static void main(String[] args) {
	public static void MonthlyWage() {
		var check = Math.floor(Math.random()*10)%2;
		int fullDayHours = 8;
		int wagePerHour = 20;
		int workingDays = 20;
		int wagePerMonth = (fullDayHours*wagePerHour*workingDays);
		int partTimeMonthlyWage =((fullDayHours/2)*wagePerHour*workingDays);
		//int dailyWage = (fullDayHours*wagePerHour);
		//int parttimeDailyWage = (fullDayHours/2)*20;		
		if( check == 0) {
			System.out.println("employee is present and his daily monthly wage is "+wagePerMonth);
			
		}else if (check == 1){
			System.out.println("employee is present but part time so his daily wage is " +partTimeMonthlyWage );

	
	}
	}
//}
}
