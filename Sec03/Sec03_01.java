package sec03;
import java.util.*;

public class Sec03_01 {
	
	public ArrayList<Integer> solution(int n, int[] arrN, int m, int[] arrM) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int pn = 0, pm = 0;
		
		while(pn<n && pm<m) {
			if(arrN[pn] < arrM[pm]) {
				answer.add(arrN[pn++]);
			} else {
				answer.add(arrM[pm++]);
			}
		}
		while(pn<n) answer.add(arrN[pn++]);
		while(pm<m) answer.add(arrM[pm++]);
				
		return answer;
	}

	public static void main(String[] args) {
		Sec03_01 m1 = new Sec03_01();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arrN = new int[n];
		for(int i=0; i<n; i++) arrN[i] = kb.nextInt();
		
		int m = kb.nextInt();
		int[] arrM = new int[m];
		for(int i=0; i<m; i++) arrM[i] = kb.nextInt();
		
		for(int x : m1.solution(n, arrN, m, arrM)) System.out.print(x + " ");
	}
}
