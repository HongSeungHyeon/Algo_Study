package _BAEKJOON;
import java.util.*;
public class _10866_Deque {
	public static void push_front(LinkedList<Integer> d, int a) {
		d.addFirst(a);
	}
	public static void push_back(LinkedList<Integer> d, int a) {
		d.addLast(a);
	}
	public static void pop_front(LinkedList<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.pollFirst());
		else
			System.out.println(-1);
	}
	public static void pop_back(LinkedList<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.pollLast());
		else
			System.out.println(-1);
	}
	public static void size(LinkedList<Integer> s) {
		System.out.println(s.size());
	}
	public static void empty(LinkedList<Integer> s) {
		if(s.isEmpty()) System.out.println(1);
		else System.out.println(0);
	}
	public static void front(LinkedList<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.getFirst());
		else
			System.out.println(-1);
	}
	public static void back(LinkedList<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.getLast());
		else
			System.out.println(-1);
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> s = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		while(n>0) {
			String s1 = input.next();
			
			if(s1.equals("push_front")) {
				int a = input.nextInt();
				push_front(s,a);
			}
			else if(s1.equals("push_back")) {
				int a = input.nextInt();
				push_back(s,a);
			}
			else if(s1.equals("pop_front")) {
				pop_front(s);
			}
			else if(s1.equals("pop_back")) {
				pop_back(s);
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
