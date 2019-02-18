package _190122;
import java.util.*;
public class _SW_6808_KYcard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int win=0;
		int lose=0;
		int sum1=0, sum2=0;
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
	
		for(int i=0; i<9; i++) {
			list.add(input.nextInt());
		}
		for(int i=1; i<=18; i++) {
			if(!list.contains(i)) {
				list2.add(i);
			}
		}
	}
}