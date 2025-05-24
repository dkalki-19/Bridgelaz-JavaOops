package PracticeProblem1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLevelTwo {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		findBonus();
		youngestAndTallest();
		largestAndSecondLargest();
		maxDigit();
		reverseTheNumber();
		calculateBMI();
		bmiUsingMultiDimensional();
		calculatePercentAndGrade();
		percentAndGradeUsing2dArray();
		frequencyOfDigits();
	}
	private static void findBonus() {
		double[] salary = new double[10];
		int[] yearsOfExperience = new int[10];
		double[] bonusAmount = new double[10];
		double[] newSalary = new double[10];
		double totalSalary = 0.0;
		double totalBonus = 0.0;
		double totalNewSalary = 0.0;
		
		for(int i = 0;i<10;i++) {
			System.out.println("Enter the Salary for employee "+(i+1));
			double sal = sc.nextDouble();
			System.out.println("Enter the Total years of experience of employee "+(i+1));
			double exp = sc.nextDouble();
			while(sal<=0) {
				System.out.println("Enter the valid Salary for employee "+(i+1));
				sal = sc.nextDouble();
			}
			while(exp<=0) {
				System.out.println("Enter the valid experience for employee "+(i+1));
				exp = sc.nextDouble();
			}
			salary[i] = sal;
			totalSalary = totalSalary+salary[i];
			if(exp>=5) {
				bonusAmount[i] = sal*5/100;
				
			}
			else if(exp<5){
				bonusAmount[i] = sal*2/100;
			}
			totalBonus = totalBonus+bonusAmount[i];
			newSalary[i]=salary[i]+bonusAmount[i];
			totalNewSalary = totalNewSalary+newSalary[i];
			
			System.out.println("The Bonus amount, Old Salary and new Salary of the employee "+(i+1)+" are "+bonusAmount[i]+", "+salary[i]+" and "+newSalary[i]);
		}
		System.out.println("Total OldSalary is :  "+totalSalary);
		System.out.println("Total BonusAmount is : "+totalBonus);
		System.out.println("Total totalNewSalary is :"+totalSalary);
	}
	private static void youngestAndTallest() {
		
		int[] age  = new int[3];
		double[] height = new double[3];
		
		System.out.println("Enter Amar's Age");
		age[0] = sc.nextInt();
		System.out.println("Enter Amar's height");
		height[0] = sc.nextDouble();
		System.out.println("Enter Akbar's Age");
		age[1] = sc.nextInt();
		System.out.println("Enter Akbar's height");
		height[1] = sc.nextDouble();
		System.out.println("Enter Anthony's Age");
		age[2] = sc.nextInt();
		System.out.println("Enter Anthony's height");
		height[3] = sc.nextDouble();
		int youngest = age[0];
		double tallest = height[0];
		for(int i = 0;i<age.length;i++) {
			if(age[i]<youngest) youngest = age[i];
			if(height[i]>tallest ) tallest = height[i];
		}
		if(youngest == age[0]) System.out.println("Amar is the youngest");
		else if(youngest == age[1]) System.out.println("Akbar is the youngest");
		else if(youngest == age[2]) System.out.println("Anthony is the youngest");
		else System.out.println("Tie in comparing the age");
		
		if(tallest == height[0]) System.out.println("Amar is the tallest");
		else if(tallest == height[1]) System.out.println("Akbar is the tallest");
		else if(tallest == height[2]) System.out.println("Anthony is the tallest");
		else System.out.println("Tie in comparing the height");

			

		
	}
	private static void largestAndSecondLargest() {
		System.out.println("Enter the number");
		long num = sc.nextLong();
		int maxDigit =10;
		int[] arr = new int[maxDigit];
		int index = 0;
		int largest = 0;
		int secondLargest = 0;
		while(num!=0) {
			if(index!=maxDigit) {
				arr[index] = (int)num%10;
				if(largest<arr[index]) {
					largest = arr[index];
				}
				if(arr[index]<largest && secondLargest<arr[index] ) {
					secondLargest = arr[index];
				}
				index++;
				num=num/10;
				
			}
			else {
				break;
			}
		}
		System.out.println("Largest : "+largest+"\nSecondLargest :"+secondLargest);
		
	}
	private static void maxDigit() {
		System.out.println("Enter the number");
		long num = sc.nextLong();
		int maxDigit =10;
		long[] arr = new long[maxDigit];
		int index = 0;
		long largest = 0;
		long secondLargest = 0;
		while(num!=0) {
			if(index==maxDigit) {
				maxDigit = maxDigit*2;
				long[] temp = new long[maxDigit];
				for(int i=0;i<index;i++) {
					temp[i]=arr[i];
				}
				arr = temp;
			}
			arr[index] = (long)num%10;
			if(largest<arr[index]) {
				largest = arr[index];
			}
			if(arr[index]<largest && secondLargest<arr[index] ) {
				secondLargest = arr[index];
			}
			index++;
			num=num/10;
		}
		System.out.println("Largest : "+largest+"\nSecondLargest :"+secondLargest);
		
		
	}
	private static void reverseTheNumber() {
		
		System.out.println("Enter the number");
		long num = sc.nextLong();
		long givenNo = num;
		int count = 0;
		while(num !=0) {
			num = num/10;
			count++;
		}
		num = givenNo;
		long[] arr = new long[count];
		for(int i=0;i<arr.length;i++) {
			arr[i]=num%10;
			num=num/10;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Count : "+count);
	}
	private static void calculateBMI() {
		System.out.println("Enter the total number of persons");
		int persons = sc.nextInt();
		double[] weight = new double[persons];
		double[] height = new double[persons];
		double[] bmi = new double[persons];
		String[] status = new String[persons];
		
		for(int i=0;i<persons;i++) {
			System.out.println("Enter the weight of the person "+(i+1));
			weight[i]=sc.nextInt();
			System.out.println("Enter the height of the person "+(i+1));
			height[i]=sc.nextInt();
			double heightInMeter = height[i]/100;
			bmi[i] = weight[i]/(heightInMeter*heightInMeter);
			
			if(bmi[i]<= 18.4) {
				status[i]="Underweight";
			}
			else if(bmi[i]>=18.5 && bmi[i]<=24.9) {
				status[i]="Normal";
			}
			else if(bmi[i]>=18.5 && bmi[i]<=24.9) {
				status[i]="Overweight";
			}
			else if(bmi[i]>=40.0) {
				status[i]="Obese";
			}
			else {
				status[i]="Invaild Input";
			}
			
			System.out.println("The height, weight, BMI and weight status of the person "+(i+1)+" are "+height[i]+", "+weight[i]+", "+bmi[i]+" and "+status[i]);
		}
		
	}
	private static void bmiUsingMultiDimensional() {
		System.out.println("Enter the number of persons : ");
		
		/*
		 0,0  0,1  0,2
		 1,0  1,1  1,2
		 2,0  2,1  2,2
		
		*/
		int number  = sc.nextInt();
		double[][] personData = new double[number][3];
		String[] status = new String[number];
		for(int i = 0;i<personData.length;i++) {
			System.out.println("Enter the weight of the person "+(i+1));
			personData[i][0]= sc.nextDouble();
			while(personData[i][0]<=0) {
				System.out.println("Enter the valid weight of the person "+(i+1));
				personData[i][0]= sc.nextDouble();
			}
			System.out.println("Enter the height of the person "+(i+1));
			personData[i][1]= sc.nextDouble();
			while(personData[i][1]<=0) {
				System.out.println("Enter the valid height of the person "+(i+1));
				personData[i][1]= sc.nextDouble();
			}
			double heightInMeter = personData[i][1]/100;
			personData[i][2] = personData[i][0]/(heightInMeter*heightInMeter);
			if(personData[i][2]<= 18.4) {
				status[i]="Underweight";
			}
			else if(personData[i][2]>=18.5 && personData[i][2]<=24.9) {
				status[i]="Normal";
			}
			else if(personData[i][2]>=18.5 && personData[i][2]<=24.9) {
				status[i]="Overweight";
			}
			else if(personData[i][2]>=40.0) {
				status[i]="Obese";
			}
			else {
				status[i]="Invaild Input";
			}
			
			System.out.println("The weight, height, BMI and weight status of the person "+(i+1)+" are "+personData[i][0]+", "+personData[i][1]+", "+personData[i][2]+" and "+status[i]);
		}
		
		
		
	}
	private static void calculatePercentAndGrade() {
		
		System.out.println("Enter the number of students");
		int num = sc.nextInt();
		int[] marks = new int[num];
		int[] percentage = new int[num];
		char[] grade = new char[num];

		for(int i =0;i<num;i++) {
			System.out.println("Enter the mark in Physics : ");
			int physics = sc.nextInt();
			System.out.println("Enter the mark in Chemistry : ");
			int chemistry = sc.nextInt();
			System.out.println("Enter the mark in Maths : ");
			int maths = sc.nextInt();
			marks[i] = physics+chemistry+maths;
			percentage[i] = (int) (marks[i]/3.0);
			if(percentage[i]<=39) {
				grade[i] = 'R';
			}
			else if(percentage[i]>=40 && percentage[i] <=49) {
				grade[i] = 'E';
			}
			else if(percentage[i]>=50 && percentage[i] <=59) {
				grade[i] = 'D';
			}
			else if(percentage[i]>=60 && percentage[i] <=69) {
				grade[i] = 'C';
			}
			else if(percentage[i]>=70 && percentage[i] <=79) {
				grade[i] = 'B';
			}
			else if(percentage[i]>=80) {
				grade[i] = 'A';
			}
			System.out.println("The marks, percentage and grade of the person "+(i+1)+" is "+marks[i]+", "+", "+percentage[i]+" and "+grade[i]);
		}
		
	}
	private static void percentAndGradeUsing2dArray() {
		System.out.println("Enter the number of students");
		int num = sc.nextInt();
		int[][] studentData = new int[num][3]; 
		int[] marks = new int[num];
		int[] percentage = new int[num];
		char[] grade = new char[num];

		for(int i =0;i<studentData.length;i++) {
			System.out.println("Enter the mark in Physics : ");
			studentData[i][0] = sc.nextInt();
			System.out.println("Enter the mark in Chemistry : ");
			studentData[i][1] = sc.nextInt();
			System.out.println("Enter the mark in Maths : ");
			studentData[i][2] = sc.nextInt();
			marks[i] = studentData[i][0]+studentData[i][1]+studentData[i][2];
			percentage[i] = (int) (marks[i]/3.0);
			if(percentage[i]<=39) {
				grade[i] = 'R';
			}
			else if(percentage[i]>=40 && percentage[i] <=49) {
				grade[i] = 'E';
			}
			else if(percentage[i]>=50 && percentage[i] <=59) {
				grade[i] = 'D';
			}
			else if(percentage[i]>=60 && percentage[i] <=69) {
				grade[i] = 'C';
			}
			else if(percentage[i]>=70 && percentage[i] <=79) {
				grade[i] = 'B';
			}
			else if(percentage[i]>=80) {
				grade[i] = 'A';
			}
			System.out.println("The marks, percentage and grade of the person "+(i+1)+" is "+marks[i]+", "+", "+percentage[i]+" and "+grade[i]);
		}
		
		
	}
	private static void frequencyOfDigits() {
		System.out.println("Enter the number");
		long num = sc.nextLong();
		long givenNo = num;
		int count = 0;
		while(num !=0) {
			num = num/10;
			count++;
		}
		num = givenNo;
		long[] arr = new long[count];
		for(int i=0;i<arr.length;i++) {
			arr[i]=num%10;
			num=num/10;
		}
		System.out.println("Array :"+Arrays.toString(arr));
		for(int k = 0; k<arr.length;k++) {
			int frequency = 1;
			for(int j = k+1 ;j<arr.length;j++) {
				if(arr[k]==arr[j] && arr[j]!=-1) {
					arr[j]=-1;
					frequency++;
				}
			}
			if(arr[k]!=-1) {
				System.out.println("Frequency of "+arr[k]+" is : "+frequency);
			}
		}
		
	}

}
