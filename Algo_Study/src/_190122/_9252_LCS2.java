package _190122;
import java.util.*;
public class _9252_LCS2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		input.close();
		char[] name = new char[1000];
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i=1;i<=s1.length(); i++) {
			char c1 = s1.charAt(i-1);
			for(int j=1; j<=s2.length(); j++) {
				char c2 = s2.charAt(j-1);
				if(c1==c2) {
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		int idx = dp[s1.length()][s2.length()];
		int k=0;
		
		System.out.println(dp[s1.length()][s2.length()]);
		for(int i=s1.length(); i>0; i--) {
			char c3 = s1.charAt(i-1);
			for(int j=s2.length(); j>0; j--) {
				char c4 = s2.charAt(j-1);
				if(c3==c4) {
					if(dp[i][j] == idx) {
						System.out.println("k:"+k+"   idx:"+idx+"    dp[i][j]:"+dp[i][j]+"     C:"+c3);
						name[k] = c3;
						k++;
						idx--;
					}
				}
					
			}
		}
		for(int i=k; i>=0; i--)
			System.out.print(name[i]);
	}
}