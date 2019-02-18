package _BAEKJOON;
import java.util.*;
public class _1157_StudyWord {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String s = input.nextLine();
		String s1 = s.toUpperCase();
		int max =0;
		char answer = '?';
		
		int[] a = new int[26];
		String s2 ="";
		
		for(int i=0; i<s1.length();i++) {
			int p = s1.charAt(i);
			a[p-65]++; 
			if(max<a[s1.charAt(i)-65] ) {
				answer = s1.charAt(i);
				max = a[s1.charAt(i)-65];
			}
			else if(max == a[s1.charAt(i)-65])
				answer = '?';
		}
		System.out.println(answer);
	}
}