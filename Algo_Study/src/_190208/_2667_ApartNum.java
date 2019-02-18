package _190208;
import java.util.*;

public class _2667_ApartNum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[][] arr = new int[N][N];
		boolean[][] c = new boolean[N][N];
		
		String s = "";
		int x,y,dx,dy;
		int[] _x = {0,0,1,-1,0};
		int[] _y = {1,-1,0,0,0};
		
		//¸Ê ÀÔ·Â¹Þ±â
		for(int i=0; i<N; i++) {
			s=input.next();
			for(int j=0; j<N; j++) { 
				arr[i][j] = Integer.parseInt(s.charAt(j)+"");
				c[i][j] = false;
			}
		}
		if(N==1 && arr[0][0] == 0) {
			System.out.println(0);
			System.out.println(0);
			return;
		}
		if(N==1 && arr[0][0] == 1) {
			System.out.println(1);
			System.out.println(1);
			return;
		}
		
		int num = 1;
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		while(true) {
			int cnt=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j] == 1 && c[i][j] == false) {
						qx.add(i);
						qy.add(j);
						break;
					}
					if(!qx.isEmpty()) break;
				}
				if(!qx.isEmpty()) break;
			}
			
			while(!qx.isEmpty() && !qy.isEmpty()) {
				x = qx.poll();
				y = qy.poll();
				//System.out.println(x+","+y);
				
				for(int i=0; i<5; i++) {
					dx = x+_x[i];
					dy = y+_y[i];
					if(dx>=0 && dy>=0 && dx<N && dy<N && arr[dx][dy]==1 && c[dx][dy]==false) {
						qx.add(dx);
						qy.add(dy);
						c[dx][dy] = true;
						arr[dx][dy] = num;
						cnt++;
					}
				}
			}
			if(cnt==0) break;
			num++;
			arr2.add(cnt);
		}
//		for(int i=0;i<N; i++) {
//			for(int j=0;j<N; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		
		System.out.println(num-1);
		arr2.sort(null);
		for(int i=0; i<arr2.size(); i++)
			System.out.println(arr2.get(i));
	}
}