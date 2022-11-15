package bridgelabz;

public class CheckingLines {

	public static void main(String[] args) {
	    System.out.println("welcome to line comparision computation problem on master branch");
	    int x1 = 23; int y1 = 33; int x2 = 31; int y2 = 34; int Y1 = 45; int X1 = 25; int X2 = 12; int Y2 = 23;
	    var lengthOfLine = Math.sqrt((x2-x1)^2+(y2-y1)^2);
	    var lengthLine = Math.sqrt((X2-X1)^2+(Y2-Y1)^2);
	    if (lengthOfLine == lengthLine) {
	    	System.out.println("the two lines are equal");
	    }else {
	    	System.out.println("these two lines are not equal");
	    }

	}

}
