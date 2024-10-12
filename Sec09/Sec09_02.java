package sec09;
import java.util.*;

class Meeting implements Comparable<Meeting> {
	public int start, end;
	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Meeting o) {
		if(this.end==o.end) return this.start-o.start;	// 오름차순
		else return this.end-o.end;
	}
}

public class Sec09_02 {
	
	public int solution(int n, ArrayList<Meeting> list) {
		int cnt = 0, endTime = 0;
		Collections.sort(list);
		for(Meeting m : list) {
			if(m.start>=endTime) {
				endTime = m.end;
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Sec09_02 m2 = new Sec09_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Meeting> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			list.add(new Meeting(a, b));
		}
		System.out.println(m2.solution(n, list));
	}
}
