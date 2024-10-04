package sec08;
import java.util.*;

public class Sec08_07 {
	int[][] memo = new int[35][35];
	
	public int DFS(int n, int r) {
		if(memo[n][r]>0) return memo[n][r];
		if(n==r || r==0) {
			return 1;
		} else {
			return memo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
		}
	}
	
	public static void main(String[] args) {
		Sec08_07 m7 = new Sec08_07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int r = kb.nextInt();
		System.out.println(m7.DFS(n, r));
	}
}
