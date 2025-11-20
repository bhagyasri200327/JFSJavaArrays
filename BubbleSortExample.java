package com.codegnan.arrays;

import java.util.Scanner;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Array Elements before Sorting:");
		printArray(ar);
		bubbleSort(ar);
		System.out.println("Array Elements after Sorting:");
		printArray(ar);
	}
	public static void bubbleSort(int[] ar) {
		int n=ar.length;
		for(int i=0;i<=n-1;i++) {
			//a flag to check if any swapping happens,
			//used for optimization(best case)
			boolean swapped=false;
			//inner for loop for comparisons in each pass.
			//(n-i-1) because last i element are already in correct position.
			for(int j=0;j<n-i-1;j++) {
				//if current element is greater than the next, swap them.
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					//since we swapped marked as true.
					swapped=true;
				}
			}
			//if no elements were swapped in this pass. array is already sorted.
			if(!swapped) {
				break;//optimization, exit early.
			}
		}
	}
	public static void printArray(int[] ar) {
		for(int num:ar) {
			System.out.println(num + " ");
		}
	}
}
