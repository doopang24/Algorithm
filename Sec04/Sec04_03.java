package sec04;
import java.util.*;

public class Sec04_03 {
	
	public ArrayList<Integer> solution(int days, int session, int[] income) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		HashMap<Integer, Integer> cnt = new HashMap<>();
		for(int i=0; i<session-1; i++) {
			cnt.put(income[i], cnt.getOrDefault(income[i], 0)+1);
		}		
		int lt = 0;
		for(int rt=session-1; rt<days; rt++) {
			cnt.put(income[rt], cnt.getOrDefault(income[rt], 0)+1);
			answer.add(cnt.size());
			cnt.put(income[lt], cnt.get(income[lt])-1);
			if(cnt.get(income[lt])==0) cnt.remove(income[lt]);
			lt++;			
		}		
		return answer;
	}
	
//	public ArrayList<Integer> solution(int days, int session, int[] income) {
//		ArrayList<Integer> answer = new ArrayList<Integer>();
//		int p1 = 0;
//		
//		for(int p2=session; p2<days; p2++) {
//			HashMap<Integer, Integer> cnt = new HashMap<>();
//			for(int i=p1; i<p2; i++) {
//				cnt.put(income[i], cnt.getOrDefault(income[i],0)+1);
//			}
//			answer.add(cnt.size());
//			p1++;
//		}				
//		return answer;
//	}

	public static void main(String[] args) {
		Sec04_03 m3 = new Sec04_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : m3.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}
