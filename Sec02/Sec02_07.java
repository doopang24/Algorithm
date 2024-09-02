package sec02;
import java.util.*;

public class Sec02_07 {
	
	public int solution(int n, int[] arr) {
		int answer = 0, cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}		
		return answer;
	}

	public static void main(String[] args) {
		Sec02_07 m7 = new Sec02_07();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(m7.solution(num, arr));
	}

}
