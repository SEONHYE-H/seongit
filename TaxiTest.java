/*
1. ���
	�⺻���(basicPrice)
	  �Ϲ�: 3800 �ɾ� : 5000
	�����(totalPrice)
	���(price)
	  �Ϲ� : 100/km
	  �ɾ� : 150/km
2. ��ݰ��(calcPrice())
3. �ɾ����� : 0�� ~ 6��
*/
import java.util.*;

public class TaxiTest extends Car{

	int basicPrice;
	int price;
	int totalPrice;

	int pl;

	public TaxiTest(){}

	public TaxiTest(String carName, String color, String maker){
		super(carName, color, maker);
	}

	void initPrice(){
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour >= 0 && hour <= 6){
			basicPrice = 5000;
			pl = 150;
		}else{
			basicPrice = 3800;
			pl = 100;
		}
	}

	int calcPrice(int km){
		price = basicPrice + (km * pl);
		return price;
	}

	void sumPrice(){
		totalPrice += price;
		price = 0;
		basicPrice = 0;
	}
}
