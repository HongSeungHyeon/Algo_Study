package _181226;
import java.util.*;

public class _1670_HeadMeeting2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr= new int[10001];
		arr[0]=1;
		arr[1]=2;
		arr[2]=5;
		for(int i=3; i<n/2; i++) {
			arr[i] = arr[i-1]*2+arr[i-2]*arr[i-2];
		}
		System.out.println(arr[(n-1)/2]);
	}
}
