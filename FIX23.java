//If an elment in an array is 2 and followed by 3, then replace the 3 by 0 and print the result.
package com.codegnan.arrays;

import java.util.Scanner;

public class FIX23 {
    public static int[] fix23(int[] nums) {
    	//check if num[0] is 2 and num[1] is 3
    	if(nums[0]==2 && nums[1]==3) {
    		nums[1]=0;
    	}
    	if(nums[1]==2 && nums[2]==3) {
    		nums[2]=0;
    	}
    	return nums;
    }
    public static void printArray(int[] arr) {
    	System.out.println("[");
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]);
    		if(i<arr.length-1) {
    			System.out.print(", ");
    		}
    	}
    	System.out.println("]");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[][] testCases= {{1,2,3},{1,2,2},{2,3,3},{2,3,2},{2,2,2},{2,2,3}};
		for(int i=0;i<testCases.length;i++) {
			int[] result=fix23(testCases[i]);
			System.out.println("Test Case "+(i+1)+" : ");
			printArray(result);
			
			sc.close();
		}
		
	}

}
