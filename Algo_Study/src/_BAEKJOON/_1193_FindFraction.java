package _BAEKJOON;
import java.util.*;
public class _1193_FindFraction {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr= new int[n+1];
		int[] arr2 = new int[n];
		int a=0,b=0;
		if(n==1) System.out.println("1/1");
		
		int k=2;
		int cnt=0;
		int idx=2;
		for(int i=2; i<=n;i++) {
			cnt++;
			arr[i] = k+1;
			if(arr[n]%2 == 1) {
				b=arr[n]-cnt;
				a=arr[n]-b;
			}
			else {
				a=arr[n]-cnt;
				b=arr[n]-a;
			}
			if(cnt==idx) {
				idx++;
				k++;
				cnt=0;
			}
		}
		
		System.out.println(a+"/"+b);
	}
}
