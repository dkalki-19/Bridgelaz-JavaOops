package PracticeProblem1;

import java.util.Random;
import java.util.Scanner;

public class ExtrasPracticePrograms {
	static Scanner sc = new Scanner(System.in);
	static int min = 1;
	static int max = 100;
	static int number = 0;
	public static void main(String[] args) {
		guessTheNumber();
		maximumOfThree();
		primeNumberChecker();
		fibonacciSequence();
		pallindromeChecker();
		factorialsingRecursion();
		gcdAndLcmCalculator();
		temperatureConvertor();
		basicCalculator();
	}
	
	private static void guessTheNumber() {
		System.out.println("Guess a number between 1 to 100 :");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		number = generateNumber(min,max);
        System.out.println("Whether the number "+number+" is high or low or correct to your guessed number");
        String response = sc.next();
        
        while(!response.equals("correct")) {
        	number = checkResponse(response,number);
            System.out.println("Whether the number "+number+" is high or low or correct to your guessed number");
            response = sc.next();
            if(response.equals("correct")) {
            	System.out.println("Thanks for playing !");
            	break;
            }
        }		
	}

	private static int generateNumber(int min, int max) {
		Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
	}

	private static int checkResponse(String response,int number) {
		if(response.equals("low")) {
			min = number;
		}
		else if(response.equals("high")) {
			max = number;
		}
		return generateNumber(min,max);
	}
	
	
	private static void maximumOfThree() {
		Scanner scanner = new Scanner(System.in);

        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
	}
	public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
	private static void primeNumberChecker() {
		System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
	}
	 public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }

        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; 
	    }
	private static void fibonacciSequence() {
		System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = sc.nextInt();

        printFibonacci(terms);
	}
	public static void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); 
    }
	private static void pallindromeChecker() {
		String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
	}
	public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[\\W_]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String input, boolean result) {
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
	private static void factorialsingRecursion() {
		int number = getInputFac();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            displayResult(number, factorial);
        }
	}
	public static int getInputFac() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1); 
    }

    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

	private static void gcdAndLcmCalculator() {
		int num1 = getInputGL(sc, "Enter the first number: ");
        int num2 = getInput(sc, "Enter the second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        displayRes(num1, num2, gcd, lcm);
	}
	 public static int getInputGL(Scanner scanner, String prompt) {
	        System.out.print(prompt);
	        return scanner.nextInt();
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void displayRes(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

	private static void temperatureConvertor() {
		int choice = getConversionChoice(sc);

        if (choice == 1) {
            double fahrenheit = getTemperatureInput(sc, "Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f °F = %.2f °C\n", fahrenheit, celsius);
        } else if (choice == 2) {
            double celsius = getTemperatureInput(sc, "Enter temperature in Celsius: ");
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f °C = %.2f °F\n", celsius, fahrenheit);
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double getTemperatureInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static int getConversionChoice(Scanner scanner) {
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        return scanner.nextInt();
    }
	private static void basicCalculator() {
		double num1 = getNumberInput(sc, "Enter the first number: ");
        double num2 = getNumberInput(sc, "Enter the second number: ");
        int choice = getUserChoice(sc);

        double result;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

	}
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static int getUserChoice(Scanner scanner) {
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt();
    }

    public static double getNumberInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

	

}
