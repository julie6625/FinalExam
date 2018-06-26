package com.exam;

public class InfoGet {
	int id;
	String food;
	int price;
	int kcal;
	
	public InfoGet(int id, String food, int price, int kcal) {
		this.id = id;
		this.food = food;
		this.price = price;
		this.kcal = kcal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

}
