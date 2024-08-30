package sec02;
import java.util.*;

public class Sec02_04 {
	
	public void solution(int n) {
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for(int i=2; i<n; i++) {
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		Sec02_04 m4 = new Sec02_04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		m4.solution(n);
	}
}
