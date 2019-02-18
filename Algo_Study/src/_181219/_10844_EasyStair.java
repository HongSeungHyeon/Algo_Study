package _181219;
import java.util.*;

public class _10844_EasyStair {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] dp = new int[N][(int)Math.pow(2, N+3)];
		int cnt=0;
		for(int i=0; i<9;i++) dp[0][i]=i+1;
		for(int j=1;j<N;j++) {
			int a=0;
			cnt=0;
			for(int i=0; i<dp[j-1].length;i++) {
				if(dp[j-1][i]%10 != 0) {
					if(dp[j-1][i]%10 == 9) {
						dp[j][a] = dp[j-1][i]*10+(dp[j-1][i]%10-1);
						a++;
					}
					else {
						dp[j][a] = dp[j-1][i]*10+(dp[j-1][i]%10-1);
						a++;
						dp[j][a] = dp[j-1][i]*10+(dp[j-1][i]%10+1);
						a++;
					}
				}
				else if(dp[j-1][i]%10 == 0 && dp[j-1][i] != 0){
					dp[j][a] = (dp[j-1][i]*10)+1;
					a++;
				}
			}
			cnt=a;
		}
		if(N==1) cnt = 9;
		System.out.print(cnt%1000000000);
	}
}
