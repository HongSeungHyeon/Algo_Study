//맞는데 틀렸다네........
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//!!!!!!!!!!!!!!!!!!!!!!!
package _BAEKJOON;
import java.util.*;
public class _1874_StackSequence {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		int n = input.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = input.nextInt();
		}
		int idx=1;
		int cnt=0;
		
		for(int i=0; i<n; i++) {
			if(cnt==0) {
				for(int j=1; j<=a[0]; j++) {
					s.push(idx);
					list.add("+");
					idx++;
				}
				cnt++;
			}
			if(s.isEmpty()) {
				while(idx<=a[i]) {
					s.push(idx);
					list.add("+");
					idx++;
				}
			}
			if(!s.isEmpty() && a[i] != s.peek()) {
				while(idx<=a[i]) {
					s.push(idx);
					list.add("+");
					idx++;
				}
			}
			if(!s.isEmpty() && a[i] == s.peek()) {
				s.pop();
				list.add("-");
			}
			if(a[i] == n) {
				while(!s.isEmpty()) {
					s.pop();
					list.add("-");
				}
				break;
			}
			if(s.isEmpty() && idx<=n) {
				System.out.println("NO");
				return;
			}
		}
		for(int m=0;m<list.size(); m++)
			System.out.println(list.get(m));
	}
}
