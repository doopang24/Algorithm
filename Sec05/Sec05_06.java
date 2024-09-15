package sec05;
import java.util.*;

public class Sec05_06 {
	
	public int solution(int n, int k) {
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		while(!queue.isEmpty()) {
			for(int i=1; i<k; i++) queue.offer(queue.poll());
			queue.poll();
			if(queue.size()==1) answer = queue.poll();
		}
		
		return answer;
	}
	
//	public int solution(int n, int k) {
//		int answer = 0;
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			list.add(i+1);
//		}
//		int cnt = 0;
//		while(list.size()>1) {
//			for(int i=0; i<list.size(); i++) {
//				cnt++;
//				if(cnt==3) {
//					list.remove(i);
//					cnt = 0;
//				}
//			}
//		}
//		answer = list.get(0);		
//		
//		return answer;
//	}

	public static void main(String[] args) {
		Sec05_06 m6 = new Sec05_06();
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.println(m6.solution(a, b));
	}
}
