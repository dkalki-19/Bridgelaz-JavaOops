package PracticeProblem1;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsLevel2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		findFactors();
		sumNumberUsingrecursion();
		leapYear();
		unitConvertorByDistance();
		unitConvertorByHeight();
		unitConvertorByTemperature();
		votingEligibilityForStudents();
		youngestOfThree();
		comparisonWithNumber();
		calculateBMI();
		findRoots();
		minMax();
	}

	private static void findFactors() {
		
		System.out.println("Enter the number");
		long number = sc.nextLong();
	    long[] factors = getFactorsOfGivenNumber(number);
	    System.out.println("The Sum Of the Factors is "+ sumOfFactors(factors));
	    System.out.println("The Product Of the Factors is "+ productOfFactors(factors));
	    System.out.println("The Sum of Square Of the Factors is "+ sumOfSquareOfFactors(factors));

	}
	

	private static long sumOfSquareOfFactors(long[] factors) {
		long sumOfSquaresFactors = 0;
		for(int i=0;i<factors.length;i++) {
			sumOfSquaresFactors+=Math.pow(factors[i],2);
		}
		return sumOfSquaresFactors;
	}

	private static long productOfFactors(long[] factors) {
		long productOfFactors = 1;
		for(int i=0;i<factors.length;i++) {
			if(factors[i]!=0) {
				productOfFactors*=factors[i];
			}
		}	
		return productOfFactors;
	}
	
	private static long sumOfFactors(long[] factors) {
		long sumOfFactors = 0;
		for(int i=0;i<factors.length;i++) {
			sumOfFactors+=factors[i];
		}
		return sumOfFactors;
	}

	private static long[] getFactorsOfGivenNumber(long number) {
		int maxFactors = 10;
		int index = 0;
		long[] factors = new long[maxFactors];
		for(int i=1;i<factors.length;i++) {
			if(index==maxFactors) {
				maxFactors = 2*maxFactors;
				long[] temp = new long[maxFactors];
				for(int k=0;k<index;k++) {
					temp[k] = factors[k];
				}
				factors = temp;
			}
			if(number%i==0) {
				factors[i] = i;
				index++;
			}
		}
		
		return factors;
	}

	private static void sumNumberUsingrecursion() {
		/*
		
		2. Write a program to find the sum of n natural numbers using recursive method and compare 
			the result with the formulae n*(n+1)/2 and show the result from both computations is correct.  
			Hint =>  
			a. Take the user input number and check whether it's a Natural number, if not exit 
			b. Write a Method to find the sum of n natural numbers using recursion 
			c. Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2  
			d. Compare the two results and print the result 
		
		*/
		
		System.out.println("Enter the Number : ");
		long number = sc.nextLong();
		while(number<=0) {
			System.out.println("Enter a valid Number");
			number = sc.nextLong();
		}
		System.out.println((sumByRecursion(number)==sumByFormula(number))?"Both gives same result":"Result differs");
		
	}

	private static long sumByFormula(long n) {
		return n*(n+1)/2;
	}

	private static long sumByRecursion(long n) {
		if(n==1) return 1;
		return n+sumByRecursion(n-1);
	}

	private static void leapYear() {
		System.out.println("Enter the year");
		int year = sc.nextInt();
		while(year<1584) {
			System.out.println("Enter year greater than or equal to 1538");
			year = sc.nextInt();
		}
		isLeapyear(year);
	}

	private static void isLeapyear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}		
	}

	private static void unitConvertorByDistance() {
		System.out.println("Enter the Kilometers");
		double km = sc.nextDouble();
		System.out.println("The Miles for the Given Kilometer is :"+convertKmToMiles(km));
		System.out.println("Enter the miles");
		double miles = sc.nextDouble();
		System.out.println("The kilometers for the Given Miles is :"+convertMilesToKm(miles));
		System.out.println("Enter the Meters");
		double meters = sc.nextDouble();
		System.out.println("The Feet for the Given Meters is :"+convertMetersTofeet(meters));
		System.out.println("Enter the Feet");
		double feet = sc.nextDouble();
		System.out.println("The Meters for the Given Feet is :"+convertfeetToMeters(feet));

	}

	private static double convertKmToMiles(double km) {
		// 1 km = 0.621371 mile
	     return km * 0.621371;
	}

	private static double convertMilesToKm(double miles) {
		// 1 mile = 1.60934 km
        return miles * 1.60934;
	}

	private static double convertMetersTofeet(double meters) {
		// 1 meter  = 3.28084 feet
        return meters * 3.28084;
    }

	private static double convertfeetToMeters(double feet) {
		// 1 feet = 0.3048 m
        return feet * 0.3048;	
    }

	
	
	
	private static void unitConvertorByHeight() {
		/*
		
		Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do 
		the following.  Please define static methods for all the UnitConvertor class methods. E.g.  
		public static double convertYardsToFeet(double yards) =>  
		a. Method to convert yards to feet and return the value. Use following code to convert  
		double yards2feet = 3; 
		b. Method to convert feet to yards and return the value. Use following code to convert  
		double feet2yards = 0.333333; 
		c. Method to convert meters to inches and return the value. Use following code to convert  
		double meters2inches = 39.3701; 
		d. Method to convert inches to meters and return the value. Use following code to convert  
		double inches2meters = 0.0254; 
		e. Method to convert inches to centimeters and return the value. Use the following code  
		double inches2cm = 2.54; 
		
		
		*/
		System.out.println("Enter the Yards : ");
		double yards = sc.nextDouble();
		convertYardsToFeets(yards);
		System.out.println("Enter the Feets : ");
		double feets = sc.nextDouble();
		convertFeetToYards(feets);
		System.out.println("Enter the Meters : ");
		double meters = sc.nextDouble();
		convertMetersToInches(meters);
		System.out.println("Enter the Inches : ");
		double inches = sc.nextDouble();
		convertInchesToMeters(inches);
		System.out.println("Enter the Inches : ");
		double inche = sc.nextDouble();
		convertInchesToCentimeters(inche);
		
	}

	private static double convertYardsToFeets(double yards) {
		double yards2feet = 3.0;
        return yards * yards2feet;
	}

	private static double convertFeetToYards(double feet) {
		double feet2yards = 0.333333;
        return feet * feet2yards;
	}

	private static double convertMetersToInches(double meters) {
		double meters2inches = 39.3701;
        return meters * meters2inches;
	}

	private static double convertInchesToMeters(double inches) {
		double inches2meters = 0.0254;
        return inches * inches2meters;
	}

	private static double convertInchesToCentimeters(double inche) {
		 double inches2cm = 2.54;
	     return inche * inches2cm;
	}

	
	
	private static void unitConvertorByTemperature() {
		
		System.out.println("98.6°F to Celsius: " + convertFahrenheitToCelsius(98.6));
        System.out.println("37°C to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("150 pounds to kilograms: " + convertPoundsToKilograms(150));
        System.out.println("68 kilograms to pounds: " + convertKilogramsToPounds(68));
        System.out.println("5 gallons to liters: " + convertGallonsToLiters(5));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
	
	}
        // a. Fahrenheit to Celsius
 	public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // b. Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // c. Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // d. Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // e. Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // f. Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
	
	

	private static void votingEligibilityForStudents() {
		
		int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            boolean canVote = canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Invalid age entered. Age cannot be negative.");
            } else if (canVote) {
                System.out.println("Student "+(i+1)+" is eligible to vote.");
            } else {
                System.out.println("Student "+(i+1)+" is not eligible to vote.");
            }
        }
		
	}

	private static boolean canStudentVote(int age) {
		if (age < 0) {
            return false; 
        } else if (age >= 18) {
            return true; 
        } else {
            return false;
        }
	}

	private static void youngestOfThree() {
		String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
	}
	
	public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    }

    public static String findTallest(String[] names, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }

	private static void comparisonWithNumber() {
		int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print("Number is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number is negative.");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last elements: ");
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is less than the last number.");
        }
	}
	
	public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

	private static void calculateBMI() {
		double[][] data = new double[10][3];
        String[] statuses = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (in cm): ");
            data[i][1] = sc.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]); // BMI
            statuses[i] = getBMIStatus(data[i][2]);
        }
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", data[i][0], data[i][1], data[i][2], statuses[i]);
        }
	}
	public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm to meters
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.4) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 40) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

	private static void findRoots() {
		 System.out.print("Enter value for a: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter value for b: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter value for c: ");
	        double c = sc.nextDouble();

	        double[] roots = findRoots(a, b, c);

	        if (roots.length == 2) {
	            System.out.printf("Two real roots: x1 = %.2f, x2 = %.2f\n", roots[0], roots[1]);
	        } else if (roots.length == 1) {
	            System.out.printf("One real root: x = %.2f\n", roots[0]);
	        } else {
	            System.out.println("No real roots.");
	        }
	}

	public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[] {};
        }
    }
	
	private static void minMax() {
		int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));
        double[] stats = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.printf("Minimum: %.0f\n", stats[1]);
        System.out.printf("Maximum: %.0f\n", stats[2]);
	}
	
	 public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / (double) numbers.length;
        return new double[]{average, min, max};
    }

}
