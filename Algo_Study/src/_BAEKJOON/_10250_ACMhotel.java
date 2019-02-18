package _BAEKJOON;
import java.util.*;
public class _10250_ACMhotel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T>0) {
			int H = input.nextInt();
			int W = input.nextInt();
			int N = input.nextInt();
			
			int[][] arr = new int[H][W];
			int result = 0;
			
			for(int j=0; j<W; j++) {
				for(int i=0; i<H; i++) {
					result = (i+1)*100+(j+1);
					N--;
					if(N<=0) break;
				}
				if(N<=0) break;
			}
			System.out.println(result);
			T--;
		}
	}
}
