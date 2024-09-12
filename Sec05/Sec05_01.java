package sec05;
import java.util.*;

public class Sec05_01 {
	
	public String solution(String bracket) {
		String answer = "YES";
		Stack<Character> st = new Stack<>();
		
		for(char x : bracket.toCharArray()) {
			if(x=='(') {
				st.push(x);
			} else if(x==')') {
				if(st.isEmpty()) return "NO"; 
				st.pop();
			}
		}
		if(!st.isEmpty()) return "NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Sec05_01 m1 = new Sec05_01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(m1.solution(str));
	}
}
