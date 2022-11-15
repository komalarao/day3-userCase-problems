package bridgelabz;
import java.util.*;
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("welcome to employee wage computation program on master branch");
		double chek= Math.floor(Math.random()*10)%2;
		if(chek == 1) {
			
		System.out.println("employee is present");
		
		System.out.println(" enter your choice in numbers between 1 to 4 ");
		Scanner choice = new Scanner(System.in);
		int choices = choice.nextInt();
		//System.out.println(" enter your choice in numbers between 0 to 3 ");
		
		switch(choices) {
        
		case 1:
			System.out.println("you are entered choice 1 means caluculate daily wage");
	    DailyEmployeeWage.WageDaily();
	    break;
	    
		case 2:
			System.out.println("you are entered choice 2 means caluculating part time or full time employee wage");
		AddingPartTime.PartTime();
		break;
		
		case 3:
			System.out.println("you are entered choice 3 means caluculating monthly wage for part time or full time employee");
		WagesForMonth.MonthlyWage();
		break;
		case 4:
			System.out.println("you are entered choice 4 means caluculating total hours or total working days salary");
			EmployeeeWage.TotalHours();
		break;
		}
		}else {
			System.out.println("employee is abscent");
		}
	}

}
