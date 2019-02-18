package _DP_study;
import java.util.*;
public class _1_Fibo {
	static void Fibo(int n) {
		int[] F = new int[7];
		
		F[0] = 1;
		F[1] = 1;
		
		for(int i=2; i<n ; i++) {
			F[i] = F[i-1] + F[i-2];
		}
		for(int i=0; i<n; i++)
		System.out.println(F[i]);
	}
	
	public static void main(String[] args) {
		Fibo(7);
	}
}
