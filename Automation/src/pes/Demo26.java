package pes;

import java.util.HashSet;

public class Demo26 {
	public static void main(String[] args) {
		// creating object of HashSet
		HashSet<String> hs = new HashSet<>();
		
		hs.add("a");
		hs.add("b");
		hs.add("b");
		hs.add(null);
		
		// To remove the data
		hs.remove(null);
		
		// to get the size
		int count = hs.size();
		System.out.println(count);
		
		// to print the data
		for(String s : hs) {
			System.out.println(s);
		}
	}
}
