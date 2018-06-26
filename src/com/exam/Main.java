package com.exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		Order m = new Order();
		FileInputStream fis;
		try {
			fis = new FileInputStream("menu.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line!=null) {
				String[] token = line.split(",");
				try {
					int id = Integer.parseInt(token[0]);
					String Food = token[1];
					int price = Integer.parseInt(token[2]);
					int kcal = Integer.parseInt(token[3]);
					m.orders.add(new InfoGet(id,Food,price,kcal));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				line = in.readLine();
			}
			m.on();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}