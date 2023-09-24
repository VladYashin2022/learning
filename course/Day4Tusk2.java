package course;
import java.util.Random;
public class Day4Tusk2 {

	public static void main(String[] args) {
		Random random = new Random();
		int maxNum = 0;
		int minNum = 10000;
		int numOnZero = 0;
		int sumNumsOnZero = 0;
		int[] arr = new int[100];
		for(int i =0; i<arr.length;i++) {
			arr[i] = random.nextInt(10000);
		}

		for(int a:arr) {
			System.out.println(a + " ");
		}
		
		for(int j:arr) {
			if(maxNum<j) 
				maxNum=j;
		}
		System.out.println("Максимальное число в массиве - " + maxNum);
		
		for(int k:arr) {
			if(minNum>k) 
				minNum=k;
		}
		System.out.println("Минимальное число в массиве - " + minNum);
		
		for(int l:arr) {
			if(l%10==0) {
				numOnZero++;
				sumNumsOnZero = sumNumsOnZero+l;
			
			}
		}
		System.out.println("Чесел заканчивающихся на 0 - " + numOnZero);
		System.out.println("Сумма чисел заканчивающихся на 0 - " + sumNumsOnZero);
		
	}

}
