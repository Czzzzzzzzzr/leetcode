package leetcode;

import java.util.Arrays;

public class LeetCodeNo_14 {
	public static void main(String[] args) {
		String[] strs = {"abc555","abc6666","abc777"};
		System.out.println(longestCommonPrefix(strs) + "");
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)
			return "";
		StringBuffer strsb = new StringBuffer();
		Arrays.sort(strs);
		String s1 = strs[0] , s2 = strs[strs.length -1];
		for(int i = 0 ;i < strs.length ;i++) {
			if(s1.charAt(i) == s2.charAt(i) && s2.length() > i) {
				strsb.append(s1.charAt(i));
			}
			else
				return strsb.toString();
		}
		return strsb.toString();
	}
}
