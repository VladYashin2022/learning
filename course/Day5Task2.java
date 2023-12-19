package course;

public class Day5Task2 {

	public static void main(String[] args) {
		Motorbike bike1 = new Motorbike("Hitachi", "Black", 2015);
		System.out.println(bike1.getColor() + " " + bike1.getModel() + " " + bike1.getYear());
	}

}

class Motorbike{
	private int year;
	private String color;
	private String model;
	
	public Motorbike(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	public String getModel() { return model; }
	public String getColor() { return color; }
	public int getYear() { return year; }
}