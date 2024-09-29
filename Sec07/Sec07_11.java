package sec07;
import java.util.*;

public class Sec07_11 {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] check;
	
	public void DFS(int val) {
		if(val==n) {
			answer++;
		} else {
			for(int i=1; i<=n; i++) {
				if(graph[val][i]==1 && check[i]==0) {
					check[i] = 1;
					DFS(i);
					check[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Sec07_11 m11 = new Sec07_11();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		graph = new int[n+1][n+1];
		check = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1;
		}
		check[1] = 1;		// 출발점이니까
		m11.DFS(1);
		System.out.println(answer);
	}
}
