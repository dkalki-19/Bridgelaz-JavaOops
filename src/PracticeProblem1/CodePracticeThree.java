package PracticeProblem1;

import java.util.Scanner;

public class CodePracticeThree {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		quotientAndRemainder();
		intOperation();
		doubleOpt();
		celciusToFahren();
		fahranToCelcius();
		totalIncome();
		swapTwoNo();
		intOperation2();
		athlete();
		divideChocolate();
		simpleInterest();
		poundsToKg();
		
	}

	private static void quotientAndRemainder() {
	
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("The Quotient is "+(num1/num2)+" and Reminder is "+(num1%num2)+" of two number "+num1+" and "+num2);
	}

	private static void intOperation() {
		
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		int res1 = a + b *c;
		int res2 =  a * b + c;
		int res3 = c + a / b;
		int res4 = a % b + c;
		System.out.println("The results of Int Operations are "+res1+" "+res2+" "+res3+" and "+res4);
			

	}

	private static void doubleOpt() {
		
		System.out.println("Enter the first number");
		double a = sc.nextDouble();
		System.out.println("Enter the second number");
		double b = sc.nextDouble();
		System.out.println("Enter the third number");
		double c = sc.nextDouble();
		double res1 = a + b *c;
		double res2 =  a * b + c;
		double res3 = c + a / b;
		double res4 = a % b + c;
		System.out.println("The results of Int Operations are "+res1+" "+res2+" "+res3+" and "+res4);
		
	}

	private static void celciusToFahren() {
		
		System.out.println("Enter the temperature in celcius");
		double celcius = sc.nextDouble();
		double fahrenheit = (celcius*9/5)+32;
		System.out.println("The "+celcius+" celsius is "+fahrenheit+" fahrenheit");
		
	}

	private static void fahranToCelcius() {
			
		double fahrenheit = sc.nextDouble();
		double celcius = (fahrenheit - 32) * 5 / 9;
		System.out.println("The "+fahrenheit+" fahrenheit is "+celcius+" celsius");

	}

	private static void totalIncome() {
		
		System.out.println("Enter the salary");
		double sal = sc.nextDouble();
		System.out.println("Enter the Bonus");
		double bonus = sc.nextDouble();
		System.out.println("The salary is INR "+sal+" and bonus is INR "+bonus+". Hence Total Income is INR "+(sal+bonus));
		
	}

	private static void swapTwoNo() {
		
		System.out.println("Enter the first number");
		double a = sc.nextDouble();
		System.out.println("Enter the second number");
		double b = sc.nextDouble();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("The swapped numbers are "+a+" and "+b);
		
		
	}

	private static void intOperation2() {
		
		
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		System.out.println("Enter your start City : ");
		String fromCity = sc.nextLine();
		System.out.println("Enter your via City : ");
		String viaCity = sc.nextLine();
		System.out.println("Enter your Destination City : ");
		String toCity = sc.nextLine();
		
		System.out.println("Enter the distance from "+fromCity+" to "+viaCity);
		int fromToViaDistance = sc.nextInt();
		System.out.println("Enter the distance from "+viaCity+" to "+toCity);
		int viaToDestinationDistance = sc.nextInt();
		System.out.println("Enter the Time Taken to reach the Journey");
		int time = sc.nextInt();
		
		
		int totalDistance = fromToViaDistance + viaToDestinationDistance;
		int avgSpeed = totalDistance/time;
		int res = totalDistance%time+fromToViaDistance;
		
		System.out.println("\n--- Travel Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " → " + viaCity + " → " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + avgSpeed + " mph");
        System.out.println("Example of operator precedence (distance % time + fromToVia): " + res);

        System.out.println("\nThe results of Int Operations are " + totalDistance + ", " + avgSpeed + ", and " + res);

		
		
	}

	private static void athlete() {
		
		System.out.println("Enter side1 of a triangle");
		double side1 = sc.nextDouble();
		System.out.println("Enter side2 of a triangle");
		double side2 = sc.nextDouble();
		System.out.println("Enter side3 of a triangle");
		double side3 = sc.nextDouble();
		double distance = 5000;
		
		double perimeterOfTriangle = side1+side2+side3;
		double rounds  = distance/perimeterOfTriangle;
		System.out.println("The total number of rounds the athlete will run is "+rounds+"  to complete 5 km");
		
		
	}

	private static void divideChocolate() {
		
		System.out.println("Enter the Number Of Chocolates");
		int countOfChocolates = sc.nextInt();
		System.out.println("Enter the Number Of Children");
		int countOfChildren = sc.nextInt();
		int chocolatesChildrenGet = countOfChocolates/countOfChildren;
		int remainingChocolates = countOfChocolates%countOfChildren;
		System.out.println("The number of chocolates each child gets is "+chocolatesChildrenGet+" and the number of remaining chocolates are "+remainingChocolates);
		
		
	}

	private static void simpleInterest() {
		
		System.out.println("Enter the Principal Amount :");
		double principal = sc.nextDouble();
		System.out.println("Enter the Rate Of Interest :");
		double rate = sc.nextDouble();
		System.out.println("Enter the Time :");
		double time = sc.nextDouble();
		double simpInterest = (principal*rate*time)/100;
		System.out.println("The Simple Interest is "+simpInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
		
	}

	private static void poundsToKg() {
		
		System.out.println("Enter the Weight in Pounds");
		double weightInPounds = sc.nextDouble();
		double weightToKg = (1/2.2)*weightInPounds;
		System.out.println("The weight of the person in pound is "+weightInPounds+" and in kg is "+weightToKg);
		
	}
}
