package day03;
import java.util.*;
public class Ex17 {
	public static void main(String[]args) {
		long binary1,binary2;
		int a=0,remainder=0;
		int []sum=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number:");
        binary1 = sc.nextLong();
        System.out.println("enter Second number:");
        binary2=sc.nextLong();
        while (binary1 !=0||binary2 !=0) {
        	sum[a++]=(int)((binary1%10+binary2%10+remainder)%2);
        	remainder=(int)((binary1%10+binary2%10+remainder)/2);
        	binary1=binary1/10;
        	binary2=binary2/10;
        }
        if(remainder !=0) {
        	sum[a++]=remainder;
        }
        --a;
        System.out.print("Sum of two binary numbers:");
        while (a>=0) {
        	System.out.print(sum[a--]);
        }
        System.out.print("/n");
	}
	

}
