/* HOURGLASS STAR PATTERN
* * * * * *
 *       *
  *     *
   *   *
    * *
     *
    * *
   *   *
  *     *
 *       *
* * * * * **/
package com.codegnan.arrays;

import java.util.Scanner;

public class HourGlassStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i - 1;k++) {
				if(k==1||k==2*i -1) {
					System.out.print(" *");		
				}
				else if(i==n)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i - 1;k++) {
				if(k==1||k==2*i -1) {
					System.out.print(" *");		
				}
				else if(i==n)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
