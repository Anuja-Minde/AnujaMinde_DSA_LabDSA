package com.gl.lab3.main;

import java.util.Scanner;

import com.gl.lab3.bst.SumPair;
import com.gl.lab3.bst.SumPair.Node;

public class Main {
	public static void main(String[] args) {
		Node root = null;
		SumPair sumpair = new SumPair();
		root=sumpair.insert(root, 40);
		root=sumpair.insert(root, 20);
		root=sumpair.insert(root, 60);
		root=sumpair.insert(root, 10);
		root=sumpair.insert(root, 30);
		root=sumpair.insert(root, 50);
		root=sumpair.insert(root, 70);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum to find pairs in BST:");
		int sum = sc.nextInt();
		sc.close();
		sumpair.findPairWithGiven(root, sum);
	}
}
