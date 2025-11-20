/*Java program to return an array with elements "rotated left" 
 * Example: 3 6 9
 * output:  6 9 3*/
package com.codegnan.arrays;

import java.util.Scanner;

public class RotateLeftArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		for(int i=0;i<n;i++) {
			if(i==n -1) {
				arr[n-1]=temp;
			    break;}
			arr[i]=arr[i+1];
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
		sc.close();
	}

}
