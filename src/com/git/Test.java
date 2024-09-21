package com.git;

public class Test {
	public static String compression(String s) {
		StringBuilder rs = new StringBuilder();
		s=s.toUpperCase();
		for(int i=0;i<s.length();i+=2) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') {
				int count=(int)(c-48);
				while(count>0&&i+1<s.length()) {
					rs.append(s.charAt(i+1));
					count--;
				}
			}
		}
//		return new String(rs);
		return rs.toString();
	}
	public static void main(String[] args) {
		String s = "3A2B3C1D";
		System.out.println(compression(s));
	}
}
