package sec02;
import java.util.*;

public class Sec02_05 {
	
	public int solution(int n) {
		int answer = 0;
		int[] check = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(check[i]==0) {
				answer++;
				for(int j=i; j<=n; j+=i) check[j] = 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec02_05 m5 = new Sec02_05();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		System.out.println(m5.solution(num));
	}
}
