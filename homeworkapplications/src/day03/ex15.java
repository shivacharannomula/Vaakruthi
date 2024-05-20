package day03;

public class ex15 {
public static void main(String[]args) {
	int a=96977;
	int b=0;
	
//	while(a!=0) {
//		int temp = a%10;
//		rev = rev *10+temp;
//		a/=10;
//	}
//	System.out.println(rev);
//}
	while(a!=0)
	{
		System.out.println(a%10);
		a/=10;
	}
	
}

}
