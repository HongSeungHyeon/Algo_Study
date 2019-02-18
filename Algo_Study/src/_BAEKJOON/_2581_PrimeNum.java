package _BAEKJOON;
import java.util.*;
public class _2581_PrimeNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		int sum=0;
		int min =10001;
		int C=0;
		
		for(int i=n; i<=m; i++) {
			int cnt=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) cnt++;
			}
			if(cnt==1) {
				sum += i;
				C++;
				if(i<min) min = i;
			}
		}
		if(C != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else
			System.out.println(-1);
	}
}
