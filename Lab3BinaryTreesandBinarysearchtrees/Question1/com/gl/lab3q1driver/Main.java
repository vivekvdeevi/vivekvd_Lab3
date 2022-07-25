package com.gl.lab3q1driver;

import com.gl.lab3q1service.BalancingBrackets;

public class Main {

	public static void main(String[] args) {
		String braces = "( { ( ( ) ) } )";
		BalancingBrackets balObj = new BalancingBrackets();
		boolean check = balObj.findBalance(braces);
		if (check ==true) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
