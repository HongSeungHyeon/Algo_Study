package _0참고;

import java.util.*;
public class BFSDFS {
	public static void DFS(ArrayList<Integer>[] a, boolean[] c, int v) {
		if(c[v]) { return; }  //c[v]가 true이면 리턴 (방문했다면, 1이면)
		c[v] = true;
		
		System.out.print(v+" ");
		
		for(int vv : a[v]) { 			// a[v]에 있는 값들을 하나씩 vv에 넣어본다.
			//System.out.println(vv);
			if(!c[vv]) 					//c[vv]가 false이면 (방문하지 않았다면, 0이면)
				DFS(a,c,vv);
		}
	}
	
	public static void BFS(ArrayList<Integer>[] a, boolean[] c, int v) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(v);
		c[v] = true;
		
		while(!q.isEmpty()) { // 큐가 비어있지 않으면 반복
			v = q.poll();
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
		DFS(a,c,v);
		System.out.println();
		Arrays.fill(c, false);
		BFS(a,c,v);
	}
}