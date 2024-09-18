package sec06;
import java.util.*;

public class Sec06_04 {
	
	public int[] solution(int size, int times, int[] works) {
		int[] answer = new int[size];
		
		for(int x : works) {
			int pos = -1;
			for(int i=0; i<size; i++) {				// hit, miss È®ÀÎ
				if(answer[i]==x) {
					pos = i;
					break;
				}
			}			
			if(pos!=-1) {							// cache hit
				for(int i=pos; i>0; i--) {
					answer[i] = answer[i-1];
				}
			} else {								// cache miss
				for(int i=size-1; i>0; i--) {
					answer[i] = answer[i-1];
				}
			}
			answer[0] = x;
		}
		
//		for(int x : works) {
//			for(int i=0; i<size; i++) {
//				if(answer[i]==x) {			// cache hit
//					for(int j=i-1; j>=0; j--) {
//						answer[j+1] = answer[j];
//						answer[0] = x;
//					}
//				} else {					// cache miss
//					for(int j=size-2; j>=0; j--) {
//						answer[j+1] = answer[j];
//						answer[0] = x;
//					}
//				}
//			}
//		}
				
		return answer;
	}

	public static void main(String[] args) {
		Sec06_04 m4 = new Sec06_04();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		int[] arr = new int[b];
		for(int i=0; i<b; i++) arr[i] = kb.nextInt();
		
		for(int x : m4.solution(a, b, arr)) System.out.print(x + " ");
	}
}
