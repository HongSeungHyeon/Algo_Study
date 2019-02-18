package _181219;
import java.util.*;
public class _1315_RPG {
	public static void main(String[] args) {
		int STR = 0;
		int INT = 1;
		int PNT = 2;
		
		Scanner input = new Scanner(System.in);
		
		int[] me = new int[3];
		me[STR] = 1;
		me[INT] = 1;
		me[PNT] = 0;
		int max1=0;
		int max2=0;
		int a=0, b=0;
		int cnt1=0;
		int cnt2=0;
		
		int n = input.nextInt();
		int[][] arr = new int[n][3];
		int[] flag1 = new int[n];
		int[] flag2 = new int[n];
		for(int i=0; i<n; i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
			arr[i][2] = input.nextInt();
		}
		//Èû¸¸¿Ã¸±¶§
		while(a==0) {
			for(int i=0; i<n; i++) {
				if(flag1[i]==0) {
					if(me[STR]>=arr[i][0] || me[INT]>=arr[i][1]) {
						me[STR]+=arr[i][2];
						flag1[i] = 1;
						max1++;
					}
				}
				cnt1++;
				if(cnt1>=n) a=1;
			}
		}
		me[STR] = 1;
		me[INT] = 1;
		me[PNT] = 0;
		while(b==0) {
			for(int i=0; i<n; i++) {
				if(flag2[i]==0) {
					if(me[STR]>=arr[i][0] || me[INT]>=arr[i][1]) {
						me[INT]+=arr[i][2];
						flag2[i] = 1;
						max2++;
					}
				}
				cnt2++;
				if(cnt2>=n) b=1;
			}
		}
		System.out.println(Math.max(max1, max2));
	}
}