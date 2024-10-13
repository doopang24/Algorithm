package sec09;
import java.util.*;

class Visit implements Comparable<Visit> {
	public int time;
	public char state;
	public Visit(int time, char state) {
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Visit o) {
		if(this.time==o.time) return this.state-o.state;
		else return this.time-o.time;
	}
}

public class Sec09_03 {
	
	public int solution(ArrayList<Visit> list) {
		int cnt = 0, answer = Integer.MIN_VALUE;
		Collections.sort(list);
		for(Visit v : list) {
			if(v.state=='s') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Sec09_03 m3 = new Sec09_03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Visit> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			list.add(new Visit(a, 's'));
			int b = kb.nextInt();
			list.add(new Visit(b, 'e'));
		}
		System.out.println(m3.solution(list));	
	}
}
