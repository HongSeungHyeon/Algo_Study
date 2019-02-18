package _190208;
import java.util.*;

public class _2606_Virus {
	
	public static void DFS(ArrayList<Integer>[] a, boolean[] c, int v) {
		if(c[v] = true) return;
		c[v] = true;
		
		System.out.print(v+" ");
		for(int vv : a[v]) {
			if(!c[vv])
				DFS(a,c,vv);
		}
	}
	
	public static void BFS(ArrayList<Integer>[] a, boolean[] c, int v, int b) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(v);
		c[v] = true;
		
		while(!q.isEmpty()) {
			v=q.poll();
			//System.out.print(v+" ");
			
			for(int vv: a[v]) {
				if(!c[vv]) {
					q.add(vv);
					c[vv] = true;
					b++;
				}
			}
		}
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		int num =0;
		
		ArrayList<Integer>[] a  = (ArrayList<Integer>[]) new ArrayList[n+1];
		for(int i=0; i<=n ;i++) { a[i] = new ArrayList<>(); }
		
		boolean[] c = new boolean[n+1];
		for(int i=0; i<m; i++) {
			int v1 = input.nextInt();
			int v2 = input.nextInt();
			
			a[v1].add(v2);
			a[v2].add(v1);
		}
		BFS(a,c,1,num);
		
	}
}