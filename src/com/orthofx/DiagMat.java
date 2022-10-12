package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagMat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of rows/coloumns:");
		int m = input.nextInt();
		
		ArrayList<ArrayList<Integer>> arrli = new ArrayList<ArrayList<Integer>>();
		System.out.print("Enter values of matrix:\n");
		for (int i = 0; i < m; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < m; j++) {
				int item = input.nextInt();
				row.add(item);
			}
			arrli.add(row);
		}
		int sum=0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if(i==j) {
					sum=sum+arrli.get(i).get(j);
				}
				else if(i+j==m-1) {
					sum=sum+arrli.get(i).get(j);
				}
				
			}
		}
		System.out.println(sum);
		
		
	}

}
