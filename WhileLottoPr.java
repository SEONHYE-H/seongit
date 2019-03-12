/*

*/
public class WhileLottoPr {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 3 + 1);
		int num2 = (int)(Math.random() * 3 + 1);
		int num3 = (int)(Math.random() * 3 + 1);
		
		while(num1 == num2 || num2 == num3 || num3 == num1){
			num1 = (int)(Math.random() * 3 + 1);
			num2 = (int)(Math.random() * 3 + 1);
			num3 = (int)(Math.random() * 3 + 1);
		}

		System.out.println(num1 + "   " + num2 + "   " + num3 + "  ");
	}
}
