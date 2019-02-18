package _190122;
import java.util.*;

public class _1912_ContinuousSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int max=-1;
		int result=0;
		
		for(int i=0; i<arr.length; i++)
			arr[i] = input.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0)
				result += arr[i];
			else {
				max = result;
				result = 0;
			}
		}
		if(max<=0) {
			int a=-1000;
			for(int i=0; i<arr.length; i++)
				a = Math.max(a, arr[i]);
			max = a;
		}
		System.out.println(max);
	}
}
