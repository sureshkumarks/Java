package Patterns;

public class PyramidPattern {
	public static void main(String args[]) {
		int num =5;
		for(int i =1; i<=num; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2 -1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
