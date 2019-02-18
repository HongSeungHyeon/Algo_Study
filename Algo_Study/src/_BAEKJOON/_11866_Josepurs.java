package _BAEKJOON;
import java.util.*;
public class _11866_Josepurs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int M = input.nextInt();
		int x;
		LinkedList<Integer> q = new LinkedList<>();
		LinkedList<Integer> q2 = new LinkedList<>();
		
		for(int i=1; i<=N; i++)
			q.add(i);
		
		while(!q.isEmpty()) {
			for(int i=0; i<M-1; i++) {
				x =q.poll();
				q.add(x);
			}
			q2.add(q.poll());
		}
		System.out.print("<"+q2.get(0));
		for(int i=1; i<N; i++) {
			System.out.print(", "+q2.get(i));
			
		}
		System.out.print(">");
	}

}
