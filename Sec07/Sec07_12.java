package sec07;
import java.util.*;

public class Sec07_12 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] check;
	
	public void DFS(int val) {
		if(val==n) {
			answer++;
		} else {
			for(int nv : graph.get(val)) {
				if(check[nv]==0) {
					check[nv] = 1;
					DFS(nv);
					check[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Sec07_12 m12 = new Sec07_12();
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
		check[1] = 1;
		m12.DFS(1);
		System.out.println(answer);
	}
}
