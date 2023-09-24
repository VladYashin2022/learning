package course;
import java.util.Scanner;
public class Day3Tusk2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double result = 0;
		while(true) {
			double first = scanner.nextDouble();
			double second = scanner.nextDouble();
			if(second == 0) 
				break;
			result = first/second;
			System.out.println("Результат равен - " + result);
			}
		}
	}
