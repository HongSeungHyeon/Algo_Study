package _BAEKJOON;
import java.util.*;
public class _2908_Sangsoo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a= input.nextInt();
		int b = input.nextInt();
		
		int new_a = (a%10)*100 + ((a/10)%10)*10 + a/100;
		int new_b = (b%10)*100 + ((b/10)%10)*10 + b/100;
		
		System.out.println(new_a>new_b ? new_a : new_b);

	}
}
