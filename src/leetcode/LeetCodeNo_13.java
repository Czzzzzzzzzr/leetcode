package leetcode;

import java.util.Scanner;

public class LeetCodeNo_13 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(romanToInt(str)+"");
	}
	
	
	public static int charToInt(char c) {
		switch(c){
		case 'I' : 
			return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
		}
		return 0;
	}
	public static int romanToInt(String s) {
		int result = 0;	
		s = s + "I";
		for(int i = 0 ;i < s.length()-1;i++ ) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			int number1 = charToInt(c1);
			int number2 = charToInt(c2);
			if(number1 < number2) {
				result += number2 - number1;
				i++;
			}
			else 
				result += number1;
		}
		return result;
		
		
	}
	
	
}
