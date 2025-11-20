/*1. Sum of elements in 2D array
2.(a)Row wise sum  (b) Row wise product 
3.(a)Column wise sum  (b) Column wise product*/
package com.codegnan.arrays;
import java.util.Scanner;
public class RowSumColumnSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row size:");
		int rows= sc.nextInt();
		System.out.println("Enter the column size:");
		int columns=sc.nextInt();
		int sum=0;
		int[][] arr=new int[rows][columns];
		System.out.println("Enter the elements of 2D array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter the element of row"+i+" ,column"+j+ " : ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int[] row:arr) {
			for(int num:row) {
				sum+=num;
			}
		}
		System.out.println(sum);
	}

}
