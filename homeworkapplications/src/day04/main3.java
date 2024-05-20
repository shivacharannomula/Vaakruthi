package day04;

public class main3 {
public static void main(String[]args) {
	Employe emp=new Employe(50000);
	HRManager hr=new HRManager(100000);
	emp.work();
	System.out.println("Employe salary:"+emp.getSalary());
	hr.work();
	System.out.println("HRManager Salary"+hr.getSalary());
}
}
