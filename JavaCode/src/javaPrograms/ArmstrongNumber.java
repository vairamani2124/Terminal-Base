package javaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=133;
		int temp=a;
		
		int b=0;
		
		while(a>0) {
			int reminder=a%10;
			
			b=b+(reminder*reminder*reminder);
			
			a=a/10;
			
		}
		
		if(temp==b) {
			System.out.println("the given number is Armstrong"+b);
		}
		else {
			System.out.println("the given number is not Armstrong"+b);
		}

	}

}
