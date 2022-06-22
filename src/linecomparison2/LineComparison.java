package linecomparison2;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM ON MAIN  BRANCH");

		// defining coordinates of the first line
		int x1 = 4;
		int y1 = 5;
		int x2 = 6;
		int y2 = 7;

		// calculating the length of first line
		System.out.println("Coordinates x1 and y1 of first point is " + x1 + ", " + y1);
		System.out.println("Coordinates x2 and y2 of second point is " + x2 + ", " + y2);

		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length pf line1 is " + length1);

		// defining coordinates of the second line
		int x3 = 8;
		int y3 = 9;
		int x4 = 10;
		int y4 = 11;

		// calculating the length of second line
		System.out.println("Coordinates x3 and y3 of first point is " + x3 + ", " + y3);
		System.out.println("Coordinates x4 and y4 of second point is " + x4 + ", " + y4);

		double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		System.out.println("Length pf line2 is " + length2);

		Double f1 = Double.valueOf(length1);
		Double f2 = Double.valueOf(length2);

		if (f1.equals(f2)) {
			System.out.println("Line 1 & Line 2 are equal");
		} else {
			System.out.println("Line 1 & Line 2 are not equal");
		}

	}

}
