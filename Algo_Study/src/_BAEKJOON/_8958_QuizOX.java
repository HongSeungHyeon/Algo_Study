package _BAEKJOON;
import java.util.*;
public class _8958_QuizOX {
	public static void quiz() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++){
			int sum=0;
			int score=0;
			String s = input.next();
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)=='O') score++;
				else score=0;
				sum += score;
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		quiz();
	}
}
