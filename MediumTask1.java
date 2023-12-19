package courseJavaJun;

import java.util.Scanner;

public class MediumTask1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float firstNum = scanner.nextFloat();
		float secondNum = scanner.nextFloat();
		
		String s = new String(scanner.next());
		scanner.close();
		
		char sign = s.charAt(0);
		float sum = firstNum + secondNum;
		float subtraction = firstNum - secondNum;
		float division = firstNum / secondNum;
		float multiplication = firstNum * secondNum;
		
		switch(sign) {
		    case '+': 
		    	System.out.println(firstNum + " + " + secondNum + " = " + sum);
		    	break;
		    case '-':
			    System.out.println(firstNum + " - " + secondNum + " = " + subtraction);
			    break;
		    case '/':
			    System.out.println(firstNum + " / " + secondNum + " = " + division);
		        break;
		    case '*':
			    System.out.println(firstNum + " * " + secondNum + " = " + multiplication);
			    break;
		    default:
		    	System.out.println("Неккоректный ввод");
		}
	}

}
