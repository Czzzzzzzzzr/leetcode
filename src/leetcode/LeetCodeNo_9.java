package leetcode;

import java.util.Scanner;

public class LeetCodeNo_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println(isPalindrome(x) + "");
	}
	
	
	public static boolean isPalindrome(int x) {
		String str = Integer.toString(x);
		StringBuffer strb = new StringBuffer(str);
		String result = strb.reverse().toString();
		if(str.compareTo(result) == 0) {
			return true;
		}
		else 
			return false;
		
	}
	
}
