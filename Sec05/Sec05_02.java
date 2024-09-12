package sec05;
import java.util.*;

public class Sec05_02 {
	
	public String solution(String mixture) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : mixture.toCharArray()) {
			if(x!=')') {
				stack.push(x);
			} else {
				while(stack.pop()!='('); 
			}
		} 
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sec05_02 m2 = new Sec05_02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(m2.solution(str));
	}
}