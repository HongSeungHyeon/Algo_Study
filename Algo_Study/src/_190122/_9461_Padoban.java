package _190122;
import java.util.*;
public class _9461_Padoban {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int[] arr = new int[101];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 2;
		arr[4] = 2;
		arr[5] = 3;
		arr[6] = 4;
		arr[7] = 5;
		arr[8] = 7;
		
		while(T>0) {
			int n = input.nextInt();
			if(n>=9) {
				int a=2;
				for(int i=9; i<n; i++) {
					arr[i] = arr[i-1]+a;
					a++;
				}
			}
			System.out.println(arr[n-1]);
			T--;
		}
	}
}
