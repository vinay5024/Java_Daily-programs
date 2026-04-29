package Batch71;

import java.util.*;

public class Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, -1, 7, 3, -9, -4 };
		List<Integer> l = new ArrayList<>();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int x : arr) {
			l.add(x);
		}
		System.out.println(l);
		for (int i : arr) {
			if (i > 0) {
				a.add(i);
			}
		}

		for (int i : arr) {
			if (i < 0) {
				b.add(i);
			}
		}

		for (int i = 0; i < b.size(); i++) {

			System.out.println(a.get(i) + ":" + b.get(i));

		}

	}

}
