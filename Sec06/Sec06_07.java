package sec06;
import java.util.*;

class Point implements Comparable<Point> {
	public int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) { 
			return this.y-o.y;
		} else {
			return this.x-o.x; 		// 음수가 리턴되면 this < o
		}							// 오름차순으로 정렬하려면 음수가 리턴되도록 해야 하나?
	}
}

public class Sec06_07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);		// compareTo(Point o)에 정의된 대로 정렬
		
		for(Point o : arr) {
			System.out.println(o.x + " " + o.y);
		}
	}
}
