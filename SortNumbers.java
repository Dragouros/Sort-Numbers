package com.Luigi;

import java.util.ArrayList;

public class SortNumbers {

	SortNumbers(){
	}
	
	public void Sort(ArrayList<Integer> Numbers) {
		System.out.println("Array before sorting: " + Numbers);
		for(int i = 0; i < Numbers.size(); i++) { //Check each element of the array
			for(int j = 0; j < Numbers.size() - 1 - i; j++) { //Check each element of the array except for himself
				if(Numbers.get(j) > Numbers.get(j + 1)){ //Check if the first element is bigger than the next element
					int Temp = Numbers.get(j); //Lines 15, 16 and 17 swap the elements
					Numbers.set(j, Numbers.get(j + 1));
					Numbers.set(j + 1, Temp);
				}
			}	
		}
		System.out.println("Array after sorting: " + Numbers);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> Count = new ArrayList<Integer>() {{
		add(2);
		add(5);
		add(8);
		add(7);
		add(3);
		add(5);
		add(6);
		add(2);
		add(2);
		add(9);
		}};
	    SortNumbers MyAnalyze = new SortNumbers();
	    MyAnalyze.Sort(Count);
	}
}