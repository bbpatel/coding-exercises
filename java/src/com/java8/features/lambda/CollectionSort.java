package com.java8.features.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class CollectionSort {

	public void traditional(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		System.out.println(names);
	}

	public void lambda(List<String> names) {
		Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
		System.out.println(names);
	}

	public static void main(String[] args) {
		CollectionSort sortDemo = new CollectionSort();
		List<String> names = Arrays.asList("Shish", "Shekhar", "Marco", "Bhavik");
		// sorting with traditional comparator prior java 8
		sortDemo.traditional(names);
		sortDemo.lambda(names);
	}

}
