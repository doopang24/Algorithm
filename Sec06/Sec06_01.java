package sec06;
import java.util.*;

public class Sec06_01 {
	
	public int[] solution(int num, int[] numArr) {
		for(int i=0; i<num-1; i++) {
			int idx = i;
			for(int j=i+1; j<num; j++) {
				if(numArr[idx] > numArr[j]) idx = j;
			}
			if(idx!=i) {
				int tmp = numArr[i];
				numArr[i] = numArr[idx];
				numArr[idx] = tmp;
			}
		}		
		return numArr;
	}

	public static void main(String[] args) {
		Sec06_01 m1 = new Sec06_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		for(int x : m1.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
