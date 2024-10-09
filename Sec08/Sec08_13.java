package sec08;
import java.util.*;

class Point3 {
	public int x, y;
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Sec08_13 {
	static int n, answer;
	static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1}, dy = {0, 1, 0, -1, 1, -1, 1, -1};
	static int[][] map;
	
	public void BFS(int x, int y) {
		Queue<Point3> queue = new LinkedList<>();
		queue.offer(new Point3(x, y));
		map[x][y] = 0;
		while(!queue.isEmpty()) {
			Point3 tmp = queue.poll();
			for(int i=0; i<8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=1 && nx<=n && ny>=1 && ny<=n && map[nx][ny]==1) {
					queue.offer(new Point3(nx, ny));
					map[nx][ny] = 0; 
				}
			}
		}
	}

	public static void main(String[] args) {
		Sec08_13 m13 = new Sec08_13();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		map = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				map[i][j] = kb.nextInt();
			}
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(map[i][j]==1) {
					answer++;
					m13.BFS(i, j);
				}
			}
		}
		System.out.println(answer);
	}
}
