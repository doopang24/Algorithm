package sec08;
import java.util.*;

public class Sec08_05 {
	static int n, m;
	static int cnt = Integer.MAX_VALUE;
	
	public void DFS(int level, int sum, Integer[] changes) {
		if(sum>m) return;
		if(level>cnt) return;
		if(sum==m) {
			cnt = Math.min(cnt,level);
		} else {
			for(int i=0; i<n; i++) {
				DFS(level+1, sum+changes[i], changes);
//				sum+=changes[i];
//				DFS(level+1, sum, changes);
			}
		}
	}

	public static void main(String[] args) {
		Sec08_05 m5 = new Sec08_05();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		Integer[] changes = new Integer[n];
		for(int i=0; i<n; i++) changes[i] = kb.nextInt();
		Arrays.sort(changes, Collections.reverseOrder());
		m = kb.nextInt();
		m5.DFS(0, 0, changes);
		System.out.println(cnt);
	}
}
