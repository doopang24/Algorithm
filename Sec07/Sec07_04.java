package sec07;

public class Sec07_04 {
	
	static int[] fibo;
	
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n];
		if(n==1) {
			return fibo[1] = 1;
		} else if(n==2) {
			return fibo[2] = 1;
		} else {
			return fibo[n] = DFS(n-2) + DFS(n-1);
		}												// 재귀는 stack 프레임을 사용하기 때문에 for문보다 느리다
	}

	public static void main(String[] args) {
		Sec07_04 m4 = new Sec07_04();
		int n = 45;
		fibo = new int[n+1];
		m4.DFS(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}
