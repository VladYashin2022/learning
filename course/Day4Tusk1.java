package course;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Day4Tusk1 {
	public static void main(String[] args) {
		int num1 = 0,num2 = 0,num3 = 0,num4 = 0,sum=0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int[] array = new int[n];
		for(int i = 0; i<array.length; i++) {
			array[i]=random.nextInt(10);
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Длинна массива - " + array.length);
		for (int b:array) {
			if(b>8) {
				num1++;
			}
		}
		System.out.println("Чисел больше 8 в массиве - " + num1);
		
		for (int c:array) {
			if(c==1) {
				num2++;
			}
		}
		System.out.println("Чисел равных 1 в массиве - " + num2);
		
		for(int d:array) {
			if(d%2==0) {
				num3++;
			}else num4++;
		}
		System.out.println("Количество четных чисел в массиве -  " +num3);
		System.out.println("Колличество нечетных чисел в массиве - " + num4);
		
		for(int m:array) {
			sum = sum+m;
		}
		System.out.println("Сумма всех элементов в массиве - " + sum);
	}
}
