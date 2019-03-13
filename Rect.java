/*
1. 가로 width 4, 세로 height 3
2. 넓이 calcArea()
   둘레 calcRound()
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
		return "가로가 " + this.width + "이고 세로가 " + this.height + "인 사각형의 넓이는 " + this.calcArea
							+ "이고 둘레는 " + this.calcRound + "입니다.";
	}
	
}
