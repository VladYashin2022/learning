package course;
import java.util.Scanner;

public class Day2Tusk2 {
	public static void main(String[] args) {
		int result = 0;
		System.out.print("Введите два числа - ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		if (a>=b) {   //Проверяем, верно ли введено условие
			System.out.println("Некорректный ввод");
		}else {
			for(int i =a+1; i>=a && i<b; i++) {
				result = i%10;
				if(result == 5) {
					System.out.printf("%d ", i);
				}
			}
		}
	}
}
