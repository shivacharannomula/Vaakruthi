package day06;

public class arraydemo4 {
	public static void main(String[]args) {
		int []a=new int[] {11,23,34,45,56,67,78,89,100};
		int sum=0;
		for(int i = 0;i<a.length;i++) {
			sum=sum+a[i];
			}
		double average=sum/a.length;
		System.out.println(average);
		
		}
	}


