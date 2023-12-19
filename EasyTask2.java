package courseJavaJun;

import java.util.Scanner;

public class EasyTask2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		if(num == 0) {
			System.out.println("Число равно 0.");
		} else if(num % 2 == 0) {
			System.out.println("Число " + num + " четное.");
		}  else if(num % 2 == 1) {
			System.out.println("Число " + num + " нечетное");
		}
	}

}
