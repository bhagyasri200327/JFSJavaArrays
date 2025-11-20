package com.codegnan.arrays;
import java.util.Scanner;
public class TwoDimensionalArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int rows= sc.nextInt();
		System.out.println("Enter the Number of Columns : ");
		int columns=sc.nextInt();
		int[][] matrix=new int[rows][columns];
		System.out.println("Enter the Elements of the array from end user:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter element at row "+(i)+", columns "+(j)+" : ");
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int[] row:matrix) {
			for(int num:row) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
