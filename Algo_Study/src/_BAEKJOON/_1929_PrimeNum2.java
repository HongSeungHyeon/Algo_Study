package _BAEKJOON;
import java.util.*;
public class _1929_PrimeNum2 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		boolean[] check = new boolean[m+1];
		
		for(int i=2; i<m+1; i++)
			check[i] = true;
		
		double to = (double) Math.sqrt(m);
		
		for(int i=2; i<to; i++) {
			if(check[i] == true) {
				for(int j=i; i*j <= m; j++) {
					check[i*j] = false;
				}
			}
		}
		for(int i=n; i<=m; i++) {
			if(check[i])
				System.out.println(i);
		}
	}
}