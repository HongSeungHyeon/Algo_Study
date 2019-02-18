package _181226;
import java.util.*;
public class _SW_3143_FastType {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a=0;
		
		while(a<num) {
			String s1 = input.next();
			String s2 = input.next();
			
			String[] arr1 = s1.split("");
			String[] arr2 = s2.split("");
	
			int cnt = arr1.length;
			
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i].equals(arr2[0])) {
					int k=i;
					for(int j=0; j<arr2.length; j++) {
						if(arr1[k].equals(arr2[j])) {
							k++;
						}
					}
					cnt=cnt-(arr2.length-1);
				}
			}
			System.out.println("#"+(a+1)+" "+cnt);
			a++;
		}
	}
}
