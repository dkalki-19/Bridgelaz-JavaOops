package PracticeProblem1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringPracticeProgramTwo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		timeZones();
		dateArithmetic();
		dateFormatting();
		dateComparison();

	}

	private static void timeZones() {
		/*
		Problem 1: Time Zones and ZonedDateTime Write a program that displays the current 
					time in different time zones:  
					➢ GMT (Greenwich Mean Time)  
					➢ IST (Indian Standard Time)  
					➢ PST (Pacific Standard Time)  
					Hint: Use ZonedDateTime and ZoneId to work with different time zones.  
		
		*/
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
		
		
	}

	private static void dateArithmetic() {
	/*
		 Problem 2: Date Arithmetic Create a program that:  
					➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.  
					➢ Then subtracts 3 weeks from the result.  
					Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and 
					minusWeeks() methods.  
		
		*/
		System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        updatedDate = updatedDate.minusWeeks(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Final date after all operations: " + updatedDate.format(formatter));
		
	}

	private static void dateFormatting() {
	/*
		
		 Problem 3: Date Formatting Write a program that:  
					➢ Displays the current date in three different formats:  
					■ dd/MM/yyyy  
					■ yyyy-MM-dd  
					■ EEE, MMM dd, yyyy  
					Hint: Use DateTimeFormatter with custom patterns for date formatting.  
		
		*/
		LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Date in dd/MM/yyyy format: " + today.format(format1));
        System.out.println("Date in yyyy-MM-dd format: " + today.format(format2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + today.format(format3));
	}

	private static void dateComparison() {
	/*
		 Problem 4: Date Comparison Write a program that:  
					➢ Takes two date inputs and compares them to check if the first date is before, after, 
					or the same as the second date.  
					Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate 
					class.
	
		*/
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);

        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

	}

}
