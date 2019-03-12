public class WhileGugudanPr {
	public static void main(String[] args) {
		int a = 2;

		while(a < 10){
			int b = 0;
			while(b < 10){
				b++;
				System.out.print(a + " * " + b + " = " + a * b + "   ");
			}
			a++;
			System.out.println();
		}
		
	}
}
