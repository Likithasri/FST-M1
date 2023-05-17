package activities;

public class Activity2 {

	public static void main(String[] args) {
		int[] number = { 10, 77, 10, 54, -11, 10};
		System.out.println(result(number));
	}

	public static boolean result(int[] number) {
		int sum = 0;
		int result = 30;
		int nlength = number.length;
		for (int i = 0; i < nlength; i++) {
			if (number[i] == 10) {
				sum += number[i];
			}
		} if (result == sum)
			return true;
		else
			return false;
	}

}
