package org.array;

public class Sample {
	public static void main(String[] args) {
		// dataType VariableName[] = new dataType [length];
		int a[] = new int[15];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 100;
		a[7] = 202;
		a[12] = 30;
		a[14] = 410;
		System.out.println(a[3]);
		// to get length of array
		int length = a.length;
		System.out.println(length);

		System.out.println("=====");
		// normal for
		for (int i = 11; i < 14; i++) {
			System.out.println(a[i]);

			System.out.println("=====");
	   // for each
			for (int j : a) {
				System.out.println(j);
				
			}

		}

	}
}
