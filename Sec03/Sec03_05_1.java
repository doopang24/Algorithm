package sec03;
import java.util.*;

public class Sec03_05_1 {
	
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 0;
		int m = n/2 + 1;
		
		int[] arr = new int[m];
		arr[0] = 1;
		for(int i=1; i<m; i++) {
			arr[i] = arr[i-1] + 1;
		}
		
		for(int rt=0; rt<m; rt++) {
			sum += arr[rt];
			if(sum==n) answer++;
			while(sum>=n) {
				sum -= arr[lt++];
				if(sum==n) answer++;
			}
		}		
		return answer;
	}

	public static void main(String[] args) {
		Sec03_05_1 m5 = new Sec03_05_1();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		
		System.out.println(m5.solution(num));
	}
}
