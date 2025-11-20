package com.codegnan.arrays;
import java.util.Scanner;
public class RowWiseSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows= sc.nextInt();
		System.out.println("Enter the column size:");
		int columns=sc.nextInt();
		int sum;
		int[][] arr=new int[rows][columns];
		System.out.println("Enter the elements of 2D array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter the element of row"+i+" ,column"+j+ " : ");
				arr[i][j]=sc.nextInt();
			}
		}
		//Row wise Sum
		for(int i=0;i<rows;i++) {
			sum=0;
			for(int j=0;j<columns;j++) {
				sum+=arr[i][j];
			}
			System.out.println("The Sum of Elements in Row "+i+"is:"+sum);
		}
		//Column Wise Sum
		for(int i=0;i<rows;i++) {
			sum=0;
			for(int j=0;j<columns;j++) {
				sum+=arr[j][i];
			}
			System.out.println("The Sum of Elements in Column "+i+"is:"+sum);
		}
	}
}


