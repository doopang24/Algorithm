package sec01;
import java.util.*;

public class Sec01_01 {
	
	public int solution(String str, char t) {
		int answer = 0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		for(char x : str.toCharArray()) {
			if(x==t) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Sec01_01 S = new Sec01_01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char ch = kb.next().charAt(0);
		System.out.println(S.solution(str, ch));
	}
}
