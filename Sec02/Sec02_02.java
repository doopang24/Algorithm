package sec02;
import java.util.*;

public class Sec02_02 {
	
	public int solution(int n, int[] arr) {
		int answer = 1, ki = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i]>ki) {
				ki = arr[i];
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Sec02_02 m2 = new Sec02_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(m2.solution(n, arr));
	}
}
