package sec03;
import java.util.*;

public class Sec03_06 {
	
	public int solution(int len, int key, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		
		for(int rt=0; rt<len; rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>key) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec03_06 m6 = new Sec03_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		System.out.println(m6.solution(n, k, arr));
	}
}  
