package sec04;
import java.util.*;

public class Sec04_01 {
	
	public char solution(int n, String result) {
		char answer = ' ';
		
		HashMap<Character, Integer> cnt = new HashMap<>();
		for(char x : result.toCharArray()) {
			cnt.put(x, cnt.getOrDefault(x, 0)+1);
		}
		
//		System.out.println(cnt.containsKey('f'));
//		System.out.println(cnt.size());
//		System.out.println(cnt.remove('A'));
//		System.out.println(cnt.size());
		
		int max = Integer.MIN_VALUE;
		for(char key : cnt.keySet()) {
//			System.out.println(key + " " + cnt.get(key));
			if(cnt.get(key)>max) {
				max = cnt.get(key);
				answer = key;
			}
		}		
		return answer;
	}

	public static void main(String[] args) {
		Sec04_01 m1 = new Sec04_01();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		String str = kb.next();
		
		System.out.println(m1.solution(num, str));
	}
}
