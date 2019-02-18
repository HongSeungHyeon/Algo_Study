package _BAEKJOON;
import java.util.*;
public class _1966_PrintQue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		LinkedList<Integer> q = new LinkedList<>();
		
		for(int i=0; i<a; i++) {
			int tmp = input.nextInt();
			arr.add(tmp);
			q.add(tmp);
		}
		
		int k = arr.get(b);
		arr.sort(null);
		int cnt=0;
		while(!q.isEmpty()) {
			for(int i=a; i>0; i--) {
				int x = q.poll();
				int tmp = arr.get(i-1);
				while(x != tmp) {
					q.add(x);
					x=q.poll();
				}
				cnt++;
				if(x==k) {
					System.out.println(cnt);
					break;
					}
			}
		}
	}
}