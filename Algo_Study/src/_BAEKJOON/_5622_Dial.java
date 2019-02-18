package _BAEKJOON;
import java.util.*;
public class _5622_Dial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		int sum=0;		
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'C') sum += 2;
			if(s.charAt(i) >= 'D' && s.charAt(i) <= 'F') sum += 3;
			if(s.charAt(i) >= 'G' && s.charAt(i) <= 'I') sum += 4;
			if(s.charAt(i) >= 'J' && s.charAt(i) <= 'L') sum += 5;
			if(s.charAt(i) >= 'M' && s.charAt(i) <= 'O') sum += 6;
			if(s.charAt(i) >= 'P' && s.charAt(i) <= 'S') sum += 7;
			if(s.charAt(i) >= 'T' && s.charAt(i) <= 'V') sum += 8;
			if(s.charAt(i) >= 'W' && s.charAt(i) <= 'Z') sum += 9;
		}
		sum += s.length();
		System.out.println(sum);
	}
}
