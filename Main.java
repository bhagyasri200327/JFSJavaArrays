package com.codegnan.arrays;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
	public static void display() {
		LocalDateTime dt1=LocalDateTime.now();
	//	System.out.println("Start time:"+dt1);
		for(int i=0;i<10000;i++) {
			System.out.println("Hi");
		}
		//to know how much time taken to execute this program.
		LocalDateTime dt2=LocalDateTime.now();
	//	System.out.println("End time:"+dt2);
		Duration d=Duration.between(dt1, dt2);
		System.out.println("Duration Time : "+d.toMillis());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		}
}
