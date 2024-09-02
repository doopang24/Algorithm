package sec02;
import java.util.*;

public class Sec02_08 {
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			int cnt = 0;
			for(int j=0; j<n; j++) {
				if(arr[i]<arr[j]) cnt++;
			}
			answer[i] = cnt + 1;
		}

		return answer;
		}
	
	public static void main(String[] args) {
		Sec02_08 m8 = new Sec02_08();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] scoreArr = new int[num];
		for(int i=0; i<num; i++) {
			scoreArr[i] = kb.nextInt();
		}
		for(int x : m8.solution(num, scoreArr)) {
			System.out.print(x + " ");
		}

	}

}
