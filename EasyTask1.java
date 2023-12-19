package courseJavaJun;

import java.util.Scanner;

public class EasyTask1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		scanner.close();
		
		if(firstNum > secondNum) {
			System.out.println("Первое число (" + firstNum + ") больше второго числа (" + secondNum + ").");
		} else if(firstNum < secondNum) {
			System.out.println("Первое число (" + firstNum + ") меньше второго числа (" + secondNum + ").");
		} else {
			System.out.println("Первое и второе число равны.");
		} 
		
	}

}
