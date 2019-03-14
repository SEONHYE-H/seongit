public class TaxiGuestTest {
	public static void main(String[] args) {
		
		Taxi t1 = new Taxi();
		
		int km = 20;
		t1.initPrice();
		int price = t1.calcPrice(km);
		System.out.println("구디에서부터 강남까지 " + price + "원 나왔다");
		System.out.println("토탈 : " + t1.totalPrice);
		t1.sumPrice();

		km = 20;
		t1.initPrice();
		price = t1.calcPrice(km);
		System.out.println("강남에서부터 구디까지 " + price + "원 나왔다");
		System.out.println("토탈 : " + t1.totalPrice);
		t1.sumPrice();
	}
}
