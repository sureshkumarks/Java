package Patterns;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String args[]) {
		int num =5;
		for(int i=1; i<=num; i++) {
			for(int  j=1; j<=num; j++) {
				if(i==1 || i ==num || j==1 || j==num) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}
	}
	

}
