package _181211;
import java.util.*;

public class _1005_ACMcraft {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum=0;
		int time = input.nextInt();
		int N = input.nextInt();
		int K = input.nextInt();
		int[] build = new int[N];
		int[][] rule = new int[K][2];
		int[] dp = new int[N];
		for(int i=0; i<N; i++) build[i] = input.nextInt();
		
		dp[0] = build[0];
		for(int i=1; i<N; i++) {
			dp[i] = dp[i-1]+build[i];
		}
	}
}
