package _BAEKJOON;
import java.util.*;
public class _2755_Chairman {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int T = input.nextInt();
		
		while(T>0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int[][] arr = new int[a+1][b+1];
			for(int i=1; i<=b; i++)
				arr[0][i] = i;
			
			for(int i=1; i<=a; i++) {
				for(int j=1; j<=b; j++) {
					for(int k=0; k<j; k++) {
						arr[i][j] += arr[i-1][k+1];
					}
				}
			}
			System.out.println(arr[a][b]);
			T--;
		}
	}
}
