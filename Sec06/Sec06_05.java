package sec06;
import java.util.*;

public class Sec06_05 {
	
	public char solution(int num, int[] numArr) {
		char answer = 'U';
		
		Arrays.sort(numArr);
		for(int i=0; i<num-1; i++) {
			if(numArr[i]==numArr[i+1]) return 'D';
		}
		
//		for(int i=0; i<num-1; i++) {
//			int tmp = numArr[i];
//			for(int j=i+1; j<num; j++) {
//				if(numArr[j]==tmp)  {
//					answer = 'D';
//					break;
//				}
//			}
//		}		
		return answer;
	}

	public static void main(String[] args) {
		Sec06_05 m5 = new Sec06_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		System.out.println(m5.solution(n, arr));
	}
}
