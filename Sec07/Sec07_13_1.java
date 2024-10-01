package sec07;
import java.util.*;

public class Sec07_13_1 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] check, dist;
	
	public void BFS(int vertex) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(vertex);
		check[vertex] = 1;
		dist[vertex] = 0;
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) {
				if(check[nv]==0) {
					check[nv] = 1;
					queue.offer(nv);
					dist[nv] = dist[cv]+1;					
				}
			}
		}
	}

	public static void main(String[] args) {
		Sec07_13_1 m13 = new Sec07_13_1();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		check = new int[n+1];
		dist = new int[n+1];
		m13.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dist[i]);
		}
	}
}
