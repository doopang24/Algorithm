package sec07;

public class Sec07_01 {
	
	public void DFS(int n) {
		if(n==0) {
			return;		// void에서 return은 함수 종료
		} else {
			DFS(n-1);
			System.out.print (n + " ");		// 재귀함수는 stack 프레임 사용
		}
		
	}

	public static void main(String[] args) {
		Sec07_01 m1 = new Sec07_01();
		m1.DFS(5);
	}
}
