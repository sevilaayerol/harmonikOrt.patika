package harmonikOrt;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		double average;
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += 1.0 / numbers[i];
		}
		average = numbers.length / sum;

		System.out.println("harmonik ortalama:" + average);
	}
}
