package courseJavaJun;

import java.util.Scanner;

public class EasyTask3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		scanner.close();
		
		if(hour >= 5 && hour <= 11) {
			System.out.println("Сейчас утро");
		}
		 else if(hour >=12 && hour <= 18) {
			System.out.println("Сейчас день");
		}
		 else if(hour >= 19 && hour <= 23) {
			 System.out.println("Сейча вечер");
		 }
		 else if(hour >= 1 && hour <= 4 || 
				 						hour == 24 || 
				 						hour == 0) {
			 System.out.println("Сейчас ночь");
		 }
		 else System.out.println("Некорректный ввод");

	}

}
