package sec08;
import java.util.*;

public class Sec08_01 {
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	public void DFS(int level, int sum, int[] numArr) {
		if(flag) return;			// return�� �޼��� ��ü�� �����Ŵ. �� return�� ������ �ٸ�.
		if(sum>total/2) return;		// return�� ������ DFS�޼��带 �����ϰ� stack�� ������� DFS�޼���� ���ư�.
		if(level==n) {
			if((total-sum)==sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(level+1, sum+numArr[level], numArr);
			DFS(level+1, sum, numArr);
		}
	}

	public static void main(String[] args) {
		Sec08_01 m1 = new Sec08_01();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n ;i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		m1.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
