//����� �� ���� �� ��ܾ� �Ǵ� �� ��ܾ� ���� �� �ִ�. ��, �� ����� �����鼭 �̾ ���� ����̳�, ���� ���� ������� ���� �� �ִ�.
//���ӵ� �� ���� ����� ��� ��Ƽ��� �� �ȴ�. ��, �������� ��ܿ� ���Ե��� �ʴ´�.
//������ ���� ����� �ݵ�� ��ƾ� �Ѵ�.

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