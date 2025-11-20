/*Java program to return true if 2 Arrays have same first and last values */
package com.codegnan.arrays;

import java.util.Scanner;

public class SameFirstLastElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of Array 1: ");
		int n=sc.nextInt();
		System.out.println("Enter the elemnets in Array 1:");
		int[] ar1=new int[n];
		int[] ar2=new int[n];
		for(int i=0;i<n;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter size of Array 2: ");
		int m=sc.nextInt();
		System.out.println("Enter the elemnets in Array 2:");
		for(int i=0;i<m;i++) {
			ar2[i]=sc.nextInt();
		}
		boolean res=false;
		if(ar1[0]==ar2[0]||ar1[n-1]==ar2[m-1]) {
			 res=true;
		}
		System.out.print(res);
	}

}
