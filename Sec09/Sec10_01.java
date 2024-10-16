package sec10;
import java.util.*;

public class Sec10_01 {
	static int[] dy;
	
	public int solution(int stair) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=stair; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[stair];
	}

	public static void main(String[] args) {
		Sec10_01 m1 = new Sec10_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n+1];
		System.out.println(m1.solution(n));
	}
}
