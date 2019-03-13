public class DohyungTest {
	public static void main(String[] args) {
		


		Rect r1= new Rect();
		// 가로가 4이고 세로가 3인 사각형의 넓이는 12이고 둘레는 14입니다
		r1.calcArea();
		r1.calcRound();
		System.out.println(r1.info());


		Rect r2 = new Rect(5, 7);
		r2.calcArea();
		r2.calcRound();
		System.out.println(r2.info());
		// 가로 -- 이고 세로가 -- 인 사각형의 넓이는 -- 이고 둘레가 --입니다

		System.out.println();

		Circle c1 = new Circle();
		// 반지름이 4인 원의 넓이는 48.xxx 이고 둘레는 24.xxx입니다.
		c1.calcArea();
		c1.calcRound();
		System.out.println(c1.info());

		Circle c2 = new Circle(5);
		c2.calcArea();
		c2.calcRound();
		System.out.println(c2.info());

		// 반지름이 --인 원의 넓이는 --이고 둘레는 --입니다.
	}
}
