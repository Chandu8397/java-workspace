package logicbuilding;

import java.util.Scanner;

/**
*Author :Mekapothula.Reddy
*Date   :4 Nov 2024
*Time   :10:08:59 am
*Email  :Mekapothula.Reddy@coforge.com
*/

public class RotatedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter p value: ");
		int p = scanner.nextInt();
		System.out.println("Enter q value: ");
		int q = scanner.nextInt();
		
		int[] arr = new int[p];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < p; i++) {
			arr[i] = scanner.nextInt();
			
		}
		// rotate by q % p steps
		q %= p;
		reverse(arr, 0, p-1);
		reverse(arr, 0, q-1);
		reverse(arr, q, p-1);
		
		System.out.println("Rotated Array");
		for (int num : arr) {
			System.out.println(num + " ");;
		}
		scanner.close();
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			arr[start] = arr[end];
			start++;
			end--;
		}
	}
}
	

