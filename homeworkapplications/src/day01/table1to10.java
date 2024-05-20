package day01;

import java.util.Scanner;

public class table1to10 {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("input a number:");
	int i=s.nextInt();
	for(int a=0;a<10;a++) {
		System.out.println(i+"x"+(a+1)+"="+(i*(a+1)));
		
	}
}
}
