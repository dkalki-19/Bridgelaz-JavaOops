package PracticeProblem1;

import java.util.Scanner;

public class CodePracticeFour {
	
	static Scanner sc = new Scanner(System.in);
			
	
	public static void main(String[] args) {
		
		noDivisibleByFive();
		checkIfFirstIsLargest();
		greatestOfThree();
		sumOfNAturalNums();
		eligibilityForVoting();
		checkNum();
		checkSpringSeason();
		rocketLaunchUsingWhileLoop();
		rocketLaunchUsingForLoop();
		sumuntilZero();
		sumuntilZeroUsingBreak();
		sumofnaturalNumsUsingFormula();
		sumofnaturalNumsUsingFor();
		factorial();
		factorialUsingForloop();
		oddOrEvenFromGivenRange();
		findBonusUsingServiceYear();
		performMultiplicationFromUserInput();
		
	}
	
//	Level 1 Practice Programs 

	private static void noDivisibleByFive() {
	
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		System.out.println((num%5 == 0)?"Is the number "+num+" divisible by 5?"+" Yes":"Is the number "+num+" divisible by 5?"+" No");
		
	}

	private static void checkIfFirstIsLargest() {

		System.out.println("Enter the First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number :");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number :");
		int num3 = sc.nextInt();
		
		boolean isSmallest = false;
		
		if(num1==num2 && num2==num3) {
			isSmallest = false;
		}
		if(num2>num3) {
			if(num1<num3 || num1 == num3) {
				isSmallest = true;
			}else {
				isSmallest = false;
			}
		}else if(num2<num3){
			if(num1<num2 || num1 == num2) {
				isSmallest = true;
			}else {
				isSmallest = false;
			}
		}
		
		
		System.out.println((isSmallest)?"Is the first number the smallest?"+" Yes":"Is the first number the smallest?"+" No");
		
		
	}

	private static void greatestOfThree() {
		
		String  num1L = "No";
		String  num2L = "No";
		String num3L = "No";
		
		System.out.println("Enter the First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number :");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number :");
		int num3 = sc.nextInt();
		
		if(num1 == num2) {
			if(num1 == num3) {
				System.out.println("All three given Numbers are Equal");
			}
			else if(num1 > num3) {
				num1L = "Yes";
			}
			else {
				num3L = "Yes";
			}
		}
		else if(num1 == num3){
			if(num1 > num2) {
				num1L = "Yes";
			}
			else {
				num2L = "Yes";
			}
			
		}
		
		if(num1 > num2 && num1 > num3) {
			if(num1 > num3) {
				num1L = "Yes";
			}
			else {
				num3L = "Yes";
			}
			
		}
		else if(num1 < num2){
			if(num1 > num3) {
				num2L = "Yes";
			}
			else if(num2 < num3) {
				num3L = "Yes";
			}
			else if(num1 !=num3){
				num2L = "Yes";
			}

		}
		System.out.println(("Is the first number the largest?"+num1L+ 
				"\nIs the second number the largest? "+num2L+"\nIs the third number the largest?"+num3L));
		
	}

	private static void sumOfNAturalNums() {

		System.out.println("Enter the number ");
		int num = sc.nextInt();
		if(num >=0) {
			int sum = num*(num+1)/2;
			System.out.println("The sum of "+num+" natural numbers is "+sum);
		}
		else {
			System.out.println("The number "+num+" is not a natural number "); 	
		}
		
		
	}

