package PracticeProblem1;

import java.util.Scanner;

public class CodePracticeTwo {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		findAge();
		avgPercentage();
		distToMiles();
		profitAndLossPercent();
		divideEqually();
		findDiscount();
		volumeOfEarth();
		kilometerToMiles();
		DiscountThroughUserIp();
		heightToFeet();
		basicCalculator();
		areaOfTriangle();
		sideOfSquare();
		distanceInYards();
		calculateTotalPrice();
		maxHandShakes();
		
		}
	
	private static void findAge() {
		
		String name = "Harry";
		System.out.println("Enter the Birth year of Harry: ");
		int currentYear = 2024;
		int year = sc.nextInt();
		if(year <= 2024) {
			System.out.println(name+"'s age in 2024 is : "+(currentYear - year));
		}else {
			System.out.println("Invalid Input");
		}
		
	}

	private static void avgPercentage() {
			
		String name = "Sam";
		System.out.println("Enter the marks in maths : ");
		int maths = sc.nextInt();
		System.out.println("Enter the marks in Physics : ");
		int physics = sc.nextInt();
		System.out.println("Enter the marks in Chemistry : ");
		int chemistry = sc.nextInt();
		
		if((maths <=100 && maths >= 0) && (physics <=100 && physics >= 0) && (chemistry <=100 && chemistry >= 0)) {
			int average  = (maths+physics+chemistry)/3;
			System.out.println(name+"’s average mark in PCM is : "+average);
		}
		else {
			System.out.println("Invalid Input");
		}
	}

	private static void distToMiles() {
			
		  System.out.println("Enter the Kilometer");
		  float kilometer = sc.nextFloat();
		  double miles = 1.6;
		  System.out.println("Distance of Kilometer "+kilometer+" in miles is :"+kilometer*miles);
		    
	}

	private static void profitAndLossPercent() {
			
		int costPrice = 129;
		int sellingPrice = 191;
		int profit = sellingPrice - costPrice ; 
		int profitPercentage = (profit/costPrice)*100;
		System.out.println("The Cost Price is INR "+129+" and Seling Price is INR "+191+"\nThe Profit in INR "+profit+" and the Profit Percentage is :"+profitPercentage);
		
	}

	private static void divideEqually() {
		
		System.out.println("Enter the numbe of pens");
		int noOfPens = 14;
		int noOfStudents = 3;
		System.out.println("The Pen Per Student is "+(noOfPens/noOfStudents)+" and the remaining pen not distributed is "+noOfPens%noOfStudents);
		
	}

	private static void findDiscount() {
		
		long fee = 125000 ; 
		long discountPercent  = 10;
		double discount = fee*(10/100);
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR"+(fee-discount));
		
	}

	private static void volumeOfEarth() {
		
		double radiusOfEarth = 6378;
        double miles = 0.621371;
        double volumeKm3 = (4/3) * Math.PI * Math.pow(radiusOfEarth, 3);
        double radiusMiles = radiusOfEarth * miles;
        double volumeMiles3 = (4/3) * Math.PI * Math.pow(radiusMiles, 3);
		
		System.out.println("The volume of earth in cubic kilometers is"+volumeKm3+" and cubic miles is "+volumeMiles3);
		
	}

	private static void kilometerToMiles() {
		
		double km = sc.nextDouble();
		double mile = 0.6213;
		System.out.println("The Total miles is "+(km*mile)+"for the given "+km+" km");
		
	}

	private static void DiscountThroughUserIp() {
		
		System.out.println("Enter the Student Fee");
		long fee = sc.nextLong();
		System.out.println("Enter the University discount");
		long discount = sc.nextLong();
		long discountedAmt = fee*(discount/100);
		System.out.println("The discount amount is INR "+discountedAmt+" and final discounted fee is INR "+(fee-discountedAmt));
		
	}

	private static void heightToFeet() {
		
		System.out.println("Enter your height in centimeters");
		double height = sc.nextDouble();
		double heightInInches = height*(1/2.54);
		double heightInFeet = heightInInches*12;
		System.out.println("Your Height in cm is "+height+" while in feet is "+heightInFeet+" and inches is "+heightInInches);
		
	}

	private static void basicCalculator() {
		
		System.out.println("Enter the First number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number :");
		int num2 = sc.nextInt();
		System.out.println("Basic Calcuator Operation ");
		System.out.println("1.Addition \n2.Subration \n3.Multiplication \n4.Division \nSelect Your Choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("The Addition of "+num1+" and "+num2+" is : "+(num1+num2));
			break;
		case 2:
			System.out.println("The Subtraction of "+num1+" and "+num2+" is : "+(num1-num2));
			break;
		case 3:
			System.out.println("The Multiplication of "+num1+" and "+num2+" is : "+(num1*num2));
			break;
		case 4:
			System.out.println("The Division of "+num1+" and "+num2+" is : "+(num1/num2));
			break;	
		
		}
		
		
		
	}

	private static void areaOfTriangle() {
		
		double inchToCm = 2.54 ; 
		double sqInchToCm = 2.54*2.54;
		System.out.println("Enter the base of the Triangle");
		double base = sc.nextInt();
		System.out.println("Enter the height of the Triangle");
		double height = sc.nextInt();
		double areaOfTriangleInSqInches = (0.5)*base*height;
		System.out.println("Area of a triangle in square inches is "+areaOfTriangleInSqInches+" and square centimeters is "+(areaOfTriangleInSqInches*sqInchToCm));
		
	}

	private static void sideOfSquare() {
		
		System.out.println("Enter the perimeter Of the Square");
		double perimeter = sc.nextDouble();
		System.err.println("The length of the side is "+ (perimeter/4)+"whose perimeter is "+perimeter);
	}

	private static void distanceInYards() {
		
		System.out.println("Enter the distance in feet");
		double dist = sc.nextDouble();
		double feetToYards = dist*(1/3);
		double yardToMile = feetToYards*(1/1760);
		System.out.println("The distance in yards and miles for the distance provided is "+feetToYards+" and "+yardToMile);
	}

	private static void calculateTotalPrice() {
		
		System.out.println("Enter the price of the Item");
		double unitprice = sc.nextDouble();
		System.out.println("Enter the Quantity");
		int quantity = sc.nextInt();
		System.err.println("The total purchase price is INR "+(unitprice*quantity)+" if the quantity "+quantity+" and unit price is INR "+unitprice);	
		
	}

	private static void maxHandShakes() {
		
		System.out.println("Enter the Number Of Students");
		int n = sc.nextInt(); // number of students
		int handshakes = (n*(n-1))/2;
		System.err.println("The Maximum number of possible handshakes is : "+handshakes);
		
	}

	

}
