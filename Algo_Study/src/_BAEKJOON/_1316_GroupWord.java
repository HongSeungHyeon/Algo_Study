package _BAEKJOON;
import java.util.*;
public class _1316_GroupWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		int n = input.nextInt();
		int cnt=n;
		
		for(int k=0;k<n;k++) {
			a.clear();
			String[] s = input.next().split("");
			
			for(int i=0; i<s.length-1; i++) {
				
				if(!a.contains(s[i]))
					a.add(s[i]);
				
				if(!s[i].equals(s[i+1]) && a.contains(s[i+1])) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}