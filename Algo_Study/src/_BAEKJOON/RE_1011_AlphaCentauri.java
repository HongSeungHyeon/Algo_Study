package _BAEKJOON;
import java.util.*;
public class RE_1011_AlphaCentauri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = b-a-2;
		int cnt=2;
		int k=2;
		
		while(c>0) {
			System.out.print(k+" ");
			c-=k;
			cnt++;
			k++;
			
		}
		System.out.println();
		System.out.println(cnt);
	}
}