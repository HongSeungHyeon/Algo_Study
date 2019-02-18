package _181219;
import java.util.*;
public class _2293_Coin1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//int n = input.nextInt();  // 동전의 수
		int k = input.nextInt();  // 구하고자하는 동전의 합
		//int[] money = new int[n];
		int[] dp = new int[k];
		dp[0]=0;
		
		int a=1;
		
		//for(int i=0; i<n; i++) money[i] = input.nextInt();
		
		for(int i=1; i<k; i++)
		{
			if(i>3)
				if(i%2==0)
					a*=2;
			dp[i] = dp[i-1]+a;
			System.out.println(dp[i]);
		}
		int sum=0;
	}
}