package _BAEKJOON;
import java.util.*;
public class _2577_numCnt {
	public static void num(int n1,int n2, int n3) {
		int s = n1*n2*n3;
		int[] arr = new int[10];
		while(s>0) {
			int x = s%10;
			arr[x]++;
			s=s/10;
		}
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1= input.nextInt();
		int n2= input.nextInt();
		int n3= input.nextInt();
		
		num(n1,n2,n3);
	}
}
