package com.Luigi;

import java.util.*;

public class SortNumbers2 {
	
	SortNumbers2() {
	}

	public static int SmallestNumber(ArrayList<Integer> Numbers) {
		
		int Smallest = Numbers.get(0);
		for(int j = 1; j < Numbers.size(); j++) {
			if(Numbers.get(j) < Smallest) {
				Smallest = Numbers.get(j);
			}
		}
		return Smallest;
//		Numbers.remove(OrderList.get(OrderList.size()-1));
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> OrderList = new ArrayList<Integer>();
		ArrayList<Integer> Count = new ArrayList<Integer>() {{
		add(36);
		add(22);
		add(1);
		add(37);
		add(12);
		add(13);
		add(29);
		add(17);
		add(27);
		add(10);
		add(20);
		add(30);
		add(7);
		add(9);
		add(17);
		add(31);
		add(33);
		add(38);
		add(23);
		add(24);
		add(15);
		}};
	    SortNumbers2 MyAnalyze = new SortNumbers2();
	    MyAnalyze.SmallestNumber(Count);
	    while(Count.size() > 0) {
	    	OrderList.add(MyAnalyze.SmallestNumber(Count));
	    	Count.remove(OrderList.get(OrderList.size()-1));
	    }
	    System.out.println(OrderList);
	}
}
