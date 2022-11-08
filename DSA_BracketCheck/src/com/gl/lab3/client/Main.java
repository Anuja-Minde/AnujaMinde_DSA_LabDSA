package com.gl.lab3.client;

import java.util.Scanner;
import com.gl.lab3.model.BalanceBracket;

class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of brackets");
		String bracketString = sc.nextLine();
		
		BalanceBracket bracketcheck = new BalanceBracket();
		boolean result = bracketcheck.isBalanced(bracketString);
		if(result) {
			System.out.println("Entered String is balanced");
		}
		else {
			System.out.println("Entered String is not balanced");
		}
		sc.close();
	}
	
}