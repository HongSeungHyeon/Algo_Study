//계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
//연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
//마지막 도착 계단은 반드시 밟아야 한다.

package _181211;
import java.util.*;

public class _2579_UpStairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] stair = new int[n];
		int[] dp = new int[n];
		int max = 0;
		
		for(int i=0; i<n; i++) {
			stair[i] = input.nextInt();
		}
		
		dp[0] = stair[0];
		dp[1] = stair[0]+stair[1];
		dp[2] = Math.max(stair[2]+stair[1],stair[2]+stair[0]);
		for(int i=3;i<n; i++) {
			dp[i] = Math.max(stair[i]+stair[i-1]+dp[i-3],stair[i]+dp[i-2]);
		}
		System.out.println(dp[n-1]);
	}
}