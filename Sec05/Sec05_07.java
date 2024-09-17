package sec05;
import java.util.*;

public class Sec05_07 {
	
	public String solution(String reqSub, String stuPlan) {
		String answer = "YES";
		Queue<Character> queue = new LinkedList<>();
		for(char x : reqSub.toCharArray()) queue.offer(x);
		
		for(char x : stuPlan.toCharArray()) {
			if(queue.contains(x)) {
				if(queue.poll()!=x) return "NO";
			}
		}
		if(!queue.isEmpty()) return "NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Sec05_07 m7 = new Sec05_07();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(m7.solution(a, b));
	}
}
