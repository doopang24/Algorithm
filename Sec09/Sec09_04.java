package sec09;
import java.util.*;

class lecture implements Comparable<lecture> {
	public int pay, date;
	public lecture(int pay, int date) {
		this.pay = pay;
		this.date = date;
	}
	@Override
	public int compareTo(lecture o) {
		return o.date-this.date;
	}
}

public class Sec09_04 {
	static int n, max = Integer.MIN_VALUE;
	
	public int solution(ArrayList<lecture> lec) {
		int income = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());	// 큰 수가 앞으로
		Collections.sort(lec);
		int j=0;
		for(int i=max; i>=1; i--) {
			for( ; j<n; j++) {
				if(lec.get(j).date<i) break;
				pQ.offer(lec.get(j).pay);
			}
			if(!pQ.isEmpty()) income += pQ.poll();
		}
		
		return income;
	}
	
	public static void main(String[] args) {
		Sec09_04 m4 = new Sec09_04();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<lecture> lec = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			lec.add(new lecture(a, b));
			if(b>max) max = b;
		}
		System.out.println(m4.solution(lec));
	}
}
