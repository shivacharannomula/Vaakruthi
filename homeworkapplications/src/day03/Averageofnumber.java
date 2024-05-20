package day03;

import java.util.Scanner;

public class Averageofnumber {
	public static void main(String[]args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("input first number:");
		int a=sc.nextInt();
		System.out.println("input second number:");
		int b=sc.nextInt();
		System.out.println("input third number:");
		int c=sc.nextInt();
		System.out.println("input fourth number:");
		int d=sc.nextInt();
		System.out.println("average of fournumbers:"+(a+b+c+d)/4);*/
		/*int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=((a+b+c+d+e)/5);
		System.out.println("average of five integers:"+f);*/
		double num=0;
		double x=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("input the number");
		int n=sc.nextInt();
		while(x<=n) {
			System.out.println("input number"+"("+(int)x+")"+":");
			num +=sc.nextInt();
			x +=1;
			}
		double avgn=(num/n);
		System.out.println("average:"+avgn);
			
	}}
