//To print how many times the each element in an array is repeated.(Element Frequency Count)
package com.codegnan.arrays;

import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int[] array= {1,2,3,2,1,4,3,5,1};
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		System.out.println("Enter the elements of Array : ");
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		boolean[] processed=new boolean[array.length];//a boolean array to track which elements have been processed already 
		for(int i=0;i<array.length;i++) {
			//if the element at index i has already been processed ,skip it.
			if(processed[i]) {
				continue;
			}
			//initialize count for the current element.
			int count=1;
			
			//inner for loop to compare the current element with rest of elements.
			for(int j=i+1;j<array.length;j++) {
				//if the element at index j = element at index i
				if(array[j]==array[i]) {
					count++;  //increment count for that element.
					processed[j]=true;  //mark that element at index j as processed.
				}
			}
			
			System.out.println(array[i]+ " Occurs "+count+" Times");
		}
		sc.close();
	}
}



/*
Assigment 2 -Given an array of integer , return true if 6 appears as either the fast or last element in the array.
The array will be length 1 or more.
[6,1,2]---true
Assignment 3- 
Assignment 4-Given 2 arrays of ints, a and b , return true if they have same first elements or last elements
Assignment 5-
Assignment 6- Given an array of integer, move all the 0 elements to the end of the array and print array.*/