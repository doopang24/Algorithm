package sec05;
import java.util.*;

public class Sec05_03 {
	
	public int solution(int size, int[][] dolls, int attempt, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<>();
		
		for(int pos : moves) {
			for(int i=0; i<size; i++) {
				if(dolls[i][pos-1]!=0) {
					int tmp = dolls[i][pos-1];
					dolls[i][pos-1]=0;
					if(!basket.isEmpty() && basket.peek()==tmp) {
						answer += 2;
						basket.pop();
					} else {
						basket.push(tmp);
					}
					break;
				}
			}
		}		
		return answer;
	}
	
//	public int solution(int size, int[][] dolls, int attempt, int[] moves) {
//		int answer = 0;
//		
//		Stack<Integer> basket = new Stack<>();
//		for(int j=0; j<size; j++) {
//			for(int i=0; i<size; i++) {
//				if(moves[0]==j+1 && dolls[i][j]!=0) {
//					basket.push(dolls[i][j]);
//					break;
//				}
//			}
//		}		
//		for(int m=1; m<moves.length; m++) {
//			for(int j=0; j<size; j++) {
//				for(int i=0; i<size; i++) {
//					if(moves[m]==j+1 && dolls[i][j]!=0 && !basket.isEmpty()) {
//						if(basket.peek()==dolls[i][j]) {
//							basket.pop();
//							answer += 2;
//						} else {
//							basket.push(dolls[i][j]);
//						}
//						dolls[i][j] = 0;
//						break;
//					}
//				}
//			}
//		}		
//		
//		return answer;
//	}

	public static void main(String[] args) {
		Sec05_03 m3 = new Sec05_03();
		Scanner kb = new Scanner(System.in);
		int size = kb.nextInt();
		int[][] dolls = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				dolls[i][j] = kb.nextInt();
			}
		}
		int attempt = kb.nextInt();
		int[] moves = new int[attempt];
		for(int i=0; i<attempt; i++) {
			moves[i] = kb.nextInt();
		}
		
		System.out.println(m3.solution(size, dolls, attempt, moves));
	}
}