	private static void eligibilityForVoting() {
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("The person's age is "+age+" and can vote");
		}
		else {
			System.out.println("The person's age is "+age+" and cannot vote");
		}
		
	}

	private static void checkNum() {
		
		System.out.println("Enter the Number");
		if(sc.nextInt()>0) {
			System.out.println("Positive");
		}
		else if(sc.nextInt()<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		
	}

	private static void checkSpringSeason() {

		System.out.println("Enter the Month");
		int month = sc.nextInt();
		System.out.println("Enter the Day");
		int day = sc.nextInt();
		if(month>=3 && month <=6 && day>=1 && day<=31) {
			if(((month==3 || month==5)&&(day>=1 && day<=31))||(month == 4 && (day>=1 && day<=30))||(month == 6 && (day>=1 && day<=20))){
				System.out.println("Its a Spring Season");
			}else {
				System.out.println("Not a Spring Season");
			}
		}else {
			System.out.println("Not a Spring Season");
		}

		
	}

	private static void rocketLaunchUsingWhileLoop() {
		
		System.out.println("Enter the Number : ");
		int counter = sc.nextInt();
		while(counter>=1) {
			System.out.println(counter);
			counter--;
		}
		
		
	}

	private static void rocketLaunchUsingForLoop() {

		System.out.println("Enter the Number : ");
		int counter = sc.nextInt();
		for(int i = counter;i>=1;i--) {
			System.out.println(i);
		}
	}

	private static void sumuntilZero() {

		double total = 0.0;
		System.out.println("Enter the number");
		double num = sc.nextInt();
		while(num != 0) {
			total=total+num;
			System.out.println("Enter the number");
			num = sc.nextInt();
		}
		System.out.println("Total : "+total);
		
		
		
	}

	private static void sumuntilZeroUsingBreak() {

		double total = 0.0;
		System.out.println("Enter the number");
		double num = sc.nextInt();
		while(true) {
			total=total+num;
			System.out.println("Enter the number");
			num = sc.nextInt();
			if(num==0) {
				break;
			}
		}
		System.out.println("Total : "+total);
		
		
	}

	private static void sumofnaturalNumsUsingFormula() {
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		int i=num;
		while(i>0) {
			sum=sum+i;
			i--;
		}
		System.out.println(" "+sum);
		int sum1 = num*(num+1)/2;
		System.out.println("Result using While Loop : "+sum+"\nResult using formulae : "+sum1);
		
	}

	private static void sumofnaturalNumsUsingFor() {
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=num;i>0;i--) {
			sum=sum+i;
		}
		System.out.println(sum);
		int sum1 = num*(num+1)/2;
		System.out.println("Result using For Loop : "+sum+"\nResult using formulae : "+sum1);
		
		
	}

	private static void factorial() {		
		
		System.out.println("Enter the Number to find the factorial : ");
		int num = sc.nextInt();
		int fact = 1;
		if(num>0) {
			int  i = num;
			while(i>0) {
				fact = fact*i;
				i--;
			}
		}
		else {
			System.out.println("Enter a valid Input");
		}
		System.out.println(fact);
		
		
	}

	private static void factorialUsingForloop() {

		System.out.println("Enter the Number to find the factorial : ");
		int num = sc.nextInt();
		int fact = 1;
		if(num>0) {
			for(int i = num;i>0;i--) {
				fact = fact*i;
			}
		}
		else {
			System.out.println("Enter a valid Input");
		}
		System.out.println(fact);
		
	}

	private static void oddOrEvenFromGivenRange() {
		
		System.out.println("Enter the Number : ");
		int num =  sc.nextInt();
		
		for(int i = 1;i<=num;i++) {
			if(i%2==0) {
				System.out.println("Even : "+i);
			}
			else {
				System.out.println("Odd : "+i);
			}
		}
		
		
	}

	private static void findBonusUsingServiceYear() {
		
		System.out.println("Enter the salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter the year of service : ");
		int service = sc.nextInt();
		
		if(service>5) {
			double bonus = salary*5/100;
			System.out.println("The Bonus amount earned is : "+bonus);
		}
		
	}

	private static void performMultiplicationFromUserInput() {
 
		
		System.out.println("Enter the Number to perform Multiplication Operation : ");
		int num = sc.nextInt();
		if(num>=6 && num<=9) {
			for(int i=1;i<=12;i++) {
				System.out.println(i+"*"+num+"="+(i*num));
			}
		}
		else {
			System.out.println("Enter the valid input from 6 to 9");
		}
	}
	
	

	
}







