package _BAEKJOON;
import java.util.*;
public class _1260_DFSBFS {
	public static void DFS(ArrayList<Integer>[] a,boolean[] c, int v) {
		if(c[v]) return;
		c[v] = true;
		
		System.out.print(v+" ");
		
		for(int vv:a[v]) {
			if(!c[vv])
				DFS(a,c,vv);
		}
	}
	
	public static void BFS(ArrayList<Integer>[] a,boolean[] c,int v) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		c[v] = true;
		
		while(!q.isEmpty()) {
			v=q.poll();
			System.out.print(v+" ");
			
			for(int vv : a[v]) {
				if(!c[vv]) {
					q.add(vv);
					c[vv]=true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		int v = input.nextInt();
		
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
		for(int i=0; i<=n ;i++) { a[i] = new ArrayList<>(); }
		
		boolean[] c = new boolean[n+1];
		for(int i=0; i<m; i++) {
			int v1 = input.nextInt();
			int v2 = input.nextInt();
			
			a[v1].add(v2);
			a[v2].add(v1);
		}
		for(int i=1; i<m; i++) 
		DFS(a,c,v);
		Arrays.fill(c, false);
		System.out.println();
		BFS(a,c,v);
	}
}