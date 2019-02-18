package _BAEKJOON;
import java.util.*;
public class _10828_Stack {
	public static void push(Stack<Integer> s, int a) {
		s.push(a);
	}
	public static void pop(Stack<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.pop());
		else
			System.out.println(-1);
	}
	public static void size(Stack<Integer> s) {
		System.out.println(s.size());
	}
	public static void empty(Stack<Integer> s) {
		if(s.isEmpty()) System.out.println(1);
		else System.out.println(0);
	}
	public static void top(Stack<Integer> s) {
		if(!s.isEmpty())
			System.out.println(s.peek());
		else
			System.out.println(-1);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
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
			else if(s1.equals("top")) {
				top(s);
			}
			n--;
		}
	}
}
