package _BAEKJOON;
import java.util.*;
public class _10845_Queue {
	static int last;
	public static void push(Queue<Integer> s, int a) {
		last=a;
		s.add(a);
	}
	public static void pop(Queue<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.poll());
		else
			System.out.println(-1);
	}
	public static void size(Queue<Integer> s) {
		System.out.println(s.size());
	}
	public static void empty(Queue<Integer> s) {
		if(s.isEmpty()) System.out.println(1);
		else System.out.println(0);
	}
	public static void front(Queue<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.peek());
		else
			System.out.println(-1);
	}
	public static void back(Queue<Integer> s) {
		if(!s.isEmpty())
			System.out.println(last);
		else
			System.out.println(-1);
	}
	
	public static void main(String[] args) {
		Queue<Integer> s = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		while(n>0) {
			String s1 = input.next();
			
			if(s1.equals("push")) {
				int a = input.nextInt();
				push(s,a);
			}
			else if(s1.equals("pop")) {
				pop(s);
			}
			else if(s1.equals("size")) {
				size(s);
			}
			else if(s1.equals("empty")) {
				empty(s);
			}
			else if(s1.equals("front")) {
				front(s);
			}
			else if(s1.equals("back")) {
				back(s);
			}
			n--;
		}
	}
}
