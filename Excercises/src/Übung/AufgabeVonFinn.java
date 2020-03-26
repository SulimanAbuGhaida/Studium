package Übung;

import java.util.Scanner;
public class AufgabeVonFinn {

	public static void main(String[] args) {


int n ;
System.out.println("Please enter the number of n-Zeile");
Scanner input = new Scanner(System.in);
 n = input.nextInt();
 int [][]partition = new int [n][n];
                             
 
 partition[0][0] = 1;
 //partition[1][0] = 1;
 System.out.println(partition[0][0]);

 
 for(int i = 1; i<=partition.length; i++)
 {
	 for(int j = 0; j<=i; j++)
	 { if(j==0) {
		 partition[i][j]=partition[i-1][i-1];
	 System.out.print(partition[i][j]+ " ");
	 }
	 else {
		 partition[i][j]=partition[i][j-1]+partition[i-1][j-1];
		 System.out.print(partition[i][j]+ " ");
	 }
	 
 }System.out.println();
 }
	}}

