package courseJavaJun;

import java.util.Scanner;

public class HardTask1 {	//1234 - M CC XXX IV

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		int thousands = num / 1000;       		//разделяем число на тысячи, сотни, десятки и единицы
		int hundreds = (num % 1000) / 100;
		int tens = (num % 100) / 10;
		int units = num % 10; 
		
		if(num <= 0) {
			System.out.println("Некорректный ввод");
		}else {
			for(int i = 1; i <= thousands; i++) {
				System.out.print("M");
			}
			
			switch(hundreds) {
				case(1):
					System.out.print("C");
					break;
				case(2):
					System.out.print("CC");
					break;
				case(3):
					System.out.print("CCC");
					break;
				case(4):
					System.out.print("CD");
					break;
				case(5):
					System.out.print("D");
					break;
				case(6):
					System.out.print("DC");
					break;
				case(7):
					System.out.print("DCC");
					break;
				case(8):
					System.out.print("DCCC");
					break;
				case(9):
					System.out.print("CM");
					break;
			}
			
			switch(tens) {
				case(1):
					System.out.print("X");
					break;
				case(2):
					System.out.print("XX");
					break;
				case(3):
					System.out.print("XXX");
					break;
				case(4):
					System.out.print("XL");
					break;
				case(5):
					System.out.print("L");
					break;
				case(6):
					System.out.print("LX");
					break;
				case(7):
					System.out.print("LXX");
					break;
				case(8):
					System.out.print("LXXX");
					break;
				case(9):
					System.out.print("XC");
					break;
			}
			
			switch(units) {
				case(1):
				System.out.print("I");
					break;
				case(2):
					System.out.print("II");
					break;
				case(3):
					System.out.print("III");
					break;
				case(4):
					System.out.print("IV");
					break;
				case(5):
					System.out.print("V");
					break;
				case(6):
					System.out.print("VI");
					break;
				case(7):
					System.out.print("VII");
					break;
				case(8):
					System.out.print("VIII");
					break;
				case(9):
					System.out.print("IX");
					break;
			}
		}
	}

}
