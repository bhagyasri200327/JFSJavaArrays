package com.codegnan.arrays;
import java.util.*;
public class SecondLargestSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	      int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
		      System.out.println("Array = "+Arrays.toString(arr));
		      
		      int max1 = arr[0];//Integer.MIN_VALUE;
		      int max2 = arr[0];//Integer.MIN_VALUE;
		      int min1 = arr[0];//Integer.MAX_VALUE;
		      int min2 = arr[0];//Integer.MAX_VALUE;

		      for (int i = 0; i < arr.length; i++) {
		         if (arr[i] > max1) {
		            max2 = max1;
		            max1 = arr[i];
		         } else if (arr[i] > max2) {
		            max2 = arr[i];
		         }

		         if (arr[i] < min1) {
		            min2 = min1;
		            min1 = arr[i];
		         } else if (arr[i] < min2) {
		            min2 = arr[i];
		         }
		      }

		      System.out.println("Smallest element = "+min1);
		      System.out.println("2nd Smallest element = "+min2);
		      System.out.println("Largest element = "+max1);
		      System.out.println("2nd Largest element = "+max2);
		   }
		}*/

//-----------------or-------------------------
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the size of array: ");
	  int count=sc.nextInt();
	  int[] arr=new int[count];
	  System.out.println("Enter the array elements: ");
	  for(int i=0;i<count;i++) {
		  arr[i]=sc.nextInt();
	  }
      int temp;
     // int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
   //   System.out.println("Array = "+Arrays.toString(arr));
    //  int count = arr.length;
      for (int i = 0; i < count; i++) {
         for (int j = i + 1; j < count; j++) {
            if (arr[i] > arr[j]) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      System.out.println("Smallest: "+arr[0]);
      System.out.println("Largest: "+arr[count-1]);
      System.out.println("Second Smallest: "+arr[1]);
      System.out.println("Second Largest: "+arr[count-2]);
   }
}

