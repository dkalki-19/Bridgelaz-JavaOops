package PracticeProblem1;

import java.util.Scanner;

public class MethodsLevel1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		simpleInterest();
		handShakes();
		maxHandShakes();
		noOfRoundAthlete();
		checkNumber();
		isSpringSeason();
		sumOfNaturalNum();
		findSmallestAndLargest();
		findRemAndQuo();
		findRemainingChocholates();
		calculateWindChill();
		trigonometricFunctions();
		
	}

	// 1. Calculate simple interest 
	
	private static void simpleInterest() {
		
		System.out.println("Enter the Principal : ");
		double principal = sc.nextDouble();
		System.out.println("Enter the Rate : ");
		double rate = sc.nextDouble();
		System.out.println("Enter the Time : ");
		double time = sc.nextDouble();
		calculateSI(principal,rate,time);
		
	}
	
	private static void calculateSI(double principal, double rate, double time) {
		double simpleInterest = (principal*rate*time)/100;
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
	
	// 2. Calculate No of handshakes
	private static void handShakes() {
		System.out.println("Enter the Number Of Students");
		int n = sc.nextInt(); 
		calculateNoOfHandshakes(n);
	}


	private static void calculateNoOfHandshakes(int n) {
		int handshakes = (n*(n-1))/2;
		System.out.println("The Maximum number of possible handshakes is : "+handshakes);
	}
	
	// 3. Calculate maximum no of possible handshakes
	
	private static void maxHandShakes() {
		System.out.println("Enter the Number Of Students");
		int numberOfStudents = sc.nextInt(); 
		calculateNoOfHandshakes(numberOfStudents);
	}

	// 4. Calculate no of rounds completed by athlete
	
	private static void noOfRoundAthlete() {
		System.out.println("Enter side1 of a triangle");
		double side1 = sc.nextDouble();
		System.out.println("Enter side2 of a triangle");
		double side2 = sc.nextDouble();
		System.out.println("Enter side3 of a triangle");
		double side3 = sc.nextDouble();
		double distance = 5000;
		calculateRounds(side1, side2, side3,distance);
		
	}

	private static void calculateRounds(double side1, double side2, double side3,double distance) {
		double perimeterOfTriangle = side1+side2+side3;
		double rounds  = distance/perimeterOfTriangle;
		System.out.println("The total number of rounds the athlete will run is "+rounds+"  to complete 5 km");
		
	}
	
	// 5. Find number is positive or negative
	
	private static void checkNumber() {
		System.out.println("Enter the Number");
		int number =  sc.nextInt();
		int res = isPositiveorNot(number);
		if(res == -1) {
			System.out.println("The given Number is Negative Number");
		}
		else if(res==1){
			System.out.println("The given Number is Positive Number");
		}
		else {
			System.out.println("The given number is Zero");
		}
	}

	private static int isPositiveorNot(int number) {
		if(number>0) {
			return 1;
		}
		else if(number<0) {
			return -1;
		}
		else {
			return 0;
		}
	}

	// 6. Check the season for Spring
	private static void isSpringSeason() {
		System.out.println("Enter the Month");
		int month = sc.nextInt();
		System.out.println("Enter the Day");
		int day = sc.nextInt();
		boolean season =  checkSeason(day,month);
		System.out.println(season?"Its a Spring Season":"Not a Spring Season");
	}



	private static boolean checkSeason(int day,int month) {
		if(month>=3 && month <=6 && day>=1 && day<=31) {
			if(((month==3 || month==5)&&(day>=1 && day<=31))||(month == 4 && (day>=1 && day<=30))||(month == 6 && (day>=1 && day<=20))){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	// 7. Calculate Sum of N natural Numbers

	private static void sumOfNaturalNum() {
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		calculateSum(num);
		
	}

	private static void calculateSum(int num) {
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
	}

	// 8. Find the smallest and Largest 
	
	private static void findSmallestAndLargest() {
		System.out.println("Enter the First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number :");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number :");
		int num3 = sc.nextInt();
		findGreatestAndSmallest(num1,num2,num3);
		

	}

	private static void findGreatestAndSmallest(int num1, int num2, int num3) {
		int greatest = 0;
		int smallest = 0;
		if(num1>num2 && num2>num3) {
			greatest  = num1;			
			smallest = num3;	
		}
		else if(num2>num3 && num3>num1) {
			greatest = num2;
			smallest = num1;	
		}
		else if(num3>num1 && num1>num2) {
			greatest = num3;
			smallest = num2;
		}	
		System.out.println("The Largest of three is : "+greatest);
		System.out.println("The Smallest of three is : "+smallest);
	}


	// 9. Calculate the remainder and Quotient

	private static void findRemAndQuo() {

		
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		findRemainderAndQuotient(num1,num2);
		
	}

	private static void findRemainderAndQuotient(int num1, int num2) {
		System.out.println("The Quotient is "+(num1/num2)+" and Reminder is "+(num1%num2)+" of two number "+num1+" and "+num2);
	}
	
	// 10. Calculate the No of chocolates
	
	private static void findRemainingChocholates() {
		System.out.println("Enter the Number Of Chocolates");
		int countOfChocolates = sc.nextInt();
		System.out.println("Enter the Number Of Children");
		int countOfChildren = sc.nextInt();
		calculateRemainingChocolates(countOfChocolates,countOfChildren);		
	}

	private static void calculateRemainingChocolates(int countOfChocolates, int countOfChildren) {
		int chocolatesChildrenGet = countOfChocolates/countOfChildren;
		int remainingChocolates = countOfChocolates%countOfChildren;
		System.out.println("The number of chocolates each child gets is "+chocolatesChildrenGet+" and the number of remaining chocolates are "+remainingChocolates);	
	}
	
	// 11. Calculate WindChillness
	private static void calculateWindChill() {
		System.out.println("Enter the Temperature");
		double temperature = sc.nextDouble();
		System.out.println("Enter the Wind Speed");
		double windSpeed = sc.nextDouble();
		double ans = findwindChill(temperature,windSpeed);
		System.out.println("The wind chill for the given temperature and wind speed is : "+ans);
		
	}


	private static double findwindChill(double temperature, double windSpeed) {
 		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed,0.16);
 		return windChill;
	}

	// 12. Perform math Trigonometric Functions
	private static void trigonometricFunctions() {
		System.out.println("Enter the angle in degrees");
		double degree = sc.nextDouble();
		double[] res = performTrigonometricFunction(degree);
		System.out.println("The sin, cos and tan value for the given angle is :"+res[0]+" "+res[1]+" "+res[2]);
	
	}
	private static double[] performTrigonometricFunction(double degree) {
		double radians = Math.toRadians(degree);
		
		double[] res = new double[3];
		res[0] = Math.sin(radians);
		res[1] = Math.cos(radians);
		res[2] = Math.tan(radians);
		return res;	
	}
	
	
}
