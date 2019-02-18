package _BAEKJOON;
import java.util.*;
public class _10039_AVGScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr= new int[5];
		int sum=0;
		
		for(int i=0; i<5; i++)
			arr[i] = input.nextInt();
		for(int i=0; i<5; i++) {
			if(arr[i]<40) arr[i] =40;
			sum+=arr[i];
		}
		System.out.println(sum/5);
	}
}
