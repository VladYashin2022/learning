package course;

public class Triangle extends Figure {
	double a;
	double b;
	double c;
	double halfP;
	
	public Triangle(double a, double b, double c, String color) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public double area() {
		halfP = (a + b + c) / 2;
		s = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
		return s;
	}

	@Override
	public double perimeter() {
		p = a + b + c;
		return p;
	}

}
