package sec09;
import java.util.*;

class Edge implements Comparable<Edge> {
	public int vertex, cost;
	public Edge(int vertex, int cost) {
		this.vertex = vertex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost-o.cost;
	}
}

public class Sec09_05 {
	static int n, m;
	static int[] dist;
	static ArrayList<ArrayList<Edge>> graph;
	
	public void solution(int start) {
		PriorityQueue<Edge> pQ = new PriorityQueue<Edge>();
		pQ.offer(new Edge(start, 0));
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int nowVertex = tmp.vertex;
			int nowCost = tmp.cost;
			if(nowCost>dist[nowVertex]) continue;
			for(Edge neighbor : graph.get(nowVertex)) {
				if(dist[neighbor.vertex]>nowCost+neighbor.cost) {
					dist[neighbor.vertex] = nowCost+neighbor.cost;
					pQ.offer(new Edge(neighbor.vertex, nowCost+neighbor.cost));
				}
			}			
		}
	}
	
	public static void main(String[] args) {
		Sec09_05 m5 = new Sec09_05();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		dist = new int[n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c));
		}
		m5.solution(1);
		for(int i=2; i<=n; i++) {
			if(dist[i]!=Integer.MAX_VALUE) System.out.println(i + " : " + dist[i]);
			else System.out.println(i + " : impossible");
		}		
	}
}
