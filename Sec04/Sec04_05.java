package sec04;
import java.util.*;

public class Sec04_05 {
	
	public int solution(int size, int order, int[] numArr) {
		int answer = -1;
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				for(int k=j+1; k<size; k++) {
					ts.add(numArr[i] + numArr[j] + numArr[k]);
				}
			}
		}
		int cnt = 0;
		for(int x : ts) {
			cnt++;
			if(cnt==order) return x;
		}
				
		return answer;
	}

	public static void main(String[] args) {
		Sec04_05 m5 = new Sec04_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}		
		System.out.println(m5.solution(n, k, arr));
	}
}
