package Combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);

	System.out.println("n sayisini giriniz :");
	int n = scan.nextInt();
	
     System.out.println("r sayisini giriniz :");
	int r = scan.nextInt();
	
	int total11 = 1 , total12 = 1 , total13 = 1 ;
	
	
	   for (int a=1 ; a<=n ; a++) {
		   total11 *=a ;
		
	   } 
	   for (int b=1 ; b<=r ; b++) {
		   total12 *=b ;
		
	   } 
	   for (int c=1 ; c<=(n-r) ; c++) {
		   total13 *=c ;
		
	   }   
	  
	System.out.println("n'in r'ye gore faktoriyeli  " + total11/(total12*total13)  );
	
	}
	}