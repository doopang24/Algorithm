package sec08;
import java.util.*;

public class Sec08_04 {
	static int[] arrM;
	static int n, m;
	
	public void DFS(int level) {
		if(level==m) {
			for(int x : arrM) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i=1; i<=n; i++) {
				arrM[level] = i;
				DFS(level+1);
			}
		}
	}

	public static void main(String[] args) {
		Sec08_04 m4 = new Sec08_04();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arrM = new int[m];
		m4.DFS(0);
	}
}
