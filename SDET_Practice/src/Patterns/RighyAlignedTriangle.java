package Patterns;

public class RighyAlignedTriangle {
	public static void main(String args[]) {

		for (int i = 1; i <= 4; i++) {
		    for (int j = i; j < 4; j++) {
		        System.out.print("  ");
		    }
		    for (int k = 1; k <= i; k++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}

	}

}
