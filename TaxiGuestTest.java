public class TaxiGuestTest {
	public static void main(String[] args) {
		
		Taxi t1 = new Taxi();
		
		int km = 20;
		t1.initPrice();
		int price = t1.calcPrice(km);
		System.out.println("���𿡼����� �������� " + price + "�� ���Դ�");
		System.out.println("��Ż : " + t1.totalPrice);
		t1.sumPrice();

		km = 20;
		t1.initPrice();
		price = t1.calcPrice(km);
		System.out.println("������������ ������� " + price + "�� ���Դ�");
		System.out.println("��Ż : " + t1.totalPrice);
		t1.sumPrice();
	}
}
