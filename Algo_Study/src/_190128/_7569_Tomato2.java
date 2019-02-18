package _190128;
import java.util.*;
public class _7569_Tomato2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		int h = input.nextInt();
		int x,y,z,dx,dy,dz,MAX=0;
		int[] _x = {1,-1,0,0,0,0};
		int[] _y = {0,0,1,-1,0,0};
		int[] _z = {0,0,0,0,1,-1};
		
		int[][][] a = new int[n][m][h];
		
		for(int k=0; k<h; k++) for(int i=0; i<n; i++) for(int j=0; j<m; j++) 
			a[i][j][k] = input.nextInt();
			
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		Queue<Integer> qz = new LinkedList<>();
		
		for(int k=0; k<h; k++) for(int i=0; i<n; i++) for(int j=0; j<m; j++)
			if(a[i][j][k]==1) { qx.add(i); qy.add(j); qz.add(k); }	
		
		int a2=1;
		while(!qx.isEmpty() && !qy.isEmpty() && !qz.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			z = qz.poll();

			
			for(int i=0; i<6; i++) {
				dx = x+_x[i];
				dy = y+_y[i];
				dz = z+_z[i];
				if(dx>=0 && dx<n && dy>=0 && dy<m && dz>=0 && dz<h && a[dx][dy][dz] == 0) {
					a[dx][dy][dz] = a[x][y][z] +1;
					MAX = a[x][y][z];
					qx.add(dx);
					qy.add(dy);
					qz.add(dz);
				}
			}
		}
		for(int k=0; k<h; k++) for(int i=0; i<n; i++) for(int j=0; j<m; j++) 
			if(a[i][j][k]==0) {
				System.out.println(-1);  
				return;
			}
		System.out.println(MAX);
	}
}
