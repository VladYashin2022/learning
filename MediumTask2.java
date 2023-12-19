package courseJavaJun;

import java.util.Scanner;

public class MediumTask2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.close();
		
		if(year <= 0) {
			System.out.println("Некорректный ввод");
		}
		 else if(year % 4 == 0) {
			System.out.println("Год високосный");
		}
		 else System.out.println("Год невисокосный");

	}

}
