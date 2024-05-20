package day04;
class Animal1{
	public void move() {
		System.out.println("the move of animal");
	}
}
class cheetah extends Animal{
	public void move() {
		System.out.println("this ceetah is running ");
	}
	
}

public class main4 {
	public static void main (String[]args) {
		Animal1 a=new Animal1();
		a.move();
		cheetah c=new cheetah();
		c.move();
		
		
	}
	

}
