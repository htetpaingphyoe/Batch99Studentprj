package method;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		multiple(num);

	}
	public static void multiple(int num1) {
		for(int x = 1 ; x<=12;x++) {
			System.out.println(num1 +" x "+x +" = "+(num1*x));
		}
	}

}
