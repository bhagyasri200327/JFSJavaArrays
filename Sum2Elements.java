/*Assigment 1 -Given an array of integer , return the sum of first 2 elements in the array.
  If the array length is less than 2, just sum up the elements that exist,
   return 0 if array length is 0.
   1,2,3 ----3
   5,5 ----10
   8,2,1,4 ----10*/
package com.codegnan.arrays;

import java.util.Scanner;

public class Sum2Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int sum=0;
		int[] arr=new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	/*	if(n<=2) {
			for(int k=0;k<n;k++)
				sum+=arr[k];
		}
			  
		else if(n>2) { 
			for(int j=0;j<=1;j++) {
					sum+=arr[j];
					}
				}
			else
				sum=0;*/
		for(int i=0;i<n;i++) {
			if(n<=2) {
				sum+=arr[i];
			}
			else if(n>2) {
				sum=arr[i]+arr[i+1];
				break;
			}
			else
				sum=0;
			break;
		}
		
		    System.out.println("Sum of first 2 elements of array is: "+sum);
		    
	}

}
