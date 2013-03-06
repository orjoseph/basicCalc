//Mark A. Tyler II
//Basic calculator in Java

import java.io.*;
import java.util.*;

public class Calc {

  /**
	 * @param args
	 */

	public static int add(int a,int b){
		int temp;
		temp = a + b;
		return temp;
	}
	
	public static int sub(int a, int b){
		int temp;
		temp = a - b;
		return temp;
		
	}
	
	public static int mult(int a, int b){
		int temp;
		temp = a * b;
		return temp;
		
	}
	
	public static int mod(int a, int b){
		int temp;
		temp = a % b;
		return temp;
		
	}
	
	public static int divide(int a, int b){
		int temp;
		if(b==0)
		  System.out.println("Error you cannot divide by 0");
		else
		  temp = a / b;
		return temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		int x, y;
		boolean choose=true;
		Scanner In = new Scanner(System.in);
		
		System.out.println("Enter the values (i.e. <34><SPACE><+><SPACE><45>):");
		
		do{
			 x = In.nextInt();
			 choice = In.next();
			 y = In.nextInt();
		
			switch(choice){
				case "+":
					System.out.println(add(x,y));
					break;
				case "-":
					System.out.println(sub(x,y));
					break;
				case "*":
					System.out.println(mult(x,y));
					break;
				case "/":
					System.out.println(divide(x,y));
					break;
				case "%":
					System.out.println(mod(x,y));
					break;
		
			}
			
		}while(choose);
	In.close();
	}
	
	
}
