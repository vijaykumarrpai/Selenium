package pes;

import java.util.ArrayList;
import java.util.List;

public class Demo9 {
	public static void main(String[] args) {
		// creating object of ArrayList
		List<String> a1 = new ArrayList<>();
		
		// To add data to ArrayList
		a1.add("a");
		a1.add("b");
		a1.add("b");
		a1.add(null);
		
		// To get the size of the ArrayList
		int n = a1.size();
		System.out.println(n);
		
		// To print ArrayList
		for(int i = 0; i < n; i++) {
			String s = a1.get(i);
			System.out.println(s);
		}
	}

}
