package _BAEKJOON;
import java.util.*;
public class _4948_Bretrang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			int n = input.nextInt();
			int cnt=0;
			if(n==0) break;
			
			boolean[] c = new boolean[(2*n)+1];
			
			double to = (double)Math.sqrt(2*n);
			
			for(int i=2; i<=to; i++) {
				for(int j=i; i*j<=(2*n) ; j++) {
					c[i*j] = true;
				}
			}
			for(int k=n+1; k<(2*n); k++) {
				if(!c[k]) cnt++;
			}
			if(n==1) cnt=1;
			System.out.println(cnt);
		}
	}
}
