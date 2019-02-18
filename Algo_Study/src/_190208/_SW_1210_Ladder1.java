package _190208;
import java.util.*;
public class _SW_1210_Ladder1 {
	static int[][] arr = new int[100][100];
	static boolean[][] c = new boolean[100][100];
	static int cnt=0;
	static int k=1;
	
	public static void DFS(int x,int y) {
		if(x>=0 && y>=0 && x<=99 && y<=99) {
			c[x][y] = true;
			if(y<99)
			if(arr[x][y+1] == 1 && c[x][y+1] == false){
				if(x==0)
					if(arr[x][y+1] == 1) {System.out.println(y+1); return;}
				arr[x][y+1] = arr[x][y] +1;
				DFS(x,y+1);
			}
			if(y>0)
				if(arr[x][y-1] == 1 && c[x][y-1] == false){
					if(x==0)
						if(arr[0][y-1] == 1) { System.out.println(y-1); return;}
				arr[x][y-1] = arr[x][y] +1;
				DFS(x,y-1);
				}
			if(x>0)
				if(arr[x-1][y] == 1 && c[x-1][y] == false){
					if((x-1) == 0)
						if(arr[x-1][y] == 1 && cnt==0) { System.out.println("#"+k+" "+y);cnt++;}
					arr[x-1][y] = arr[x][y] +1;
					DFS(x-1,y);
				}
		}
	}
	
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		while(k<=10) {
			cnt =0;
			int n = input.nextInt();
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					arr[i][j] = input.nextInt();
					c[i][j] = false;
				}
			}
			for(int i=0;i<100;i++) {
				if(arr[99][i]== 2)
					DFS(99,i);
			}
			k++;
		}
	}
}
