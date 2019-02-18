package _BAEKJOON;
import java.util.*;
public class _2292_Bee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int result=2;
		int cnt=0;
		int idx=0;
		
		if(n==1) { result = 1; }
		if(n==2) { result = 2; }
		for(int i=2; i<n; i++) {
			cnt++;
			if(cnt/6 == result-1) {
				result++;
				cnt=0;
			}
		}
		System.out.println(result);
	}
}