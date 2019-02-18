package _190128;
import java.util.*;

public class _2178_Maze {
	public static void maze() {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int M = input.nextInt();
		int x,y,dx,dy,MAX=0;
		int[] _x = {1,0,-1,0};
		int[] _y = {0,1,0,-1};
		int[][] arr = new int[N][M];
		boolean[][] visit = new boolean[N][M];
		
		String s ="";
		
		for(int i=0; i<N; i++) {
			s= input.next();
			for(int j=0; j<M; j++) {
				arr[i][j] = Integer.parseInt(s.charAt(j) +"");
			}
		}
		input.close();
		
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		
		q1.add(0);
		q2.add(0);
		
		while(!q1.isEmpty() && !q2.isEmpty()) {
			x = q1.poll();
			y = q2.poll();
			for(int i=0;i<4;i++) {
				dx = x+_x[i];
				dy = y+_y[i];
				if(dx>=0 && dy>=0 && dx<N && dy<M && arr[dx][dy]==1 && visit[dx][dy] == false) {
					arr[dx][dy] = arr[x][y] + 1;
					MAX=arr[dx][dy];
					visit[dx][dy] = true;
					q1.add(dx);
					q2.add(dy);
				}
				if(dx == N-1 && dy == M-1) {
					System.out.println(MAX);
					return;
				}
			}
		}
		System.out.println(MAX);
	}
	public static void main(String[] args) {
		maze();
	}
}