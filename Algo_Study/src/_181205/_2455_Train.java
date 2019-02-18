package _181205;
import java.util.Scanner;

public class _2455_Train {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max=0;
		int tmp=0;
		
		for(int i=0; i<4; i++) {
			String str = input.nextLine();
			String[] InOut = str.split(" ");
			
			int a = Integer.valueOf(InOut[0]);
			int b = Integer.valueOf(InOut[1]);
			
			max -= a;
			max += b;
			
			if(max>tmp) tmp = max;
		}
		System.out.print(tmp);
	}
}