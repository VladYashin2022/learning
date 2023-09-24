package course;
import java.util.Scanner;
public class Day3Tusk3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i<=5; i++) {
			double first = scanner.nextDouble();
			double second = scanner.nextDouble();
			if(second == 0) {
				System.out.println("Деление на 0");
				continue;
			}
			System.out.println(first/second);
		}

	}

}
