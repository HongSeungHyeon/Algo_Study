package _BAEKJOON;
import java.util.*;
public class _1065_hansoo {
	public static void hansoo(int n) {
		int cnt=0;
		for(int i=1; i<=n; i++) {
			if(i<100) cnt++;
			else {
				if((i%100)-(i/10)%10 == (i/10)%10 - (i/100)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		hansoo(n);
	}
}
