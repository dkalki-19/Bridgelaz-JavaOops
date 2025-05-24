package PracticeProblem1;

import java.util.Scanner;

public class CodePracticeSix {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		armstrongNumber();
		countDigits();
		checkHarshadNumber();
		checkAbundantNumber();
		dayOfWeek();
		calculatorUsingSwitchCase();
	}

	private static void armstrongNumber() {
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int givenNo = num;
		int rem = 0;
		int sum = 0; 
		while(num!=0) {
			rem = num%10;
			System.out.println("Rem "+rem);
			sum =  sum+(rem*rem*rem);
			System.out.println("Sum "+sum);
			num=num/10;
			System.out.println("Num "+num);
		}
		
		System.out.println((sum==givenNo)?"Given number "+givenNo+" is an Armstrong number" : "Given number "+givenNo+" is not an Armstrong number");
		
		
	}

	private static void countDigits() {

		System.out.println("Enter the Number");
		long number  = sc.nextLong();
		int count = 0;
		
		while(number!=0) {
			number = number/10;
			count++;
		}
		System.out.println("The Count of the given number is : "+count);
	}
	

	private static void checkHarshadNumber() {
	
		
		System.out.println("Enter The Number : ");
		int number  = sc.nextInt();
		int givenNo = number ; 
		int sum = 0;
		int rem = 0 ;
		while(number!=0) {
			rem = number%10;
			sum = sum+rem;
			number=number/10;
		}
		System.out.println((givenNo%sum==0)?"Given number "+givenNo+" is a Harshad number" : "Given number "+givenNo+" is not a Harshad number");
	}

	private static void checkAbundantNumber() {
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int value = 0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				value+=i;
			}
		}
		System.out.println((value>number)?"Given number "+number+" is an Abundant number" : "Given number "+number+" is not an Abundant number");
	}

	private static void dayOfWeek() {
	
		System.out.println("Enter the Month : ");
		int month = sc.nextInt();
		System.out.println("Enter the Day : ");
		int day = sc.nextInt();
		System.out.println("Enter the Year : ");
		int year = sc.nextInt();
		String dayOfWeek = "";
		
		if(month>=1 && month <=12 && day>=1 && day<=30 && year>=1560 && year<=2025) {
			
			int y0 =  year - (14 - month) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = month + 12 * ((14 - month) / 12) - 2;
			int d0 = (day + x + (31 * m0) / 12) % 7;
			System.out.println("Day "+d0);
			
			if(d0 == 0) {
				dayOfWeek = "Sunday";
			}
			else if(d0 == 1) {
				dayOfWeek = "Monday";
			}
			else if(d0 == 2) {
				dayOfWeek = "Tuesday";
			}
			else if(d0 == 3) {
				dayOfWeek = "Wednesday";
			}
			else if(d0 == 4) {
				dayOfWeek = "Thursday";
			}
			else if(d0 == 5) {
				dayOfWeek = "Friday";
			}
			else if(d0 == 6) {
				dayOfWeek = "Saturday";
			}
			else {
				System.out.println("Invalid Date");
			}
			System.out.println("Day Of the Given Date is : "+dayOfWeek);
		}
		else {
			System.out.println("Enter the valid input");
		}
	}

	private static void calculatorUsingSwitchCase() {
		
		System.out.println("Enter the First Number : ");
		double first = sc.nextDouble();
		System.out.println("Enter the Second Number : ");
		double second = sc.nextDouble();
		System.out.println("Enter the Operator to perform the Operation : ");
		String op = sc.next();	
		double ans = 0;
		
		switch(op) {
			case "+" :{
				ans = first+second;
				System.out.println("The Addition of two numbers is : "+ans);
				break;
			}
			case "-" :{
				ans = first-second;
				System.out.println("The Substraction of two numbers is : "+ans);
				break;
			}
			case "*" :{
				ans = first*second;
				System.out.println("The Multiplication of two numbers is : "+ans);
				break;
			}
			case "/" :{
				ans = first/second;
				System.out.println("The Division of two numbers is : "+ans);
				break;
			}
			default : System.out.println("Invalid Operator");
		}
		
	}

	
}
