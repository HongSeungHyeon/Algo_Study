package _BAEKJOON;
import java.util.*;
public class _2941_CroAlpha {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; 
                
        String s = input.next();
        int result = 0;

        for(int i=0; i<word.length; i++) {
            if(s.contains(word[i])) {
                s = s.replaceAll(word[i], "*");
            }
        }
        
        result = s.length();
        
        System.out.println(result);
	}
}
