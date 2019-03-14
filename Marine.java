/*
1. ü�� hp �⺻100, ��� ( 0 : �Ϲݸ��, 1 : ��� )
2. ���� attack()
		1ȸ ���ݴ� ��ü�� (0 : -10, 1 : -15) 
   ��庯�� changeMode()
        ��ü�� -25;
		��ü�� 40������ ���� ���� �Ұ�
*/

/* �� Ǯ��
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
			System.out.println("���!��庯��Ұ�");
		}
	}
}
*/

// ��

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
			System.out.println("���!��庯�� �Ұ�");
		}
	}

	String getStatus(){
		return hp < 0 ? "DIE" : hp + "";
	}

}