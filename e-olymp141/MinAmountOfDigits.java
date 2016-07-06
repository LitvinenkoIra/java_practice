import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		
		int sumMin, counter = 1;
		
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		sumMin = sumOfDigits(m);
		
		for(int i = m + 1; i <= n; i++) {
			if (sumOfDigits(i) < sumMin) {
				sumMin = sumOfDigits(i);
				counter = 1;
			} else if (sumOfDigits(i) == sumMin)   
		    counter++;
		}
		System.out.println(counter);
	}
	
	public static int sumOfDigits(int a){
		int sum = 0;
		while (a > 0) {
			sum += a%10;
			a /= 10;
		}
	return sum;
	}
}