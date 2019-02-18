package _181226;
import java.util.*;

public class RE_1520_DownRoad {
	static int move(int[][] arr, int i, int j, int start) {
		if(arr[i][j]>arr[i][j+1]) { start = arr[i][j+1]; j++; return start; } //오른쪽
		if(arr[i][j]>arr[i+1][j]) { start = arr[i+1][j]; i++; return start; } //아래
		if(arr[i][j]>arr[i][j-1]) { start = arr[i][j-1]; j--; return start; } //왼쪽
		if(arr[i][j]>arr[i-1][j]) { start = arr[i-1][j]; i--; return start; } //위쪽
		return start;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int row = input.nextInt();
		int col = input.nextInt();
		
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				arr[i][j] = input.nextInt();
			}
		}
		int start=arr[0][0];
		int i=0;
		int j=0;		
		
		while(start!=arr[row][col]) {
			start=move(arr,i,j,start);
			System.out.println(start);
		}
	}
}
