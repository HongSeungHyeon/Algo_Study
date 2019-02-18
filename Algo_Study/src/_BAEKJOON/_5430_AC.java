package _BAEKJOON;
import java.util.*;
public class _5430_AC {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int test = input.nextInt();
		
		while(test>0) {
			String[] s = input.next().split("");
			int n = input.nextInt();
			boolean c = true;
			String s1 = input.next();
			
			LinkedList<Integer> q = new LinkedList<>();
			
			for(int i=1; i<n*2; i+=2) 
				q.add((int) s1.charAt(i)-'0');
			
			for(int i=0; i<s.length; i++) {
				if(s[i].equals("R")) {
					Collections.reverse(q);
				}
				if(s[i].equals("D")) {
					if(q.isEmpty()) {
						System.out.println("error");
						c = false;
						break;
					}
					q.poll();
				}
				}
			if(c) System.out.println(q);
			test--;
			}
		}
	}