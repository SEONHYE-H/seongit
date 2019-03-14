/*
1. 요금
	기본요금(basicPrice)
	  일반: 3800 심야 : 5000
	요금합(totalPrice)
	요금(price)
	  일반 : 100/km
	  심야 : 150/km
2. 요금계산(calcPrice())
3. 심야할증 : 0시 ~ 6시
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
