package PracticeProblem1;

import java.util.Arrays;
import java.util.Scanner;

public class StringPracticeProgramOne {

	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		noOfVowelsAndConsonants();
		reverseString();
		checkPallindrome();
		removeDuplicates();
		longestWordInSentence();
		subStringOccurences();
		toggleEachCase();
		compareTwoStrings();
		findMostFrequentCharacter();
		removeSpecificCharacter();
		checkStringForAnagrams();
		replaceGivenWord();
		
	}

	private static void noOfVowelsAndConsonants() {
		System.out.println("Enter the word");
		String word = sc.nextLine();
		int vowels = 0;
		int consonants = 0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)== 'a' || word.charAt(i)== 'e' || word.charAt(i)== 'i' || word.charAt(i)== 'o'|| 
					word.charAt(i)== 'u' || word.charAt(i)== 'A' || word.charAt(i)== 'E' || 
					word.charAt(i)== 'I' || word.charAt(i)== 'O'|| word.charAt(i)== 'U' && word.charAt(i) != ' '){
				vowels++;
			}else {
				consonants++;
			}
				
		}
		System.out.println("Number Of Vowels : "+vowels);
		System.out.println("Number Of Consonants : "+consonants);
	}

	private static void reverseString() {
		System.out.println("Enter the String");
		String word = sc.nextLine();
		String rev = "";
		for(int i=word.length()-1;i>=0;i--) {
			rev+=word.charAt(i);
		}
		System.out.println("Reverse Of the String is : "+rev);
	}

	private static void checkPallindrome() {
		System.out.println("Enter the String");
		String word = sc.nextLine();
		String rev = "";
		for(int i=word.length()-1;i>=0;i--) {
			rev+=word.charAt(i);
		}
		System.out.println((word.equals(rev)?"Given String is Pallindrome":"Given String is not a Pallindrome"));
	}

	private static void removeDuplicates() {
		System.out.println("Enter the String");
		String word = sc.nextLine();
		String res = "";
		char[] ch =  word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c = word.charAt(i);
			for(int j=i+1;j<ch.length;j++) {
				if(c==ch[j]) {
					ch[j]='\u0000';
				}
			}
		}
		for(char c:ch) {
			if(c!='\u0000') {
				res+=c;
			}
		}
		System.out.println("After removal of duplicates :"+res );
	}

	private static void longestWordInSentence() {
		System.out.println("Enter the sentence : ");
		String sentance = sc.nextLine();
		String[] words = sentance.split(" ");
		int count = 0;
		String largestWord = "";
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>count) {
				count = words[i].length();
				largestWord = words[i];
			}
		}
		System.out.println("LargestWord is :"+largestWord);
	}

	private static void subStringOccurences() {
		
		
		System.out.println("Enter the string : ");
		String sentence = sc.nextLine();
		System.out.println("Enter the substring");
		String substr = sc.nextLine();
		
		int index=0;
		int count=0;
		while((index=sentence.indexOf(substr,index))!=-1) {
			count++;
			System.out.println("Index 1:"+index);
			index+=substr.length();
			System.out.println("Index 2:"+index);
		}
		System.out.println("The no of occurences of the given substring is :"+count);
	}

	private static void toggleEachCase() {
		
		System.out.println("Enter the String : ");
		String word = sc.nextLine();
		String res = "";
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>=65 && word.charAt(i)<=90) {
				char ch = (char)(word.charAt(i)+32);
				res+=ch;
			}
			else if(word.charAt(i)>=97 && word.charAt(i)<=122) {
				char ch = (char)(word.charAt(i)-32);
				res+=ch;
			}
		}
		System.out.println(res);
	}

	private static void compareTwoStrings() {
		System.out.println("Enter the first string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		String str2 = sc.nextLine();
		int length = (str1.length()>=str2.length())?str2.length():str1.length();
		String firstCome = "";
		for(int i=0,j=0;i<length;i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(j);
			if(ch1<ch2) {
				firstCome = str1;
				j++;
				break;
			}
			else if(ch1>ch2){
				firstCome = str2;
				j++;
				break;
			}
			else {
				j++;
				continue;
			}
		}
		System.out.println(firstCome);
	}

	private static void findMostFrequentCharacter() {
		int maxCount  = 0;
		char ch = '\u0000';
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		for(int i = 0;i<s.length();i++) {
			int count = 0;
			for(int j = i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount = count;
				ch = s.charAt(i);
			}
		}
		System.out.println("Frequently occured character is : "+ch);
	}

	private static void removeSpecificCharacter() {
		System.out.println("Enter the String");
		String word = sc.nextLine();
		System.out.println("Enter the specific charater to remove from the string");
		char chr = sc.next().charAt(0);
		String res = "";
		char[] ch =  word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c = word.charAt(i);
			if(c == chr) {
				ch[i]='\u0000';

			}
		}
		for(char c:ch) {
			if(c!='\u0000') {
				res+=c;
			}
		}
		System.out.println("After removal of duplicates :"+res );
	}

	private static void checkStringForAnagrams() {
		System.out.println("Enter the first string :");
		String str1 = sc.next();
		System.out.println("Enter the second string :");
		String str2 = sc.next();
		boolean isAnagram = true;
		if(str1.length()==str2.length()) {
			for(int i = 0,j=0;i<str1.length();i++) {
				if(j<str2.length()) {
					if(str1.charAt(i)!=str2.charAt(j)) {
						isAnagram = false;
						break;
					}
					j++;
				}
			}
		}
		else {
			System.out.println("Given Strings are not anagram ");
		}
		System.out.println(isAnagram?"Given Strings are anagram":"Given Strings are not anagram");
	}

	private static void replaceGivenWord() {
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("Enter the string to be replaced : ");
		String oldWord = sc.nextLine();
		System.out.println("Enter the string to replace with :");
		String newWord = sc.nextLine();
		System.out.println("After replacing with the new given string : "+str.replace(oldWord, newWord));
	}
	
}
