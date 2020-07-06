package com.july3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = new ArrayList<>();
		myList.add(0, 0);
		myList.add(1, 1);
		myList.add(2, 2);
		myList.add(3, 3);
		myList.add(4, 4);
		myList.add(5, 5);
		myList.add(6, 6);
		myList.add(7, 7);
		myList.add(8, 8);
		myList.add(9, 9);
		myList.add(10, 10);
		/*
		Iterator<Integer> itr = myList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());*/
		System.out.println(myList);
		for(int i = 0; i<=11; i++) {
			if(myList.contains(100))
			{
				System.out.println("true");
			}else
				System.out.println("false");
		}
		
		System.out.println(myList.contains(110));
	}

}
