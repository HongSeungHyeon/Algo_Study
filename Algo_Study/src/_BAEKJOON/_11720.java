package _BAEKJOON;
import java.util.*;

public class _11720 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int n = input.nextInt();
		String str = input2.nextLine();
		int[] arr2 = new int[n];
		int sum=0;

		String[] arr = str.split("");
		
		for(int i=0; i<n; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			sum+= arr2[i];
		}
		System.out.println(sum);
	}
}