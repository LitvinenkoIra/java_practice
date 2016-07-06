import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Main {
	
	public static void main (String args[]) {
 
		int a1 = 2;
		int d = 2;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
 
		sum = ((2*a1 + d*(n - 1))/2)*n;
 
		System.out.println(sum + 1);
 
	}
}