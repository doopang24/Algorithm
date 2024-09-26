package sec07;

public class Sec07_06 {
	static int n;
	static int[] check;
	
	public void DFS(int L) {
		if(L==n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(check[i]==1) tmp += (i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		} else {
			check[L] = 1;
			DFS(L+1);		
			check[L] = 0;
			DFS(L+1);		
		}
	}

	public static void main(String[] args) {
		Sec07_06 m6 = new Sec07_06();
		n = 3;
		check = new int[n+1];
		m6.DFS(1);
	}
}
