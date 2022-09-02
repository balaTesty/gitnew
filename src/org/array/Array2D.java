package org.array;

public class Array2D {
	public static void main(String[] args) {
		//dataType VariableName[][] = new dataType[][];
		String a[][] = new String [2][2];
		a[0][0] ="mano1";
		a[0][1] ="deva2";
		a[1][0] ="raki3";
		a[1][1] ="jack1";
		System.out.println(a[1][1]);
		int length = a.length;
		System.out.println(length);
		System.out.println("%%%%%%");
		// nested for 
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
			
		}
		System.out.println("#######");
		// nested for each
		for (String[] er : a) {
			for (String i : er) {
				System.out.println(i);
				
			}
			
		}

	}

}
