package sec05;
import java.util.*;

public class Sec05_05 {
	
	public int solution(String bracket) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<bracket.length(); i++) {
			if(bracket.charAt(i)=='(') {
				stack.push(bracket.charAt(i));
			} else if(bracket.charAt(i)==')' && bracket.charAt(i-1)=='(') {
				stack.pop();
				answer += stack.size();
			} else {
				stack.pop();
				answer += 1;
			}
		}
		
		return answer;
	}
	
//	public int solution(String bracket) {
//		int answer = 0;
//		Stack<Character> stack = new Stack<>();
//		
//		for(char x : bracket.toCharArray()) {
//			if(x=='(') {
//				stack.push(x);
//			} else {
//				stack.pop();
//				answer += stack.size();
//			}
//		}
//		
//		return answer;
//	}

	public static void main(String[] args) {
		Sec05_05 m5 = new Sec05_05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();		
		System.out.println(m5.solution(str));
	}
}
