public class LottoPr {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 3 + 1);
		int num2 = 0;
		int num3 = 0;

		do{
			num2 = (int)(Math.random() * 3 + 1);
		} while(num1 == num2);
		do{
			num3 = (int)(Math.random() * 3 + 1);
		} while(num3 == num1 || num3 == num2);

		System.out.println(num1 + "  " + num2 + "  " + num3);
	}
}
