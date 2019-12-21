import java.util.Scanner;

public class ArrayTest {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int sum = 0;
		int[] array = new int[4];
		for(int i=0;i<4;i++) {
			int input = sc.nextInt();
			array[i] = input;
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		for(int j=0;j<4;j++) {
			sum += array[j];
		}
		System.out.println(sum);
		222
	}
}
