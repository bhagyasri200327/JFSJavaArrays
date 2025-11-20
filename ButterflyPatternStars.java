/*
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
 */
package com.codegnan.arrays;
public class ButterflyPatternStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		//part 1: Upper part of Butterfly pattern(Expanding wings)
		for(int i=1;i<=rows;i++) { //outer for loop: controls the current row number
			//inner for loop 1:print stars for the left wing
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//inner for loop 2:print spaces in the middle gap
			//formula = 2*(rows-i)
			int spaces=2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			//inner for loop 3: print stars for right wing.
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//part 2: lower part of the butterfly
		for(int i=rows;i>=1;i--) {
			//inner for loop 1: print stars for the left wing.
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//inner for loop 2: for spaces.
			int spaces=2* (rows -i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			//inner for loop 3:prints stars on right wing.
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		}
	

}
