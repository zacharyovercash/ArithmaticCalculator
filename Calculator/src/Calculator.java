import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float a,b,solution;
		char select;
		do
		{
			
		System.out.println("(1) Addition \n(2) Subtraction \n(3) Multiplication \n(4) Division \n(5) Exit");
		select= in.next().charAt(0);
		
		switch(select)
		{
			case '1' : System.out.println("Enter two numbers");
				a= in.nextFloat();
				b= in.nextFloat();
				solution = a+b;
				System.out.println("Result = "+solution);
				break;
			
			case '2' : System.out.println("Enter two numbers");
			a= in.nextFloat();
			b= in.nextFloat();
			solution = a-b;
			System.out.println("Result = "+solution);
			break;
		
		
			case '3' : System.out.println("Enter two numbers");
			a= in.nextFloat();
			b= in.nextFloat();
			solution = a/b;
			System.out.println("Result = "+solution);
			break;
			
		
			case '4' : System.out.println("Enter two numbers");
			a= in.nextFloat();
			b= in.nextFloat();
			solution = a/b;
			System.out.println("Result = "+solution);
			break;
		
		
			case '5' : System.out.println("Thank you for using the calculator");
			System.exit(0);
			break;
		
			default : System.out.println("wrong choice");
			
		}
	
	
	}	while( select!= '5');
	}
}

