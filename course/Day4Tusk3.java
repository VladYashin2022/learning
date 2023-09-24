package course;
import java.util.Random;
import java.util.Arrays;
public class Day4Tusk3 {
	public static void main(String[] args) {
		Random random = new Random();
		int max = 0;
		int sum = 0;
		int[] sumArr = new int[12];
		int[][] arr = new int[12][8];
		for(int i = 0; i<12; i++) {
			for(int j = 0; j<8; j++) {
				arr[i][j] = random.nextInt(50);
				System.out.print(arr[i][j] + " ");
				sum = sum + arr[i][j];
			}
			System.out.println("сумма элементов в строке массива - "+sum);
			sumArr[i] = sum;
			sum = 0;
		}
		System.out.println(Arrays.toString(sumArr));
		for (int k = 1; k < sumArr.length; k++)
		{
		    for(int l =0; l<sumArr.length-1; l++) {
		    	if(sumArr[l]>sumArr[k]) max = l+1;
		    }
	}
		System.out.println("Строка " + max + " имеет максимальную сумму членов");
}
}