/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */
package com.codegnan.arrays;
import java.util.Scanner;
public class DiamondStarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=5;
		//part 1:upper part of the diamond
		for(int i=1;i<=rows;i++) { //1<=5 outer loop for rows (1 to rows)
			//inner loop 1 :print lead spaces.
			for(int j=i;j<rows;j++) {
				System.out.print(" ");//two spaces
			}
			//inner loop 2: prints stars
			for(int k=1;k<=2*i -1;k++) {
				System.out.print("*");//space followed by star
			}
			
			System.out.println();//new line after each row.
		}
		//part 2: Lower part of the pyramid
		for(int i=rows;i>0;i--) {
			//inner for loop 1: print leading spaces
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
			}
			//inner loop 2: print star
			for(int k=1;k<=2*i -1 ;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
