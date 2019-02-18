package _190208;
import java.util.*;

public class _10216_CountCircleGroups {
	public static double dist(int x1,int y1,int x2,int y2) {
		double a = Math.pow(x2-x1, 2);
		double b = Math.pow(y2-y1, 2);
		double c = Math.sqrt(a+b);
		
		return c;
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
		
		int[][] arr = new int[5001][5001];
		
		int num = input.nextInt();	//적 숫자
		//int[][] en = new int[num][3]; // 적 x,y,r 배열
		boolean[][] c = new boolean[5001][5001];
		
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		
		//입력받는 부분
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<3; j++) {
//				en[i][j] = input.nextInt();
//			}
//		}		
		
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
		for(int i=0; i<=num ;i++) { a[i] = new ArrayList<>(); }
		
		for(int i=0; i<num; i++) {
			int v1 = input.nextInt();
			int v2 = input.nextInt();
			int r = input.nextInt();

		}
		
	}
}
