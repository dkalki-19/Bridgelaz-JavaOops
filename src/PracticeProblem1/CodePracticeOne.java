package PracticeProblem1;

import java.util.Scanner;

public class CodePracticeOne {

	
	public static void main(String[] args) {
		
//		welcome();
//		addTwoNum();
//		celsiusToFahrenheit();
		areaOfCircle();
//		volumeOfCylinder();
//		simpleInterest();
//		perimeterOfRect();
//		powerCalculation();
//		avgofThreeNumbers();
//		kilometersToMiles();

		
	}

	private static void welcome() {
		System.out.println("Welcome to Bridgelabz!");
		
	}

	private static void addTwoNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("The Sum of the given two number is  : "+(num1+num2));
		
		
	}

	private static void celsiusToFahrenheit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celcius : ");
		float temp = sc.nextFloat();
		float fahrenheit = (temp * 9/5)+32;
		System.out.println("Fehrenheit : "+ fahrenheit);
		
	}

	private static void areaOfCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		double pi = 22/7;
		System.out.println("Area Of the Circle is : "+pi*radius*radius);
		
	}

	private static void volumeOfCylinder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder : ");
		double radius = sc.nextDouble();
		System.out.println("Enter the height of the cylinder : ");
		double height = sc.nextDouble();
		double pi = 22/7;
		System.out.println("Volume of the Cylinder is : "+pi*radius*radius*height);
		
	}

	private static void simpleInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal : ");
		double principal = sc.nextDouble();
		System.out.println("Enter the Rate : ");
		double rate = sc.nextDouble();
		System.out.println("Enter the Time : ");
		double time = sc.nextDouble();
		System.out.println("The Simple Interest is : "+(principal*rate*time)/100);
		
	}

	private static void perimeterOfRect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		double length = sc.nextDouble();
		System.out.println("Enter the Width : ");
		double width = sc.nextDouble();
		System.out.println("The perimeter of the rectangle is : "+2*(length+width));
		
	}

	private static void powerCalculation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		double base = sc.nextInt();
		System.out.println("Enter the exponent : ");
		int exponent = sc.nextInt();
		double ans = Math.pow(base,exponent);
		System.out.println("Power Value is  : "+ans);
		
	}

	private static void avgofThreeNumbers() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter the num3 : ");
		int num3 = sc.nextInt();
		
		if(num1 == num2) {
			if(num1 == num3) {
				System.out.println("All three given Numbers are Equal");
			}
			else if(num1 > num3) {
				System.out.println(num1+" is the greatest");
			}
			else {
				System.out.println(num3+" is the greatest");
			}
		}
		else if(num1 == num3){
			if(num1 > num2) {
				System.out.println(num1+" is the greatest");
			}
			else {
				System.out.println(num2+" is the greatest");
			}
			
		}
		
		if(num1 > num2 && num1 > num3) {
			if(num1 > num3) {
				System.out.println(num1+" is the greatest");
			}
			else {
				System.out.println(num3+" is the greatest");
			}
			
		}
		else if(num1 < num2){
			if(num1 > num3) {
				System.out.println(num2+" is the greatest");
			}
			else if(num2 < num3) {
				System.out.println(num3+" is the greatest");
			}
			else if(num1 !=num3){
				System.out.println(num2+" is the greatest66");
			}

		}
		
	}

	private static void kilometersToMiles() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance in Kilometers :");
		double kilometer = sc.nextDouble();
		double miles = kilometer * 0.621371;
		System.out.println("The Kilometer in Miles is : "+ miles);
		
		
	}
	
}
