package course;

public class Rectangle extends Figure {
	double a;
	double b;
	
	public Rectangle(double a, double b, String color) {
		super(color);
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double area() {
		s = a * b;
		return s;
	}

	@Override
	public double perimeter() {
		p = 2 * (a + b);
		return p;
	}

}
