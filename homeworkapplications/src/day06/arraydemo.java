package day06;
import java.util.*;

public class arraydemo {
	public static void main (String[]args) {
		int []i= {11,12,21,14,15,16,17,77,19,20	};
		String[]s= {"shiva",
				"charan",
				"Ramya",
				"Harini",
				"Bhanu",
				"Gitasharavani"};
		
	
		System.out.println(Arrays.toString(i));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}

}
