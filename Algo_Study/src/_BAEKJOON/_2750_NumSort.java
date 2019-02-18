package _BAEKJOON;
import java.util.*;
public class _2750_NumSort {
	public static void Swap(int[] arr,int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b]= tmp;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = input.nextInt();
		
		for(int i=0; i<n-1; i++) {
			for(int j=0;j<n-1;j++)
				if(a[j]>a[j+1]) Swap(a,j,j+1);
		}
		for(int i=0; i<n; i++)
			System.out.println(a[i]);
	}
}
