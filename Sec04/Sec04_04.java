package sec04;
import java.util.*;

public class Sec04_04 {
	
	public int solution(String whole, String part) {
		int answer = 0;		
		char[] w = whole.toCharArray();
		HashMap<Character, Integer> cntW = new HashMap<>();
		HashMap<Character, Integer> cntP = new HashMap<>();
		
		for(char x : part.toCharArray()) {
			cntP.put(x, cntP.getOrDefault(x, 0)+1);
		}
		
		for(int i=0; i<part.length()-1; i++) {
			cntW.put(w[i], cntW.getOrDefault(w[i], 0)+1);
		}
		
		int lt = 0;
		for(int rt=part.length()-1; rt<w.length; rt++) {
			cntW.put(w[rt], cntW.getOrDefault(w[rt], 0)+1);
			if(cntP.equals(cntW)) answer++;
			cntW.put(w[lt], cntW.get(w[lt])-1);
			if(cntW.get(w[lt])==0) cntW.remove(w[lt]);
			lt++;
		}
		
		return answer;
	}	

	public static void main(String[] args) {
		Sec04_04 m4 = new Sec04_04();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		
		System.out.println(m4.solution(a, b));
	}
}
