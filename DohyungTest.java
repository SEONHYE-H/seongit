public class DohyungTest {
	public static void main(String[] args) {
		


		Rect r1= new Rect();
		// ���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰� �ѷ��� 14�Դϴ�
		r1.calcArea();
		r1.calcRound();
		System.out.println(r1.info());


		Rect r2 = new Rect(5, 7);
		r2.calcArea();
		r2.calcRound();
		System.out.println(r2.info());
		// ���� -- �̰� ���ΰ� -- �� �簢���� ���̴� -- �̰� �ѷ��� --�Դϴ�

		System.out.println();

		Circle c1 = new Circle();
		// �������� 4�� ���� ���̴� 48.xxx �̰� �ѷ��� 24.xxx�Դϴ�.
		c1.calcArea();
		c1.calcRound();
		System.out.println(c1.info());

		Circle c2 = new Circle(5);
		c2.calcArea();
		c2.calcRound();
		System.out.println(c2.info());

		// �������� --�� ���� ���̴� --�̰� �ѷ��� --�Դϴ�.
	}
}
