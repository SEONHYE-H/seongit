/*
public class StarCraf {
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();
		System.out.println("�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
		// ��ü�� : 100   ��ü�� : 100
		int count = 2;

		System.out.println("\n���� ���� " + count + "ȸ ����!!!");
		my.attack();
		com.hp = com.hp + (my.at * count);
		System.out.println("�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
		//��ü�� : 100 ��ü�� : 80
		

		count = 4;
		com.attack();
		my.hp = my.hp + (com.at * count);
		System.out.println("\n���� ���� " + count + "ȸ ����!!!");
		System.out.println("�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
		// ��ü�� : 60 ��ü�� : 80


	
		my.changMode();	
		
		System.out.println("\n��庯��");
		//��带 �����ض�
		System.out.println("�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
		// ��ü�� : 35 ��ü�� : 80


		count = 3;
		my.attack();
		com.hp = com.hp + (my.at * count);
		System.out.println("\n���� ����" + count + "ȸ ����!!!");
		System.out.println("�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
		// ��ü�� : 35 ��ü�� : 35

		System.out.println("\n��庯��");
		my.changMode();

		//���! ��庯�� �Ұ�!!
		// ��ü�� : 35 ��ü�� : 35

		count = 3;
		my.attack();
		com.hp = com.hp + (my.at * count);
		System.out.println("\n���� ����" + count + "ȸ ����!!!");
		System.out.println("�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
		// ��ü�� : 35 ��ü�� : DIE
		// WIN
		
		if(my.hp <= 0){
			my.hp = 0;
			System.out.println("\n�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
			System.out.println("��");
		}else if(com.hp <= 0){
			com.hp = 0;
			System.out.println("\n�� ü�� : " + my.hp + "  |  ��ü�� : " + com.hp);
			System.out.println("�̱�");
			
		}
		
	}
}

*/

public class StarCraf {
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();

		System.out.println("�� ü�� : " + my.getStatus() + "  |  ��ü�� : " + com.getStatus());
		// ��ü�� : 100   ��ü�� : 100
		int count = 2;

		System.out.println("\n���� ���� " + count + "ȸ ����!!!");
		my.attack(com, count);
		System.out.println("�� ü�� : " + my.getStatus() + "  |  ��ü�� : " + com.getStatus());
		//��ü�� : 100 ��ü�� : 80
		

		count = 4;
		com.attack(my, count);
		System.out.println("\n���� ���� " + count + "ȸ ����!!!");
		System.out.println("�� ü�� : " + my.getStatus() + "  |  ��ü�� : " + com.getStatus());
		// ��ü�� : 60 ��ü�� : 80


	
		my.changeMode();	
		System.out.println("\n��庯��");
		//��带 �����ض�
		System.out.println("�� ü�� : " + my.getStatus() + "  |  ��ü�� : " + com.getStatus());
		// ��ü�� : 35 ��ü�� : 80


		count = 3;
		my.attack(com, count);
		System.out.println("\n���� ����" + count + "ȸ ����!!!");
		System.out.println("�� ü�� : " + my.getStatus() + "  |  ��ü�� : " + com.getStatus());
		// ��ü�� : 35 ��ü�� : 35

		System.out.println("\n��庯��");
		my.changeMode();

		//���! ��庯�� �Ұ�!!
		// ��ü�� : 35 ��ü�� : 35

		count = 3;
		my.attack(com, count);
		System.out.println("\n���� ����" + count + "ȸ ����!!!");
		System.out.println("�� ü�� : " + my.getStatus() + "  |  ��ü�� : " + com.getStatus());
		// ��ü�� : 35 ��ü�� : DIE
		// WIN
			
		}
		
}
