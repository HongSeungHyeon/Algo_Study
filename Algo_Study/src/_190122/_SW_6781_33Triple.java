package _190122;
import java.util.*;
public class _SW_6781_33Triple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String[] a = s1.split("");
		String[] arr2 = s2.split("");
		
		String[] num = new String[9];
		
		int cnt =0;
		int result =0;
		
		for(int i=0; i<9; i++) {
			num[i] = a[i].concat(arr2[i]);
		}
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(num[i]==num[j]) {
					cnt++;
				}
			}
			if(cnt>=3) result++;
		}
		
//		
//		int[] arr= new int[9];
//		
//		for(int i=0; i<9; i++) arr[i] = Integer.parseInt(a[i]);
//		for(int i=0; i<9; i++) {
//			System.out.print(arr[i]);
//			System.out.print(arr2[i]);
//			System.out.println();
//		}
	}
}