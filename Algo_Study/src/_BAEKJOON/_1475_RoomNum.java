package _BAEKJOON;
//import java.util.*;
//public class _1475_RoomNum {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		
//		String N = input.next();
//		int n = Integer.parseInt(N);
//		
//		int cnt_69=0;
//		int cnt=0;
//		
//		for(int i=0; i<N.length(); i++) {
//			if(n%10 == 6 || n%10 == 9) {
//				if(cnt_69%2 == 0)
//					cnt++;
//				cnt_69++;
//			}
//			else
//				cnt++;
//			n/=10;
//		}
//		System.out.println(cnt);
//	}
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        
        if(n==0){
            System.out.println(1);
            return;
        }
        
        int setNums[]= new int[10];
        while(n>0){
            int a = n%10;
            setNums[a]++;
            n/=10;
        }
        
        int max=0;
        for(int i = 0 ; i < 10 ; i++){
            if(i==6 || i==9){
                continue;
            }
            if(max < setNums[i]){
                max = setNums[i];
            }
        }
        if(max < (setNums[6]+setNums[9]+1)/2){
            max = (setNums[6]+setNums[9]+1)/2;
        }
        
        System.out.println(max);
    }
}