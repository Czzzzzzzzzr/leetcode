package leetcode;

import java.util.Scanner;

public class LeetCodeNo_7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println(reverse2(x)+"");
	}
	public static int reverse(int x) {
	       boolean negative = x < 0;  
	        if (negative) x = -x; 
	        // long ·ÀÖ¹Òç³ö
	        long r = 0;  
	        while (x>0) {  
	            r = r * 10 + x % 10;  
	            x /= 10;  
	        }  
	        if (negative) r = -r;  
	        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;  
	        return (int)r;  
	}
	public static int reverse2(int x) {
		int temp = Math.abs(x);
		String str = Integer.toString(temp);
		StringBuffer strb = new StringBuffer(str);
		String result = strb.reverse().toString();
		if( Long.parseLong(result)  > Integer.MAX_VALUE)
			return 0;
		return x > 0 ? Integer.parseInt(result): -Integer.parseInt(result);
	}
}
