package com.gl.submission;
import java.util.*;
import java.lang.*;
public class travel {
	public static void countCurrency(int size,Integer array[],int target){
		int[] noteCounter = new int[size];
		for (int i = 0; i <size; i++) {
		if (target>=array[i]) {
		noteCounter[i] =target/array[i];
		target =target %array[i];
		}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i <size; i++) {
		if (noteCounter[i] != 0) {
		System.out.println(array[i] + " : "+ noteCounter[i]);
		}
		}}
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int size=scan1.nextInt();
		Integer array[]=new Integer[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i <size; i++) {
	        if (scan1.hasNextInt()) {
	            array[i] = scan1.nextInt();
	        }
	    }
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(
		        "enter the amount you want to pay");
		    int target=scan1.nextInt();
		countCurrency(size,array,target);
	}

}
