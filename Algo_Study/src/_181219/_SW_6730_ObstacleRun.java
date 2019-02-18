package _181219;
import java.util.*;
public class _SW_6730_ObstacleRun {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] block = new int [101];
		int num = input.nextInt();
		
		for(int k=0; k<num; k++) {
			int n = input.nextInt();
			for(int i=0; i<n;i++) { block[i] = input.nextInt(); }
			int max=0, min=0;		
			
			for(int i=0; i<n-1; i++) {
				if(block[i]>block[i+1]) {
					min = Math.max(min,(block[i]-block[i+1]));
				}
				else
					max = Math.max(max, block[i+1]-block[i]);
			}
			System.out.println("#"+(k+1)+" "+max+" "+min);
		}
	}
}
