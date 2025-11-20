package com.codegnan.arrays;
import java.util.Scanner;
public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//step-1 : specify the size based on end user requirement.
		System.out.println("Enter the Array Size:");
		int size=sc.nextInt();
		int sum=0; 
		int[] nums=new int[size];//array construction
		System.out.println("Enter Elements of the array");
		for(int i=0;i<size;i++) {
			 nums[i]=sc.nextInt();
		}
		System.out.println("Elements in the Array are:");
		/*for(int j:nums) {
			System.out.println(j);
		}*/
		for(int i=0;i<nums.length;i++) {
			System.out.println("Element at index: "+i+" is "+nums[i]);
			sum+=nums[i];
		}
		System.out.println("Sum of Elements in an array : ");
		int average=sum/size;
		System.out.println("Average of Elements in array :"+average);
		sc.close();

	}

}
