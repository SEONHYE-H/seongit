/*
1. ������ radius
2. ���� calcArea()
   �ѷ� calcRound()
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
		return "�������� " + this.radius + "�� ���� ���̴�" + this.calcArea + "�̰� �ѷ���" + this.calcRound + "�Դϴ�.";
	}
}
