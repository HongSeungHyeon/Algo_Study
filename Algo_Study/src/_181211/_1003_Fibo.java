package _181211;
import java.util.*;


// 배열 선언할때 왜 n으로하면 오류??

public class _1003_Fibo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		
		while(time>0) {
		int n = input.nextInt();
		int[] cnt0 = new int[n+1];
		int[] cnt1 = new int[n+1];
		
		int sum0=0;
		int sum1=0;
		
		if(n==0) {
			sum0=1;
			sum1=0;
		}
		else if(n==1)
		{
			sum0=0;
			sum1=1;
		}
		else {
			cnt0[0] = 1;
			cnt1[0] = 0;
			cnt0[1] = 0;
			cnt1[1] = 1;
			n++;
			for(int i=2; i<n; i++) {
				cnt0[i] = cnt0[i-1]+cnt0[i-2];
				cnt1[i] = cnt1[i-1]+cnt1[i-2];
				sum0 = cnt0[i];
				sum1 = cnt1[i];
			}
		}
		System.out.println(sum0+" "+sum1);
		time--;
		}
	}
}
