package PracticeProblem1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MethodsLevel3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			tallestInFootball();
			numberCheckerArmstrong();
			harshadNumber();
			palindromeNumber();
			automorphicNumber();
			numberCheckerWithFactors();
			validateOTP();
			calender();
			euclideanDistance();
			collinearPoints();
			generateBonus();
			calculatePercentAndGrade();
			matrixManipulation();
			
			
	}

	private static void tallestInFootball() {
		double[] height = new double[11];
		for(int i = 0;i<11;i++) {
			System.out.println("Enter the Height of Student "+(i+1)+" in cms");
			height[i]= sc.nextDouble();
		}
		System.out.println("The sum of the heights of the students is "+calculateSumOfHeights(height));
		System.out.println("The mean of the heights of the students is "+calculateMeanOfHeights(height));
		System.out.println("The shortest of the heights of the students is "+calculateShortestOfHeights(height));
		System.out.println("The tallest of the heights of the students is "+calculateTallestOfHeights(height));

		
	}

	private static double calculateSumOfHeights(double[] height) {
		double sum = 0;
		for(int i=0;i<height.length;i++) {
			sum+=height[i];
		}
		return sum;
	}

	private static double calculateMeanOfHeights(double[] height) {
		double mean  = calculateSumOfHeights(height)/height.length;	
		return mean;
	}

	private static double calculateShortestOfHeights(double[] height) {
		double shortest = 0;
		for(int i=0;i<height.length;i++) {
			if(height[i]<shortest) {
				shortest = height[i];
			}
		}
		return shortest;
	}

	private static double calculateTallestOfHeights(double[] height) {
		double tallest = 0;
		for(int i=0;i<height.length;i++) {
			if(height[i]>tallest) {
				tallest = height[i];
			}
		}
		return tallest;
	}

	private static void numberCheckerArmstrong() {
		System.out.println("Enter the Number :");
		long number = sc.nextLong();
		long givenNo = number;
		long count = countOfDigits(number);
		number = givenNo;
		System.out.println("Count of the Digits :"+countOfDigits(number));
		storeDigitsInArray(number);
		System.out.println("Is Duck Number : "+checkIfDuckNumber(number));
		System.out.println("Is Armstrong Number : "+checkIfArmStrongNumber(number,count));
		largestAndSecondLargest(number);
		smallestAndSecondSmallest(number);
		
		
	}

	private static int countOfDigits(long number) {
		int digits = 0;
		long givenNo = number;
		while(number!=0) {
			number=number/10;
			digits++;
		}
		number = givenNo;
		return digits;
	}

	private static long[] storeDigitsInArray(long number) {
		long givenNo = number;
		long[] digits = new long[countOfDigits(number)];
		for(int i=0;i<digits.length;i++) {
			digits[i]=number%10;
			number = number/10;	
		}
		number = givenNo;
		return digits;
	}

	private static boolean checkIfDuckNumber(long number) {
		long[] digits = storeDigitsInArray(number);
		boolean isZeroPresent = false;
		for(int i = 0;i<digits.length;i++) {
			if(digits[i]!=0) {
				isZeroPresent = true;
			}
		}
		return isZeroPresent;
	}

	private static boolean checkIfArmStrongNumber(long num, long count) {
		long givenNo = num;
		long rem = 0;
		long sum = 0; 
		while(num!=0) {
			rem = num%10;
			sum =  sum+multiplyByDigits(rem,count);
			num=num/10;
		}
		return (sum==givenNo);		
	}
	
	private static long multiplyByDigits(long rem,long count) {
		long remainder = 1;
		for(int i = 1;i<=count;i++) {
			remainder*=rem;
		}
		return remainder;
		
	}

	private static void largestAndSecondLargest(long number) {
		long largest = Integer.MIN_VALUE;
		long secondLargest = Integer.MIN_VALUE;
		long[] digits = storeDigitsInArray(number);
		
		for(int i = 0;i<digits.length;i++) {
			if(largest<digits[i]) {
				largest = digits[i];
			}
			if(digits[i]<largest && secondLargest<digits[i] ) {
				secondLargest = digits[i];
			}
		}
		System.out.println("Largest :"+largest);
		System.out.println("Second Largest :"+secondLargest);
	}

	private static void smallestAndSecondSmallest(long number) {
		long smallest = Integer.MAX_VALUE;
		long secondSmallest = Integer.MAX_VALUE;
		long[] digits = storeDigitsInArray(number);
		
		for(int i = 0;i<digits.length;i++) {
			if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i] ;
            } else if (digits[i]  < secondSmallest && digits[i]  != smallest) {
                secondSmallest = digits[i] ;
            }
		}
		System.out.println("Smallest :"+smallest);
		System.out.println("Second Smallest :"+secondSmallest);		
	}

	private static void harshadNumber() {
		long number = 865; 

        int digitCount = countOfDigits(number);
        long[] digits = storeDigitsInArray(number);
        long digitSum = sumOfDigits(digits);
        long digitSquareSum = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digits);
        long[][] frequencies = digitFrequency(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + digitSum);
        System.out.println("Sum of Squares of Digits: " + digitSquareSum);
        System.out.println("Is Harshad Number? " + (isHarshad ? "Yes" : "No"));
        System.out.println("Digit Frequencies:");
        for (long[] row : frequencies) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + " occurs " + row[1] + " time(s)");
            }
        }
	}
	
	 public static int sumOfDigits(long[] digits) {
	        int sum = 0;
	        for (long d : digits) {
	            sum += d;
	        }
	        return sum;
	    }

    public static int sumOfSquares(long[] digits) {
        int sum = 0;
        for (long d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(long number, long[] digits) {
        long sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static long[][] digitFrequency(long[] digits) {
        long[] freq = new long[10]; 
        for (long d : digits) {
            freq[(int) d]++;
        }
        long[][] freqArray = new long[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;
            freqArray[i][1] = freq[i];
        }
        return freqArray;
    }


	private static void palindromeNumber() {
		int number = 98789;  

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        boolean palindrome = isPalindrome(number);
        boolean duck = isDuckNumber(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Is Palindrome? " + (palindrome ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (duck ? "Yes" : "No"));
		
	}
	
	public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

	private static void automorphicNumber() {
		
		/*
		Extend or Create a NumberChecker utility class and perform following task. Call from 
		main() method the different methods and display results. Make sure all are static methods 
		Hint =>  
		a. Method to Check if a number is prime number. A prime number is a number greater than 
		1 that has no positive divisors other than 1 and itself.  
		b. Method to Check if a number is a neon number. A neon number is a number where the 
		sum of digits of the square of the number is equal to the number itself  
		c. Method to Check if a number is a spy number. A number is called a spy number if the 
		sum of its digits is equal to the product of its digits 
		d. Method to Check if a number is an automorphic number. An automorphic number is a 
		number whose square ends with the number itself. E.g. 5 is an automorphic number 
		e. Method to Check if a number is a buzz number. A buzz number is a number that is either 
		divisible by 7 or ends with 7 
		*/
		System.out.println("Enter the Number : ");
		long number  =  sc.nextInt();
		System.out.println("Is Prime Number : "+checkForPrime(number));
		System.out.println("Is Neon Number : "+checkForNeonNumber(number));
		System.out.println("Is Spy Number : "+checkForSpyNumber(number));
		System.out.println("Is Automorphic Number : "+checkForAutomorphicNo(number));
		System.out.println("Is Buzz Number : "+checkForBuzzNumber(number));
		
		
	}


	private static boolean checkForPrime(long num) {
		boolean isPrime = true;
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return isPrime;		
	}

	private static boolean checkForNeonNumber(long number) {
		long squaredNo = number*number;
		long sum = 0 ;
		long rem = 0;
		while(squaredNo!=0) {
			rem = squaredNo%10;
			sum+=rem;
			squaredNo/=10;
		}
		return (sum==number)?true:false;
	}
	
	private static boolean checkForSpyNumber(long number) {
		long givenNo = number;
		long sum = 0 ;
		long product = 1;
		long rem = 0;
		while(givenNo!=0) {
			rem = givenNo%10;
			sum+=rem;
			product*=rem;
			givenNo/=10;
		}
		return (sum==product)?true:false;
	}
	
	private static boolean checkForAutomorphicNo(long number) {
		long squaredNo = number*number;
		long rem = squaredNo%10;	
		return (number == rem)?true:false;
	}
	
	private static boolean checkForBuzzNumber(long number) {
		long divisibleBySeven = number%7;
		long lastDigit = number%10;
		return (divisibleBySeven==0 || lastDigit==7)?true:false;
	}
	
	private static void numberCheckerWithFactors() {
		
		System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest factor (excluding number itself): " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));

        System.out.println("Is Perfect Number? " + isPerfectNumber(num));
        System.out.println("Is Abundant Number? " + isAbundantNumber(num));
        System.out.println("Is Deficient Number? " + isDeficientNumber(num));
        System.out.println("Is Strong Number? " + isStrongNumber(num));
		
	}
	
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max && factor != factors[factors.length - 1]) {
                max = factor;
            }
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int original = number;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == original;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

	private static void validateOTP() {
		int[] otps = generateMultipleOTPs(10);

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        boolean allUnique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + allUnique);
	}

	public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
	static final String[] monthNames = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static final int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };
	
	private static void calender() {
		System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
	}

	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0; 
    }

 
    public static void printCalendar(int month, int year) {
        System.out.println("\n  " + monthNames[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getNumberOfDays(month, year);

        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

      
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
	
	private static void euclideanDistance() {
		System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        if (x1 == x2) {
            System.out.println("The line is vertical. Equation: x = " + x1);
        } else {
            double[] equation = calculateLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        }

	}
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        double m = (y2 - y1) / (x2 - x1);  
        double b = y1 - m * x1;          
        result[0] = m;
        result[1] = b;
        return result;
    }

	private static void collinearPoints() {
		System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeCheck = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Method: " + slopeCheck);

        boolean areaCheck = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Area Method: " + areaCheck);

        if (slopeCheck && areaCheck) {
            System.out.println("Conclusion: Points are collinear.");
        } else {
            System.out.println("Conclusion: Points are not collinear.");
        }

	}

	public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + 
                             x2 * (y3 - y1) + 
                             x3 * (y1 - y2));
        return area == 0.0;
    }

	
	private static void generateBonus() {
		int numEmployees = 10;

        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        calculateAndDisplayTotals(employeeData, bonusData);
	}

	public static int[][] generateEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2]; // [salary, yearsOfService]
        for (int i = 0; i < numEmployees; i++) {
            int salary = (int) (Math.random() * 40000) + 10000; // random 5-digit salary (10000 - 49999)
            int yearsOfService = (int) (Math.random() * 11); // random years of service (0 - 10)
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] result = new double[numEmployees][2]; // [newSalary, bonus]

        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void calculateAndDisplayTotals(int[][] employeeData, double[][] bonusData) {
        int totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "Emp#", "Salary", "Years", "Bonus", "NewSalary");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][1];
            double newSalary = bonusData[i][0];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("\n--- Summary ---");
        System.out.printf("Total Old Salary   : %d\n", totalOldSalary);
        System.out.printf("Total New Salary   : %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Amount : %.2f\n", totalBonus);
    }
	
	private static void calculatePercentAndGrade() {
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = generateRandomScores(numStudents);
        double[][] results = calculateResults(marks);
        String[] grades = assignGrades(results);
        displayScorecard(marks, results, grades);
	}

	
	public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 51) + 50; // Random scores between 50-100
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("\n%-5s %-8s %-10s %-8s %-8s %-10s %-10s %-6s\n",
                "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-10d %-8d %-8.0f %-10.2f %-10.2f %-6s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
	
	private static void matrixManipulation() {
		/*
		
		Write a program to perform matrix manipulation operations like addition, subtraction, 
		multiplication, and transpose. Also finding determinant and inverse of a matrix. The program 
		should take random matrices as input and display the result of the operations. 
		Hint =>  
			a. Write a Method to create a random matrix taking rows and columns as parameters 
			b. Write a Method to add two matrices 
			c. Write a Method to subtract two matrices 
			d. Write a Method to multiply two matrices
			e. Write a Method to find the transpose of a matrix   
			f. Write a Method to find the determinant of a 2x2 matrix  
			g. Write a Method to find the determinant of a 3x3 matrix
			h. Write a Method to find the inverse of a 2x2 matrix 
			i. Write a Method to find the inverse of a 3x3 matrix  
			j. Write a Method to display a matrix
		
		*/
		
		int[][] matrixA = generateMatrix(3, 3);
        int[][] matrixB = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("\nA x B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(matrixA));

        System.out.println("\nDeterminant of 2x2 matrix:");
        int[][] mat2x2 = generateMatrix(2, 2);
        displayMatrix(mat2x2);
        System.out.println("Det: " + determinant2x2(mat2x2));

        System.out.println("\nDeterminant of 3x3 matrix:");
        System.out.println("Det: " + determinant3x3(matrixA));

        System.out.println("\nInverse of 2x2 matrix:");
        double[][] inverse2x2 = inverse2x2(mat2x2);
        displayMatrix(inverse2x2);

        System.out.println("\nInverse of 3x3 matrix:");
        double[][] inverse3x3 = inverse3x3(matrixA);
        displayMatrix(inverse3x3);

	}
	
	 public static int[][] generateMatrix(int rows, int cols) {
	        int[][] matrix = new int[rows][cols];
	        Random rand = new Random();
	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                matrix[i][j] = rand.nextInt(10); // 0-9
	        return matrix;
	    }

	    public static int[][] addMatrices(int[][] A, int[][] B) {
	        int[][] result = new int[A.length][A[0].length];
	        for (int i = 0; i < A.length; i++)
	            for (int j = 0; j < A[0].length; j++)
	                result[i][j] = A[i][j] + B[i][j];
	        return result;
	    }

	    public static int[][] subtractMatrices(int[][] A, int[][] B) {
	        int[][] result = new int[A.length][A[0].length];
	        for (int i = 0; i < A.length; i++)
	            for (int j = 0; j < A[0].length; j++)
	                result[i][j] = A[i][j] - B[i][j];
	        return result;
	    }

	    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
	        int[][] result = new int[A.length][B[0].length];
	        for (int i = 0; i < A.length; i++)
	            for (int j = 0; j < B[0].length; j++)
	                for (int k = 0; k < B.length; k++)
	                    result[i][j] += A[i][k] * B[k][j];
	        return result;
	    }

	    public static int[][] transposeMatrix(int[][] matrix) {
	        int[][] transposed = new int[matrix[0].length][matrix.length];
	        for (int i = 0; i < matrix.length; i++)
	            for (int j = 0; j < matrix[0].length; j++)
	                transposed[j][i] = matrix[i][j];
	        return transposed;
	    }

	    public static int determinant2x2(int[][] mat) {
	        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
	    }

	    public static int determinant3x3(int[][] mat) {
	        return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])
	             - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
	             + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
	    }

	    public static double[][] inverse2x2(int[][] mat) {
	        double det = determinant2x2(mat);
	        if (det == 0) return null;
	        double[][] inv = new double[2][2];
	        inv[0][0] = mat[1][1] / det;
	        inv[0][1] = -mat[0][1] / det;
	        inv[1][0] = -mat[1][0] / det;
	        inv[1][1] = mat[0][0] / det;
	        return inv;
	    }

	    public static double[][] inverse3x3(int[][] mat) {
	        double det = determinant3x3(mat);
	        if (det == 0) return null;
	        double[][] inv = new double[3][3];
	        for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++) {
	                int[][] minor = new int[2][2];
	                for (int mi = 0, row = 0; mi < 3; mi++) {
	                    if (mi == i) continue;
	                    for (int mj = 0, col = 0; mj < 3; mj++) {
	                        if (mj == j) continue;
	                        minor[row][col++] = mat[mi][mj];
	                    }
	                    row++;
	                }
	                inv[j][i] = Math.pow(-1, i + j) * determinant2x2(minor) / det;
	            }
	        return inv;
	    }

	    public static void displayMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row)
	                System.out.printf("%4d", val);
	            System.out.println();
	        }
	    }

	    public static void displayMatrix(double[][] matrix) {
	        if (matrix == null) {
	            System.out.println("Matrix is not invertible (Det = 0)");
	            return;
	        }
	        for (double[] row : matrix) {
	            for (double val : row)
	                System.out.printf("%8.2f", val);
	            System.out.println();
	        }
	    }
	
}
