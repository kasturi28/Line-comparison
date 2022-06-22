package linecomparison2;


public class LineComparison {

	public static void main(String[] args) {

		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM ON MAIN  BRANCH");
		
		
		// defining coordinates of the line
		int x1 = 4;
        int y1 = 5;
        int x2 = 6;
        int y2 = 7;
        
        //calculating the length
        System.out.println("Coordinates x1 and y1 of first point is "+x1+", "+y1);
        System.out.println("Coordinates x2 and y2 of second point is "+x2+", "+y2);

        double length1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length pf line1 is "+length1);

	}

}
