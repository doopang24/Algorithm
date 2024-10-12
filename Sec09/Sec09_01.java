package sec09;
import java.util.*;

class Body implements Comparable<Body> {
	public int h, w;
	public Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h-this.h;	// 내림차순
	}
}

public class Sec09_01 {
	
	public int solution(int n, ArrayList<Body> list) {
		int cnt = 0, max = Integer.MIN_VALUE;
		Collections.sort(list);
		for(Body body : list) {
			if(body.w>max) {
				max = body.w;
				cnt++;
			}
		}		
		return cnt;
	}
	
	public static void main(String[] args) {
		Sec09_01 m1 = new Sec09_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			list.add(new Body(a, b));
		}
		System.out.println(m1.solution(n, list));
	}
}
