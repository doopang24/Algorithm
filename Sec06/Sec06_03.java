package sec06;
import java.util.*;

public class Sec06_03 {
	
	public int[] solution(int num, int[] numArr) {
		
		for(int i=1; i<num; i++) {
			int tmp = numArr[i], j;
			for(j=i-1; j>=0; j--) {
				if(numArr[j] > tmp) {
					numArr[j+1] = numArr[j];
				} else {
					break;
				}
			}
			numArr[j+1] = tmp;
		}
		
		return numArr;
	}

	public static void main(String[] args) {
		Sec06_03 m3 = new Sec06_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		for(int x : m3.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
