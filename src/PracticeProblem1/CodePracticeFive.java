package PracticeProblem1;

import java.util.Scanner;

public class CodePracticeFive {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		isLeapYear();
		isLeapYearWithLogicalOperators();
		calculatePercentageAndGrade();
		isPrime();
		fizzBuzz();
		fizzBuzzUsingWhileLoop();
		calculateBMI();
		findYoungest();
		greatestFactorOfNumber();
		powerOfNumber();
		factorsOfNumber();
		multipleOfNumber();
		
	}
	

	private static void isLeapYear() {
 		
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		if(year>=1582) {
			if((year%4==0)&&(year%100!=0)||(year%400==0)) {
				System.out.println("It is a leap year");
			}
			else {
				System.out.println("Not a leap year");
			}
		}
		
		
	}

	private static void isLeapYearWithLogicalOperators() {

		System.out.println("Enter the Year");
		int year = sc.nextInt();
		if((year>=1582)&&((year%4==0)&&(year%100!=0)||(year%400==0))) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
		
	}

	private static void calculatePercentageAndGrade() {

		System.out.println("Enter the mark in Physics : ");
		int physics = sc.nextInt();
		System.out.println("Enter the mark in Chemistry : ");
		int chemistry = sc.nextInt();
		System.out.println("Enter the mark in Maths : ");
		int maths = sc.nextInt();
		int total = physics+chemistry+maths;
		int percentage = (int) (total/3.0);
		System.out.println("Percentage : "+percentage);
		if(percentage<=39) {
			System.out.println("GRADE : R\nREMARKS : Remedial Standars");
		}
		else if(percentage>=40 && percentage <=49) {
			System.out.println("GRADE : E\nREMARKS : Level 1, too below agency-normalized standards ");
		}
		else if(percentage>=50 && percentage <=59) {
			System.out.println("GRADE : D\nREMARKS : Level 1, well below agency-normalized standards ");
		}
		else if(percentage>=60 && percentage <=69) {
			System.out.println("GRADE : C\nREMARKS : Level 1, below ,but approaching agency-normalized standards ");
		}
		else if(percentage>=70 && percentage <=79) {
			System.out.println("GRADE : B\nREMARKS : Level 1, at agency-normalized standards ");
		}
		else if(percentage>=80) {
			System.out.println("GRADE : A\nREMARKS : Level 1, above agency-normalized standards ");
		}
	}

	private static void isPrime() {
				
		System.out.println("Enter the Enter : ");
		int num = sc.nextInt();
		 boolean isPrime = true;
		if(num == 0 || num == 1) {
			isPrime = false;
		}
		else if(num>1){
			for(int i = 2;i<num ;i++) {
				if(num%i==0) {
					isPrime = false;
				}
			}
		}
		else {
			System.out.println("Enter the valid input");
		}
		System.out.println((isPrime)?"The given number "+num+" is prime number.":"The given number "+num+" is not a prime number.");
		
	}

	private static void fizzBuzz() {
		
		System.out.println("Enter the Enter : ");
		int num = sc.nextInt();
		if(num>0) {
			for(int i = 1;i<=num;i++) {
				if(i%3 == 0 && i%5 != 0) {
					System.out.println("Fizz");
				}
				else if(i%5 == 0 && i%3 != 0) {
					System.out.println("Buzz");
				}
				else if(i%5 == 0 && i%3 == 0){
					System.out.println("FizzBuzz");
				}
				else {
					System.out.println(i);
				}
			}
		}
		
		
	}

	private static void fizzBuzzUsingWhileLoop() {
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if(num>0) {
			int i = 1;
			while(i<=num) {
				if(i%3 == 0 && i%5 != 0) {
					System.out.println("Fizz");
				}
				else if(i%5 == 0 && i%3 != 0) {
					System.out.println("Buzz");
				}
				else if(i%5 == 0 && i%3 == 0){
					System.out.println("FizzBuzz");
				}
				else {
					System.out.println(i);
				}
				i++;
			}
		}
		
	}

	private static void calculateBMI() {
		
		System.out.println("Enter the Weight : ");
		double weight = sc.nextDouble();
		System.out.println("Enter the Height : ");
		double height = sc.nextDouble();
		double heightInMeter = height/100;
		double bmi = weight/(heightInMeter*heightInMeter);
		System.out.println("BMI : "+bmi);
		
		if(bmi<= 18.4) {
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("Normal");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			System.out.println("Overweight");
		}
		else if(bmi>=40.0) {
			System.out.println("Obese");
		}
		else {
			System.out.println("Invaild Input");
		}
		
	}

	private static void findYoungest() {
		
		System.out.println("Enter Amar's Age");
		int age1 = sc.nextInt();
		System.out.println("Enter Amar's height");
		double height1 = sc.nextDouble();
		System.out.println("Enter Akbar's Age");
		int age2 = sc.nextInt();
		System.out.println("Enter Akbar's height");
		double height2 = sc.nextDouble();
		System.out.println("Enter Anthony's Age");
		int age3 = sc.nextInt();
		System.out.println("Enter Anthony's height");
		double height3 = sc.nextDouble();
		String youngestAge = "";
		if(age1<age2 && age1<age3) {
			youngestAge = "Amar";
		}
		else if(age2<age1 && age2<age3) {
			youngestAge = "Akbar";
		}
		else if(age3<age2 && age3<age1) {
			youngestAge = "Anthony";
		}
		else {
			System.out.println("Tie in Age");
		}
		String tallest = "";
		if(height1>height2 && height1>height3) {
			tallest = "Amar";
		}
		else if(height2>height1 && height2>height3) {
			tallest = "Akbar";
		}
		else if(height3>height1 && height3>height2) {
			tallest = "Anthony";
		}
		else {
			System.out.println("Tie in Height");
		}
		System.out.println(youngestAge+" is the Youngest\n"+tallest+" is the tallest");
		
	}

	private static void greatestFactorOfNumber() {
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int greatestFactor = 1;
		if(num>1) {
			for(int i = num -1; i>=1;i--) {
				if(num%i==0) {
					greatestFactor = i;
					break;
				}
			}
		}
		else {
			System.out.println("Enter the valid Input");
		}
		System.out.println("The greatest  factor of the given number is "+greatestFactor);
	}

	private static void powerOfNumber() {
 		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		int value  = 1;
		for(int i = value ; i<=power;i++) {
			value = value*num;
		}
		System.out.println("The power of the given number is "+value);
		
		
	}

	private static void factorsOfNumber() {
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i = 1;i<num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}

	private static void multipleOfNumber() {

		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i = 100;i>=1;i--) {
			if(i%num==0) {
				System.out.println(i);
			}
		}

		
	}
}
