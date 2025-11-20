//MULTIDIMENSIONAL 2D ARRAY
package com.codegnan.arrays;
import java.util.Scanner;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int[][] numbers= {{1,2,3},{5,30,6},{7,8}};
		System.out.println("Elements of 2D array:");
		for (int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();	
		}
		System.out.println("print array elements in enhanced for loop ");
		for(int[] row : numbers) {
			for(int num:row) {
				System.out.print(num+ " ");
			}
			System.out.println();
		}
	}

}
