package aj2.cap8.cert;

public class TestTriangle {

	public static void main(String[] args) {
		Point a = new Point(0,0);
		Point b = new Point(15,15);
		Point c = new Point(30,0);
		Triangle t = new Triangle(a,b,c);
		t.draw();
	}
}
