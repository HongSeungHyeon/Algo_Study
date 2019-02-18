package _BAEKJOON;
import java.util.*;
public class _1152_wordCnt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine().trim();
		if(s.isEmpty()) System.out.println(0);
		else System.out.println(s.split(" ").length);
	}
}