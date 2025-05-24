package PracticeProblem1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLevelOne {
	
	static Scanner sc  =  new Scanner(System.in);
	
	public static void main(String[] args) {
		votingEligibility();
		oddOrEvenWithPositiveAndNegative();
		multiplicationTable();
		storeMultipleValues();
		multiplicationFromRange();
		meanHeightOfFootballPlayers();
		oddOrEven();
		factorsOfNumber();
		multiToSingleDimension();
		fizzBizz();
	}

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	private static void votingEligibility() {
		
		int[] students = new int[10];
		for(int i=0;i<students.length;i++) {
			System.out.println("Enter the age of Student "+(i+1));
			students[i] = sc.nextInt();
			if(students[i]>=18) {
				System.out.println("The Student with the age "+students[i]+" can vote");
			}
			else {
				System.out.println("The Student with the age "+students[i]+" cannot vote");
			}
		}
	
	}

	private static void oddOrEvenWithPositiveAndNegative() {
		
		int[] numbers = new int[5];
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Enter number "+(i+1));
			numbers[i] = sc.nextInt();
			if(numbers[i]>0) {
				if(numbers[i]%2==0) {
					System.out.println("The entered number "+numbers[i]+" is even number: ");
				}else{
					System.out.println("The entered number "+numbers[i]+" is odd number: ");
				}
			}
			else if(numbers[i]<0) {
				System.out.println("The entered number "+numbers[i]+" is a negative number: ");
			}
			else {
				System.out.println("The entered number "+numbers[i]+" is zero: ");
			}
		}
		if(numbers[0]>numbers[numbers.length-1]) {
			System.out.println("The first entered element is greater than the last entered element");
		}
		else if(numbers[0]<numbers[numbers.length-1]){
			System.out.println("The first entered element is lesser than the last entered element");
		}
		else {
			System.out.println("The first entered element and the last entered element are equal");
		}
	}

	private static void multiplicationTable() {
		
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i]=(i+1)*num;
			System.out.println((i+1)+"*"+num+"="+arr[i]);
		}
		
	}

	private static void storeMultipleValues() {
		
		int[] arr = new int[10];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the number "+(i+1));
			int value = sc.nextInt();
			if(value == 0 || value<0) {
				break;
			}
			else {
				arr[i]=value;
				sum = sum+arr[i];
			}
		}
		System.out.println("The Array Elements Are :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nThe sum of all the Elements is "+sum);
		
	}

	private static void multiplicationFromRange() {
		
		System.out.println("Enter the Number from range 6 to 9:");
		int num = sc.nextInt();
		if(num >=6 && num<=9) {
			int[] multiplicationResult = new int[10];
			for(int i = 0;i<multiplicationResult.length;i++) {
				multiplicationResult[i]=(i+1)*num;
				System.out.println((i+1)+"*"+num+"="+multiplicationResult[i]);
			}
		}
		else {
			System.out.println("Enter the valid input");
		}
		
		
		
	}

	private static void meanHeightOfFootballPlayers() {
		
		double[] players = new double[11];
		double sum = 0.0;
		for(int i=0;i<players.length;i++) {
			System.out.println("Enter the height of player "+(i+1));
			players[i]=sc.nextDouble();
			sum = sum+players[i];
		}
		System.out.println("The mean of all the players is :"+(sum/11));
		
	}

	private static void oddOrEven() {	
		
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int[] odd = new int[(number/2)+1];
		int[] even = new int[(number/2)+1];
		int j = 0;
		int k = 0;
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				even[j] = i;
				j++;
			}
			else {
				odd[k] = i;
				k++;
			}
		}
		System.out.println("The even Numbers are : ");
		for(int e = 0;e<even.length;e++) {
			if(even[e]!=0) {
				System.out.print(even[e]+" ");
			}
		}
		System.out.println("\nThe odd Numbers are : ");
		for(int o = 0;o<odd.length;o++) {
			if(odd[o]!=0) {
				System.out.print(odd[o]+" ");
			}
		}
		
		
		
	}

	private static void factorsOfNumber() {
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0;
		for(int i = 1;i<=number;i++) {
			if(number%i==0) {
				if(index==maxFactor) {
					maxFactor = maxFactor*2;
					int[] temp = new int[maxFactor];
					for(int j=0;j<index;j++) {
						temp[j]=factors[j];
					}
					factors = temp;
				}
				factors[index] = i;
				index++;
			}
		}
		
		System.out.println("The factors of the given number are : ");
		for(int f = 0;f<factors[f];f++) {
			System.out.print(factors[f]+" ");
		}
		
	}

	private static void multiToSingleDimension() {
		
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the Number of columns : ");
		int columns = sc.nextInt();
		int[] res = new int[rows*columns];
		int[][] arr = new int[rows][columns];
		int k = 0;
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("Enter the element :");
				arr[i][j] = sc.nextInt();
				res[k]=arr[i][j];
				k++;
			}
		}
		for(int r=0;r<res.length;r++) {
			System.out.print(res[r]+" ");
		}
	}

	private static void fizzBizz() {
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		for(int i=1;i<=num;i++) {
			if(i%3 == 0 && i%5 != 0) {
				arr[i-1] = "Fizz";
			}
			else if(i%5 == 0 && i%3 != 0) {
				arr[i-1]="Buzz";
			}
			else if(i%5 == 0 && i%3 == 0){
				arr[i-1]="FizzBuzz";
			}
			else {
				arr[i-1]=String.valueOf(i);
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}	
}
