package Java_course;

import java.util.Scanner;

public class ReverseAString
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		int size = arr.length;
		int maxIdx = size - 1;
		
		for(int idx=0;idx<size;idx++){
			
			System.out.print(arr[maxIdx - idx]);
		}
		
		
	}
}
