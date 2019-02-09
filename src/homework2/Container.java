package homework2;

import java.util.Scanner;

public class Container {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[8];
		System.out.println("Enter some numbers: ");
		for (int i = 0; i < 8; i++) {

			numbers[i] = sc.nextInt();
		}

		System.out.println(numbers[6]);
		sc.close();

	}

}
