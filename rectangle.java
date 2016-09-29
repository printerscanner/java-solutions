import java.awt.Rectangle;
import java.awt.Point;

class rectangle {


	public static Point findCenter(Rectangle box) {
		Rectangle box = new Rectangle(0, 0, 100, 200);
		int x = box.x + box.width/2;
		int y = box.y + box.height/2;
		return new Point(x,y);
	}


	public static void main(String[] args) {
	Point blank = new Point(3,4);
	int x = blank.x;

	System.out.println(blank.x + ", " + blank.y);
	int distance = (blank.x * blank.x + blank.y * blank.y);
	System.out.println(distance);
	System.out.println(blank);

	}
}