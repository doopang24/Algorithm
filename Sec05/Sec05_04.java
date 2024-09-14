package sec05;
import java.util.*;

public class Sec05_04 {
	
	public int solution(String postfix) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(char x : postfix.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push((int)(x-'0'));
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}		
		answer = stack.get(0);
		
		return answer;
	}

	public static void main(String[] args) {
		Sec05_04 m4 = new Sec05_04();
		Scanner kb = new Scanner(System.in);
		String expression = kb.next();
		
		System.out.println(m4.solution(expression));
	}
}
