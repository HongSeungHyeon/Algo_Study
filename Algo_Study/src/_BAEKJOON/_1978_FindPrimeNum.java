package _BAEKJOON;
import java.util.*;
public class _1978_FindPrimeNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int N = input.nextInt();
		int[] arr = new int[N];
		int C=0;
		for(int i=0; i<N; i++)
			arr[i] = input.nextInt();
		
		for(int i=0;i<N;i++) {
			int cnt=0;
			for(int j=1; j<arr[i]; j++) {
				if(arr[i]%j == 0) cnt++; 
			}
			if(cnt==1) C++;
		}
		System.out.print(C);
	}
}
