package _181211;
import java.util.*;

public class _SW_1204_MostNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T_case = input.nextInt();
		int num = input.nextInt();
		
		
		for(int k=0; k<T_case; k++) {
		int max = 0;
		int[] arr = new int[1000];
		int[] cnt = new int [101];
		for(int i=0; i<=100; i++) {
			cnt[i] = 0;
		}
		
		for(int i=0; i<1000; i++) {
			arr[i] = input.nextInt();
			cnt[arr[i]] += 1; 
		}
		for(int i=0; i<(cnt.length)-1; i++) {
			max = Math.max(max, cnt[i+1]);
		}
		
		for(int i=100 ; i>=0; i--) {
			if(cnt[i]==max) {
				System.out.println("#"+num+" "+i);
				break;
			}
		}
		num++;
		}
	}
}
