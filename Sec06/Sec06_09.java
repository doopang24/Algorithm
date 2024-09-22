package sec06;
import java.util.*;

public class Sec06_09 {
	
	public int count(int[] songs, int capacity) {
		int cnt = 1, sum = 0;
		for(int x : songs) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			} else {
				sum += x;
			}
		}
		return cnt;
	}
	
	public int solution(int n, int albums, int[] songs) {
		int answer = 0;
//		Arrays.sort(songs);
		int lt = Arrays.stream(songs).max().getAsInt();
		int rt = Arrays.stream(songs).sum();
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(songs, mid)<=albums) {
				answer = mid;
				rt = mid-1;
			} else {
				lt = mid+1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec06_09 m9 = new Sec06_09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		
		System.out.println(m9.solution(n, m, arr));
	}
}
