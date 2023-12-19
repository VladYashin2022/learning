package course;

public abstract class Figure {
	private String color;
	double s;
	double p;
	
	public Figure(String color) {
		this.color = color;
	}
	
	public void setColor(String color) { this.color = color; }
	public String getColor() { return color; }
	
	public abstract double area();
	public abstract double perimeter();
}
