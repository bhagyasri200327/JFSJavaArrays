/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

 */
package com.codegnan.arrays;

import java.util.Scanner;

public class HallowDiamond1Line {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int n=in.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				if(k==1||k==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				if(k==1||k==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	in.close();
	}
	

}
