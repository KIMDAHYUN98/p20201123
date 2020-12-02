package TEST;

public class Exapmple5 {
	public static void main(String[] args) {
		int[] numbers = {11, 20, 31, 40, 51, 60, 71, 80, 91, 100};
		
		int i = 0;
		int sum = 0;
		
		for(i=0; i < 10; i++) {
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
			} 
		} 
		System.out.println(sum);
		
		for (i=0; i< 10; i++) {
			if(numbers[i] %2 != 0) {
				sum += numbers[i];
			}
		}
		System.out.println(sum);
	}

}
