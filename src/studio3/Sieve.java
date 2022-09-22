package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input an integer!");
		int n = in.nextInt();
		
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
			//System.out.println(array[i]);

		}
		
			
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 2; j < array[i]; j++) {
				if (array[i]%j == 0) {
					array[i]=0;
				}
			}
		}
		
		for (int i: array) {
			//int[] finalList;
			if (i > 0) {
				//finalList += i
				System.out.print(i+" ");
			}
		}

	}

}
