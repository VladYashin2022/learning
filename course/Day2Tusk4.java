package course;
import java.util.Scanner;
public class Day2Tusk4 {

	public static void main(String[] args) {
		System.out.print("Введите число - ");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		scanner.close();
		double y = 0;
		if(x>=5) {
			y = (Math.pow(x,2)- 10)/(x+7);
			System.out.println("y = " + y);
		} else if(x>3 && x<5) {
			y = (x+3)*(Math.pow(x, 2) - 2);
			System.out.println("y = " + y);
		} else System.out.println("Y = 420");		
	}

}
