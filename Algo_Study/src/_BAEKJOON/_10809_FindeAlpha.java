package _BAEKJOON;
import java.util.*;
public class _10809_FindeAlpha {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] alpha = new int[26];
		String s = input.nextLine();
		
		for(int i=0; i<26; i++) {
			alpha[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			int a = s.charAt(i);
			if(alpha[a-97] == -1)
				alpha[a-97] = i; 
		}
		for(int i=0;i<26;i++)
			System.out.print(alpha[i]+" ");
	}
}
