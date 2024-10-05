package sec08;
import java.util.*;

public class Sec08_08 {
	static int n, f;
	static int[] bottom, weight, check;
	static int[][] memo = new int[35][35];
	boolean flag = false;
	
	public int comb(int n, int r) {
		if(memo[n][r]>0) return memo[n][r];
		if(n==r || r==0) return 1;
		else return memo[n][r] = comb(n-1, r-1) + comb(n-1, r); 
	}
	
	public void DFS(int level, int sum) {
		if(flag) return;
		if(level==n) {
			if(sum==f) {
				for(int x : bottom) System.out.print(x + " ");
				flag = true;
			}
		} else {
			for(int i=1; i<=n; i++) {
				if(check[i]==0) {
					check[i] = 1;
					bottom[level] = i;
					DFS(level+1, sum+(bottom[level]*weight[level]));
					check[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Sec08_08 m8 = new Sec08_08();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		f = kb.nextInt();
		bottom = new int[n];
		weight = new int[n];
		check = new int[n+1];
		for(int i=0; i<n; i++) {
			weight[i] = m8.comb(n-1, i);
		}
		m8.DFS(0, 0);
	}
}
