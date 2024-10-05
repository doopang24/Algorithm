package sec08;
import java.util.*;

public class Sec08_09 {		// 조합구하기
	static int n, m;
	static int[] comb;
	
	public void DFS(int level, int s) {
		if(level==m) {
			for(int x : comb) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i=s; i<=n; i++) {
				comb[level] = i;
				DFS(level+1, i+1);
			}
		}
	}

	public static void main(String[] args) {
		Sec08_09 m9 = new Sec08_09();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		comb = new int[m];
		m9.DFS(0, 1);
	}
}
