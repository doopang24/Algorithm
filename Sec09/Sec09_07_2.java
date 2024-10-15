package sec09;
import java.util.*;

class Route implements Comparable<Route> {
	public int vertex, cost;
	public Route(int vertex, int cost) {
		this.vertex = vertex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Route o) {
		return this.cost-o.cost;
	}
}

public class Sec09_07_2 {		// 최소스패닝트리 : 프림, PriorityQueue
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		int[] check = new int[v+1];
		ArrayList<ArrayList<Route>> map = new ArrayList<ArrayList<Route>>();
		for(int i=0; i<=v; i++) {
			map.add(new ArrayList<Route>());
		}
		for(int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			map.get(a).add(new Route(b, c));
			map.get(b).add(new Route(a, c));
		}
		int answer = 0;
		PriorityQueue<Route> pQ = new PriorityQueue<Route>();
		pQ.offer(new Route(1, 0));
		while(!pQ.isEmpty()) {
			Route tmp = pQ.poll();
			int tv = tmp.vertex;
			if(check[tv]==0) {
				check[tv] = 1;
				answer += tmp.cost;
				for(Route x : map.get(tv)) {
					if(check[x.vertex]==0) pQ.offer(new Route(x.vertex, x.cost));
				}
			}
		}
		System.out.println(answer);
	}
} 
