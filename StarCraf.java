/*
public class StarCraf {
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();
		System.out.println("내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
		// 내체력 : 100   적체력 : 100
		int count = 2;

		System.out.println("\n내가 적을 " + count + "회 공격!!!");
		my.attack();
		com.hp = com.hp + (my.at * count);
		System.out.println("내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
		//내체력 : 100 적체력 : 80
		

		count = 4;
		com.attack();
		my.hp = my.hp + (com.at * count);
		System.out.println("\n적이 나를 " + count + "회 공격!!!");
		System.out.println("내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
		// 내체력 : 60 적체력 : 80


	
		my.changMode();	
		
		System.out.println("\n모드변경");
		//모드를 변경해라
		System.out.println("내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
		// 내체력 : 35 적체력 : 80


		count = 3;
		my.attack();
		com.hp = com.hp + (my.at * count);
		System.out.println("\n내가 적을" + count + "회 공격!!!");
		System.out.println("내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
		// 내체력 : 35 적체력 : 35

		System.out.println("\n모드변경");
		my.changMode();

		//경고! 모드변경 불가!!
		// 내체력 : 35 적체력 : 35

		count = 3;
		my.attack();
		com.hp = com.hp + (my.at * count);
		System.out.println("\n내가 적을" + count + "회 공격!!!");
		System.out.println("내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
		// 내체력 : 35 적체력 : DIE
		// WIN
		
		if(my.hp <= 0){
			my.hp = 0;
			System.out.println("\n내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
			System.out.println("짐");
		}else if(com.hp <= 0){
			com.hp = 0;
			System.out.println("\n내 체력 : " + my.hp + "  |  적체력 : " + com.hp);
			System.out.println("이김");
			
		}
		
	}
}

*/

public class StarCraf {
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();

		System.out.println("내 체력 : " + my.getStatus() + "  |  적체력 : " + com.getStatus());
		// 내체력 : 100   적체력 : 100
		int count = 2;

		System.out.println("\n내가 적을 " + count + "회 공격!!!");
		my.attack(com, count);
		System.out.println("내 체력 : " + my.getStatus() + "  |  적체력 : " + com.getStatus());
		//내체력 : 100 적체력 : 80
		

		count = 4;
		com.attack(my, count);
		System.out.println("\n적이 나를 " + count + "회 공격!!!");
		System.out.println("내 체력 : " + my.getStatus() + "  |  적체력 : " + com.getStatus());
		// 내체력 : 60 적체력 : 80


	
		my.changeMode();	
		System.out.println("\n모드변경");
		//모드를 변경해라
		System.out.println("내 체력 : " + my.getStatus() + "  |  적체력 : " + com.getStatus());
		// 내체력 : 35 적체력 : 80


		count = 3;
		my.attack(com, count);
		System.out.println("\n내가 적을" + count + "회 공격!!!");
		System.out.println("내 체력 : " + my.getStatus() + "  |  적체력 : " + com.getStatus());
		// 내체력 : 35 적체력 : 35

		System.out.println("\n모드변경");
		my.changeMode();

		//경고! 모드변경 불가!!
		// 내체력 : 35 적체력 : 35

		count = 3;
		my.attack(com, count);
		System.out.println("\n내가 적을" + count + "회 공격!!!");
		System.out.println("내 체력 : " + my.getStatus() + "  |  적체력 : " + com.getStatus());
		// 내체력 : 35 적체력 : DIE
		// WIN
			
		}
		
}
