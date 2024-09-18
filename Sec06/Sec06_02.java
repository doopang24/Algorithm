package sec06;
import java.util.*;

public class Sec06_02 {
	
	public int[] solution(int num, int[] numArr) {
		
		for(int cnt=num-1; cnt>=1; cnt--) {
			for(int i=0; i<cnt; i++) {
				if(numArr[i] > numArr[i+1]) {
					int tmp = numArr[i+1];
					numArr[i+1] = numArr[i];
					numArr[i] = tmp;
				}
			}
		}
		
		return numArr;
	}

	public static void main(String[] args) {
		Sec06_02 m2 = new Sec06_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		for(int x : m2.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
