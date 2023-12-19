package course;

public class Day8Task1 {

	public static void main(String[] args) {
		String string1;
		StringBuilder sb = new StringBuilder();

		long startTime = System.currentTimeMillis();
		for(int i = 1; i <=20000; i++) {
			string1 = i + " ";
			System.out.print(string1);
		}
		System.out.println();
		long endTime = System.currentTimeMillis();
		 
		long timeElapsed = endTime - startTime;
		
		System.out.println(timeElapsed);
		
		
		long startTime1 = System.currentTimeMillis();
		for(int j = 1; j <=20000; j++) {
			sb.append(j).append(" ");
		}
		System.out.println(sb);
		long endTime1 = System.currentTimeMillis();
		long timeElapsed1 = endTime1 - startTime1;
		
		System.out.println(timeElapsed1);
	}

}
