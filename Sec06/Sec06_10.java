package sec06;
import java.util.*;

public class Sec06_10 {
	
	public int count(int[] dist, int mid) {
		int cnt = 1;
		int ep = dist[0];
		for(int i=1; i<dist.length; i++) {
			if(dist[i]-ep >= mid) {
				cnt++;
				ep = dist[i];
			}
		}		
		return cnt;
	}
	
	public int solution(int amount, int horse, int[] dist) {
		int answer = 0;
		Arrays.sort(dist);
		int lt = 1;
		int rt = dist[amount-1];
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(dist, mid) >= horse) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}		
		return answer;
	}

	public static void main(String[] args) {
		Sec06_10 m10 = new Sec06_10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int c = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		System.out.println(m10.solution(n, c, arr));
	}
}
