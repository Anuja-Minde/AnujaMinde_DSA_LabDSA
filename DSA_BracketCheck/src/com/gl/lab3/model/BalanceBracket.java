package com.gl.lab3.model;

import java.util.Stack;

public class BalanceBracket {
	public boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i =0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			if(currentChar=='(' || currentChar=='[' || currentChar=='{') {
				stack.push(currentChar);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				
				else {
					char charCheck;
					switch(currentChar) {
					
					case ')':
						charCheck = stack.pop();
						if(charCheck =='[' || charCheck == '{' ) {
							return false;
						}
						break;
					
					case '}':
						charCheck = stack.pop();
						if(charCheck =='('|| charCheck == '[' ) {
							return false;
						}
						break;
						
					case ']':
						charCheck = stack.pop();
						if(charCheck =='('|| charCheck == '{' ) {
							return false;
						}
						break;
					}
				}
			}
		}
		return stack.isEmpty();
	}
}
	
