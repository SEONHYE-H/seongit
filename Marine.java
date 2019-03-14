/*
1. 체력 hp 기본100, 모드 ( 0 : 일반모드, 1 : 흥분 )
2. 공격 attack()
		1회 공격당 적체력 (0 : -10, 1 : -15) 
   모드변경 changeMode()
        내체력 -25;
		내체력 40이하일 경우는 변경 불가
*/

/* 내 풀이
public class Marine {
	int hp;
	int mode;
	int at;
	String d = "";
	//int mode;
	//int attack;

	public Marine(){
		hp = 100;
		mode = 0;
	}
	
	int attack(){
		if(mode == 0){
			at = -10;
		} else {
			at = -15;
		} return this.at;
	}

	void changMode(){
		if(hp >= 40){
			mode = 1;
			hp -= 25;
		}else{
			System.out.println("경고!모드변경불가");
		}
	}
}
*/

// 답

public class Marine {
	int hp;
	int mode;
	int power;
	
	public Marine(){
		hp = 100;
	}

	void attack(Marine enemy, int count){
		for(int i = 0 ; i < count ; i++)
			enemy.hp -= power;
	}

	void changeMode(){
		if(hp > 40){
			if(mode == 0){
				mode = 1;
				hp -= 25;
				power = 15;
			} else {
				mode = 0;
				power = 101;
			}
		}else {
			System.out.println("경고!모드변경 불가");
		}
	}

	String getStatus(){
		return hp < 0 ? "DIE" : hp + "";
	}

}