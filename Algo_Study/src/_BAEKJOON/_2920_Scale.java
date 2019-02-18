package _BAEKJOON;
import java.util.*;
public class _2920_Scale {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> c = new ArrayList<>();
		
		
		for(int i=0; i<8; i++) {
			a.add(input.nextInt());
			b.add(i+1);
			c.add(8-i);
		}
		if(a.equals(b)) System.out.println("ascending");
		else if(a.equals(c)) System.out.println("descending");
		else System.out.println("mixed");
	}
}