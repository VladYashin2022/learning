package course;

public class Day5Task1 {

	public static void main(String[] args) {
		Car mersedes = new Car();
		mersedes.setYearOfIssue(2023);
		mersedes.setColor("Black");
		mersedes.setModel("Mersedes G63 AMG");
		
		System.out.println(mersedes.getYearOfIssue() + " " + mersedes.getColor() + " " + mersedes.getModel());
	}

}

class Car{
	private int yearOfIssue;
	private String color;
	private String model;
	
	public void setYearOfIssue(int yearOfIssue) {
		if(yearOfIssue <= 2000) {
			System.out.println("Вы ввели некорректный год выпуска автомобиля");
		} else {
			this.yearOfIssue = yearOfIssue;
		}
	}
	
	public int getYearOfIssue() {
		return yearOfIssue;
	}
	
	
	public void setColor(String color) {
		if(color.isEmpty()) {
			System.out.println("Вы не ввели цвет машины");
		} else {
			this.color = color;
		}
	}
	
	public String getColor() {
		return color;
	}
	
	
	public void setModel(String model) {
		if(model.isEmpty()) {
			System.out.println("Вы не ввели модель машины");
		} else {
			this.model = model;
		}
	}
	
	public String getModel() {
		return model;
	}
}
