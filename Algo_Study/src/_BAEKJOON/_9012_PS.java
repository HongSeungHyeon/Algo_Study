package _BAEKJOON;
import java.util.*;
public class _9012_PS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n>0) {
			Stack<String> s = new Stack<>();
			
			String[] str = input.next().split("");
			String result = "YES";
			String tmp="";
			
			for(int i=0; i<str.length; i++) {
				if(str[i].equals("(")) {
					s.add(str[i]);
				}
				
				if(str[i].equals(")")) {
					if(s.isEmpty()) {result="NO"; break;}
					if(s.pop().equals(")")){
						System.out.println("NO");
						result = "NO";
						break;
						}
					}
				}
			if(!s.isEmpty()) result="NO";
			System.out.println(result);
			n--;
		}
	}
}