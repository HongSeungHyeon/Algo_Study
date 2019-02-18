package _BAEKJOON;
import java.util.*;
public class _11721_10word {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		String[] ch = s.split("");
		
		System.out.print(ch[0]);
		for(int i=1; i<ch.length; i++) {
			System.out.print(ch[i]);
			if(i%10==9)
				System.out.println();
		}

	}
}
