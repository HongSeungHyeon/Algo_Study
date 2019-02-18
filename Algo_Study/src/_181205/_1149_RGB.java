package _181205;
import java.util.Scanner;

public class _1149_RGB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int num = input.nextInt();
		int n = num+1;
		
		int[][] RGB = new int[n][3];
		int min = 0;
		int sum = 0;
		
		for(int i=1; i<n; i++) {
			String str = input2.nextLine();
			String[] tmp= str.split(" ");
			
			int R = Integer.valueOf(tmp[0]);
			int G = Integer.valueOf(tmp[1]);
			int B = Integer.valueOf(tmp[2]);
			
			if(i==1) {
				RGB[0][0] = R;
				RGB[0][1] = G;
				RGB[0][2] = B;
			}
			RGB[i][0] = R;
			RGB[i][1] = G;
			RGB[i][2] = B;
			
			if(min == RGB[i-1][0]) min = Math.min(G, B);
			else if(min == RGB[i-1][1]) min = Math.min(R, B);
			else if(min == RGB[i-1][2]) min = Math.min(R, G);
			else min = Math.min(R, Math.min(G, B));
			
			sum += min;
		}
		System.out.println(sum);
	}
}
