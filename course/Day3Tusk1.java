package course;
import java.util.Scanner;
public class Day3Tusk1 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("Введите название города - ");
			String city = extracted().nextLine();
			
			if(city.equals("Stop")) {
				break;
			}
			switch(city) {
			case "Москва":
			case "Владивосток":
			case "Ростов":
				System.out.println("Это Россия");
				break;
			case "Рим":
			case "Милан":
			case "Турин":
				System.out.println("Это Италия");
				break;
			case "Ливерпуль":
			case "Манчестер":
			case "Лондон":
				System.out.println("Это Англия");
				break;
			case "Берлин":
			case "Мюнхен":
			case "Кельн":
				System.out.println("Это Германия");
				break;
			default:
				System.out.println("Неизвестная страна");
				break;
			
			}
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
