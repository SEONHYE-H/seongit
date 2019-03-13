/*
1. 반지름 radius
2. 넓이 calcArea()
   둘레 calcRound()
*/
public class Circle {
	int radius;
	double calcArea;
	double calcRound;

	public Circle(){
		this(4);
	}

	public Circle(int radius){
		this.radius = radius;
	}

	void calcArea(){
		this.calcArea = 3.14 * radius * radius;
	}
	double calcArea(int radius){
		this.calcArea = 3.14 * radius * radius;
		return this.calcArea;
	}
	

	void calcRound(){
		this.calcRound = 2 * 3.14 * radius;
	}
	double calcRound(int radius){
		this.calcRound = 2 * 3.14 * radius;
		return this.calcRound;
	}


	String info(){
		return "반지름이 " + this.radius + "인 원의 넓이는" + this.calcArea + "이고 둘레는" + this.calcRound + "입니다.";
	}
}
