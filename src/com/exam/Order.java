package com.exam;
import java.util.*;

import com.exam.InfoGet;

public class Order {
	int total = 0;
	int ktotal = 0;
	List<String> list  = new ArrayList<>();
	List<Integer> list2  = new ArrayList<>();
	List<InfoGet> orders = new ArrayList<>();
	int id = 0;
	int price = 0;
	int kcal = 0;
	String food = null;
	


	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	
	public void on(){
		for (int i = 0; i < orders.size(); i++) {
			InfoGet order = orders.get(i);
			System.out.println(order.getId() + ") " + order.getFood());

		}
		System.out.println("0) 結算");
		System.out.println("q) 結束(離開程式)");
		

		

		boolean big = true;
		boolean s1 = true;
		boolean s2 = false;
		while(big){
				System.out.print("請輸入餐點號碼或輸入0以結算:");
				Scanner sc1 = new Scanner(System.in);
				int foodname = sc1.nextInt();
				for(int i=0;i<orders.size();i++) {
					InfoGet c = orders.get(i);
					if(foodname == c.getId()) {
						id = c.getId();
						price = c.getPrice();
						kcal = c.getKcal();
						food = c.getFood();
						break;
					}
				}
			while(s1){
				

				switch(foodname){
				case 1:
					list.add(food);
					s1 = false;
					s2 = true;
					break;
				case 2:
					list.add(food);
					s1 = false;
					s2 = true;
					break;
				case 3:
					list.add(food);
					s1 = false;
					s2 = true;
					break;
				case 4:
					list.add(food);
					s1 = false;
					s2 = true;
					break;
				case 5:
					list.add(food);
					s1 = false;
					s2 = true;
					break;
				case 7:
					list.add(food);
					s1 = false;
					s2 = true;
					break;

				case 0:
					s1= false;
					
					break;
				}
				
			}
			
			while(s2){
				System.out.print("請輸入數量:");
				Scanner sc2 = new Scanner(System.in);
				int number = sc2.nextInt();
				list2.add(number);
				total = number*price;
				ktotal = number*kcal;
				s2 = false;
				s1 = true;
					
			}
			if(foodname == 0){
				System.out.println(list+"數量分別是:"+list2);
				System.out.println("總金額:"+total);
				if(ktotal>1200){
					System.out.println("高熱量餐點");
				}
				Scanner sc3 = new Scanner(System.in);
				String a = sc3.nextLine();
				if(a == ""){
					s1 =true;
				}
			}else if(String.valueOf(foodname) == "q"){
				big =false;
				
			}
		}	
	}
}
