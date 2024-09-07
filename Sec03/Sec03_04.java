package sec03;
import java.util.*;

public class Sec03_04 {
	
	public int solution(int len, int m, int[] arr) {
		int answer = 0, sum = 0, lt = 0;
		for(int rt=0; rt<len; rt++) {
			sum += arr[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum -= arr[lt++];
				if(sum==m) answer++;
			}
		}			
		return answer;
	}
	

	public static void main(String[] args) {
		Sec03_04 m4 = new Sec03_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}		
		System.out.println(m4.solution(n, m, arr));
	}
}
