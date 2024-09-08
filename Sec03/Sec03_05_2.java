package sec03;
import java.util.*;

public class Sec03_05_2 {
	
	public int solution(int n) {
		int answer = 0, cnt = 1;
		n--;						// n - 1
		while(n>0) {
			cnt++;
			n -= cnt;				// cnt가 연속된 자연수의 갯수
			if(n%cnt==0) answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec03_05_2 m5 = new Sec03_05_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(m5.solution(n));

	}

}
