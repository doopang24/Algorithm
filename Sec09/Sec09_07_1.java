package sec09;
import java.util.*;

class Road implements Comparable<Road> {
	public int v1, v2, cost;
	public Road(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Road o) {
		return this.cost-o.cost;
	}
}

public class Sec09_07_1 {		// 최소스패닝트리 : 크루스칼, Union&Find 활용
	static int[] unf;
	
	public static int Find(int v) {
		if(v==unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {	
		Scanner kb = new Scanner(System.in);
		int v = kb.nextInt();
		int e = kb.nextInt();
		unf = new int[v+1];
		for(int i=1; i<=v; i++) unf[i] = i;
		ArrayList<Road> map = new ArrayList<>();
		for(int i=0; i<e; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			map.add(new Road(a, b, c));
		}
		int answer = 0;
		Collections.sort(map);
		for(Road road : map) {
			int fv1 = Find(road.v1);
			int fv2 = Find(road.v2);
			if(fv1!=fv2) {
				answer += road.cost;
				Union(road.v1, road.v2);
			}
		}
		System.out.println(answer);
	}
}
