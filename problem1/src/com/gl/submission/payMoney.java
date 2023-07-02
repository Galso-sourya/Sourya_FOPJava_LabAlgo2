package com.gl.submission;
import java.util.Scanner;
public class payMoney {
public static void function(int array[],int total,int size) {
int sum=0;
int ans=0;
for (int i = 0; i <size; i++) {
sum=sum+array[i];
if(total<=sum) {
	System.out.println(
            "Target achieved after "+(i+1)+" transactions");
	break;
}
}
if(total>sum){
	System.out.println("Given target is not achieved");	
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan1=new Scanner(System.in);
System.out.println("enter the size of transaction array");
int size=scan1.nextInt();
int array[]=new int[size];
System.out.println("enter the values of array");
    for (int i = 0; i <size; i++) {
        if (scan1.hasNextInt()) {
            array[i] = scan1.nextInt();
        }
    }

    System.out.println(
        "enter the total no of targets that needs to be achieved");
    int target=scan1.nextInt();
    System.out.println(
            "enter the value of target");
        int total=scan1.nextInt();
        function(array,total,size);
	}

}
