package calci;
import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args)
	{
	int n1,n2,option,result=0;	
	Scanner sc = new Scanner(System.in);
	do
	{
	System.out.println("\nEnter the two numbers");
	n1=sc.nextInt();
	n2=sc.nextInt();
	System.out.println("Number 1 = " +n1+"\n"+"Number 2 = "+n2);
	System.out.println("Enter the option");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Exit");
	option=sc.nextInt();
	System.out.println("Entered option ="+option);
	
	switch(option)
		
	     {
	case 1 :
		result=n1+n2;
		System.out.println("The answer is : " + result);
		break;
	case 2 :
		result=n1-n2;
		System.out.println("The answer is : " + result);
		break;
	case 3 :
		result=n1*n2;
		System.out.println("The answer is : " + result);
		break;
	case 4 :
		result=n1/n2;
		System.out.println("The answer is : " + result);
		break;
	case 5 :
		System.out.println("Exit");
		break;
	default :
		System.out.println("You entered incoorect option");
		break;
	}
	
	}while(option!=5);
			
	}

}
