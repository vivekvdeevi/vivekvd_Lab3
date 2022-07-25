package com.gl.lab3q1service;

import java.util.Stack;

public class BalancingBrackets {
	public boolean findBalance(String inputStr) {
		boolean rtnValue = true;

		Stack<Character> brakets = new Stack<>();

		for (int index = 0; index < inputStr.length(); index++) {
			char readChar = inputStr.charAt(index);

			if (readChar == '{' || readChar == '[' || readChar == '(') {
				brakets.push(readChar);
				continue;
			}

			if (brakets.isEmpty()) {
				rtnValue = false;
				break;
			}
			char popChar;
			switch (readChar) {

			case ')':
				popChar = brakets.pop();
				if ((popChar == '{') || (popChar == '['))
					rtnValue = false;
				break;
			case '}':
				popChar = brakets.pop();
				if ((popChar == '(') || (popChar == '['))
					rtnValue = false;
				break;
			case ']':
				popChar = brakets.pop();
				if ((popChar == '(') || (popChar == '{'))
					rtnValue = false;
				break;

			}
		}
		return rtnValue;
	}

}
