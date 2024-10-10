package sec08;
import java.util.*;

public class Sec08_13_DFS {
	static int n, answer = 0;
	static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1}, dy = {0, 1, 0, -1, 1, -1, 1, -1};
	
	public void DFS(int x, int y, int[][] map) {
		map[x][y] = 0;
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && map[nx][ny]==1) {
				DFS(nx, ny, map);
			}
		}
	}
	
	public void solution(int[][] map) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==1) {
					answer++;
					DFS(i, j, map);
				}
			}
		}
	}

	public static void main(String[] args) {
		Sec08_13_DFS m13 = new Sec08_13_DFS();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int[][] map = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = kb.nextInt();
			}
		}
		m13.solution(map);
		System.out.println(answer);
	}

}
