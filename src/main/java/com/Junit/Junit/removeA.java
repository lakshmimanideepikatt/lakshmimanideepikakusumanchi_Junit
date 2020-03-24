package com.Junit.Junit;

public class removeA{

	public String rem(String string) {
		// TODO Auto-generated method stub
		String result = "";
		if(string.charAt(0) == 'A') {
			
		}
		else {
			result += string.charAt(0);
		}
		if(string.charAt(1) == 'A') {
			
		}
		else {
			result += string.charAt(1);
		}
		result += string.substring(2);
		return result;
	}

}