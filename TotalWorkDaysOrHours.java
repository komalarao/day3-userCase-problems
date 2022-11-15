package bridgelabz;
import java.util.*;
public class EmployeeeWage {

	public static void TotalHours() {
		
		int perHour=20;
		int hours = 8;
		int totalPartTimeHours=50;
		int workingdays = 20;
		int dailyWage = (perHour*hours);
		int parttimeDailyWage =(perHour*(hours/2));
		int totalHours=((perHour*hours)-60);
		var hoursOrDays= Math.floor(Math.random()*10)%2;
	    var check = Math.floor(Math.random()*10)%3;
	   int checking =  (int) check;
         switch(checking) {
         case 0:
        	 for (int a=1;a<=workingdays;a++) {
        		if(hoursOrDays==0) {
        			System.out.println("salary for the full time for "+a+" days is "+(dailyWage*a));
        		}        		
        	 }for (int c=1;c<=totalHours;c++) {
        		if(hoursOrDays == 1)  {
        			 System.out.println("salary for the full time for "+c+" hours  is- "+(totalHours*perHour));
        		 
        	 }	
        	 }
        	
        
        	 break;
         case 1:
        	 for (int b=1;b<=workingdays;b++) {
        	 if(hoursOrDays==0) {
        		 System.out.println("salary for the part time for "+b+" days is "+(parttimeDailyWage*b));
        	 }
        	 }for (int d=1;d<=totalPartTimeHours;d++) {
        	  if(hoursOrDays == 1) {
        		 
        	 System.out.println("salary for the part time for "+d+ " hours is "+(perHour*totalPartTimeHours));
        	 }
        	 }
        	 break;
        }
	}
}