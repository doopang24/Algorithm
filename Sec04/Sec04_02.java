package sec04;
import java.util.*;

public class Sec04_02 {
	
	public String solution(String str1, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		for(char x : str2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) return "NO";
			map.put(x, map.get(x)-1);
		}
		
		return answer;
	}
	
//	public String solution(String str1, String str2) {
//		String answer = "";
//		
//		HashMap<Character, Integer> cnt1 = new HashMap<Character, Integer>();
//		for(char x : str1.toCharArray()) {
//			cnt1.put(x, cnt1.getOrDefault(x, 0)+1);
//		}		
//		HashMap<Character, Integer> cnt2 = new HashMap<Character, Integer>();
//		for(char x : str2.toCharArray()) {
//			cnt2.put(x, cnt2.getOrDefault(x, 0)+1);
//		}		
//		if(cnt1.equals(cnt2)) answer = "YES";
//		else answer = "NO";
//		
//		return answer;
//	}

	public static void main(String[] args) {
		Sec04_02 m2 = new Sec04_02();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		
		System.out.println(m2.solution(a, b));
	}
}
