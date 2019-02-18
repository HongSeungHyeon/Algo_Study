package _181211;
import java.util.*;

public class _1932_SumTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		int n = input.nextInt();
		
		int[][] tri = new int[n][n];
		int[][] dp = new int[n][2*(n-1)];

		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				int tmp = input.nextInt();
				if(n==1) max = tmp;
				tri[i][j] = tmp;
			}
		}
		if(n==1) {
			dp = new int[1][1];
		}
		if(n>=1)
			dp[0][0] = tri[0][0];
		if(n>=2) {
			dp[1][0] = tri[0][0]+tri[1][0];
			dp[1][1] = tri[0][0]+tri[1][1];
		}
		
		for(int i=2; i<n; i++) {
			dp[i][0] = dp[i-1][0]+tri[i][0];
			dp[i][(2*i)-1] = dp[i-1][2*(i-1)-1]+tri[i][i];
			
			if(i==2) {
				dp[2][1] = dp[1][0]+tri[2][1];
				dp[2][2] = dp[1][1]+tri[2][1];
			}
			else {
				for(int j=1; j<=2*i-2; j++) {
					int a = 1;
					if(j%2==1) {
						dp[i][j] = dp[i-1][j-1]+tri[i][a];
						a++;
					}
					else
						dp[i][j] = dp[i-1][j-1]+tri[i][j/2];
				}
			}
		}
		for(int k=0; k<2*(n-1); k++) {
			if(dp[n-1][k]>max) max = dp[n-1][k];
		}
		System.out.print(max);
	}
}
