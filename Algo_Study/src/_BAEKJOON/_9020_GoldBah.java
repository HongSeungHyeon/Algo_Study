package _BAEKJOON;
import java.util.*;
public class _9020_GoldBah {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T>0) {
		int cnt=0;
		int n = input.nextInt();
		boolean[] c = new boolean[n+1];
		double to = (double)Math.sqrt(n);
		
		for(int i=2; i<=to; i++) {
			for(int j=i; i*j<=n; j++) {
				c[i*j] = true;
			}
		}
		
		int tmp=n/2;
		for(int i=(n/2); i<n; i++) {
			for(int k=tmp; k>1; k--) {
				if(!c[i] && !c[k] && k+i==n) {
					System.out.println(k+" "+i);
					cnt++;
					}
				if(cnt!=0) break;
				}
			}
			tmp--;
			T--;
			}
		}
	}