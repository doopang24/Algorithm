package sec08;
import java.util.*;

class Point5 {
	public int x, y;
	public Point5(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Sec08_14_answer {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] comb;
	static ArrayList<Point5> house, pizza;
	
	public void DFS(int level, int start) {
		if(level==m) {
			int sum = 0;
			for(Point5 h : house) {
				int dis = Integer.MAX_VALUE;
				for(int i : comb) {
					dis = Math.min(dis, Math.abs(h.x-pizza.get(i).x)+Math.abs(h.y-pizza.get(i).y));
				}
				sum+=dis;
			}
			answer = Math.min(answer, sum);
		} else {
			for(int i=start; i<len; i++) {
				comb[level] = i;
				DFS(level+1, i+1);
			}
		}
	}

	public static void main(String[] args) {
		Sec08_14_answer m14 = new Sec08_14_answer();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		house = new ArrayList<>();
		pizza = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int tmp = kb.nextInt();
				if(tmp==1) house.add(new Point5(i, j));
				else if(tmp==2) pizza.add(new Point5(i, j));
			}
		}
		len = pizza.size();
		comb = new int[m];
		m14.DFS(0, 0);
		System.out.println(answer);
	}
}
