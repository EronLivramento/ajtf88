package aj2.cap8.cert;

class Triangle extends Shape{
	private Point a, b, c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void draw() {
		drawLine(a,b);
		drawLine(b,c);
		drawLine(c,a);
	}
}
