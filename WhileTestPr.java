public class WhileTestPr {
	public static void main(String[] args) {
		System.out.println(" 1 - 10 ���� ���");
		int a = 0;
		while(a < 10){
			a++;
			System.out.println(a);
		}


		System.out.println(" 1 - 10 ���� ���� �߻�");
		int b = 0;
		boolean flag = true;
		while(flag){
			b = (int)(Math.random() * 10);
			if(b != 0){
				System.out.println(b);
			} else {
				System.out.println("0�� ���Դ�");
				flag = false;
			}
		}
	}
}
