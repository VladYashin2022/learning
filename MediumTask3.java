package courseJavaJun;

import java.util.Scanner;

public class MediumTask3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		long result = 1;
		
		if(num >= 0) {
			for(int i = 1; i <= num; i++) { 
				result = result*i;
			}
		} else {
		     System.out.println("Некорректный ввод");
		  }
		
		System.out.println(result);
	}

}
