/*
1. ���� width 4, ���� height 3
2. ���� calcArea()
   �ѷ� calcRound()
*/
public class Rect {
	int width;
	int height;
	int calcArea;
	int calcRound;
	
	
	
	public Rect(){
		this(4, 3);
	}
	
	public Rect(int width, int height){
		this.width = width;
		this.height = height;
	}


	void calcArea(){
		this.calcArea = (width * height);
	}

	int calcArea(int width, int height){
		this.calcArea = (width * height);
		return this.calcArea;
	}
	
	void calcRound(){
		this.calcRound = (width + height) * 2;
	}

	int calcRound(int width, int height){
		this.calcRound = (width + height) * 2;
		return this.calcRound;
	}
	
	String info(){
		return "���ΰ� " + this.width + "�̰� ���ΰ� " + this.height + "�� �簢���� ���̴� " + this.calcArea
							+ "�̰� �ѷ��� " + this.calcRound + "�Դϴ�.";
	}
	
}
