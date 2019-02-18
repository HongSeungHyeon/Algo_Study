package _190128;
import java.util.*;
public class _7576_tomato {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[][] a = new int[n][m];
		
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		
		int _x[] = {0,0,1,-1};
		int _y[] = {1,-1,0,0};
		int x,y,dx,dy, MAX=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = input.nextInt();
				if(a[i][j] == 1) {
					q1.add(i);
					q2.add(j);
				}
			}
		}
		while(!q1.isEmpty() && !q2.isEmpty()) {
			x = q1.poll();
			y = q2.poll();
			
			for(int i=0;i<4;i++) {
				dx = x+_x[i];
				dy = y+_y[i];
				if(dx>=0 && dx<n && dy>=0 && dy<m && a[dx][dy]==0) {
					a[dx][dy] = a[x][y]+1;
					MAX = a[x][y];
					q1.add(dx);
					q2.add(dy);
				}
			}
		}
		for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	        	if(a[i][j]==0){
	        		System.out.println("-1");
	                return;
	            }
	        }
	    }
		System.out.println(MAX);
	}
}






//package _190128;
//import java.util.*;
//public class _7576_tomato {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int m = input.nextInt();
//		int n = input.nextInt();
//		int day = 0;
//		
//		int[][] a = new int[n][m];
//		boolean[][] c = new boolean[n][m];
//		
//		for(int i=0; i<n; i++) 
//			for(int j=0; j<m; j++) 
//				a[i][j] = input.nextInt();
//		input.close();
//		
//		Queue<Integer> q1 = new LinkedList<>();
//		Queue<Integer> q2 = new LinkedList<>();
//		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				if(a[i][j] == 1) {
//					q1.add(i);
//					q2.add(j);
//				}
//			}
//		}
//		int x=0,y=0;
//		int sum=0;
//		while(!q1.isEmpty()) {
//			x = q1.poll();
//			y = q2.poll();
//			System.out.println(x+","+y);
//			c[x][y] = true;
//			
//			if(y!=m-1)if(a[x][y+1]==0 && c[x][y+1]==false) { q1.add(x); q2.add(y+1); a[x][y+1]=1; } //오른쪽
//			if(y>0)if(a[x][y-1]==0 && c[x][y-1]==false) { q1.add(x); q2.add(y-1); a[x][y-1]=1; } //왼쪽
//			if(x!=n-1)if(a[x+1][y]==0 && c[x+1][y]==false) { q1.add(x+1); q2.add(y); a[x+1][y]=1; } //아래쪽
//			if(x>0)if(a[x-1][y]==0 && c[x-1][y]==false) { q1.add(x-1); q2.add(y); a[x-1][y]=1; } //위쪽
//			int tmp = x+y;
//			if(sum != tmp) {
//				sum = tmp;
//				day++;
//			}
//		}
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				if(c[i][j] == false && a[i][j] == 0) {
//					day=-1;
//				}
//			}
//		}
//		if(day!=-1)
//			System.out.println(day-1);
//		else
//			System.out.println(day);		
//	}
//}
