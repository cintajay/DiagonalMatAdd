package com.orthofx;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of layers for pyramid:");
		int n = input.nextInt();
		input.close();
		int space_count=n-1; //2
		int star_count=1;

		for(int i=0; i<n; i++) {
			for(int j=0; j<space_count; j++) {
				System.out.print(" ");
			}
			for(int j=n-1; j<n-1+star_count ;j++) {
				System.out.print("*");
			}			
			System.out.println();
			space_count--;
			star_count=star_count+2;
		}
		
		space_count=n-2;
		star_count=n;
		for(int i=0;i<n;i++) {
			for(int j=0; j<space_count; j++) {
				System.out.print(" ");
			}
			for(int j=n-1; j<n-1+star_count ;j++) {
				System.out.print("*");
			}
			System.out.println();
			space_count++;
			star_count=star_count-2;
		}
	
	}
}
