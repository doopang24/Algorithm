package sec07;

public class Sec07_01 {
	
	public void DFS(int n) {
		if(n==0) {
			return;		// void���� return�� �Լ� ����
		} else {
			DFS(n-1);
			System.out.print (n + " ");		// ����Լ��� stack ������ ���
		}
		
	}

	public static void main(String[] args) {
		Sec07_01 m1 = new Sec07_01();
		m1.DFS(5);
	}
}
