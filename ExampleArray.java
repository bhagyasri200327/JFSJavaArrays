package com.codegnan.arrays;
import java.util.Scanner;
public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//step-1 : specify the size based on end user requirement.
		System.out.println("Enter the Array Size:");
		int size=sc.nextInt();
		int[] nums=new int[size];//array construction
		System.out.println("Enter Elements of the array");
		for(int i=0;i<size;i++) {
			 nums[i]=sc.nextInt();
		}
		//Accessing elements 
		System.out.println("Elements in the Array are:");
		/*for(int j:nums) {
			System.out.println(j);
		}*/
		for(int i=0;i<nums.length;i++) {
			System.out.println("Element at index: "+i+" is "+nums[i]);
		}
	

	}

}
