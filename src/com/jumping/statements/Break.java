package com.jumping.statements;

public class Break {

	public static void main(String[] args) {
		// i=1, i=2, i=3
				for (int i = 1; i <= 5; i++) { // 1<=5-T,2<=5-T,3<=5-T

					if (i == 3) { // 1==3-F, 2==3-F, 3==3-T(equal means same)
						break; // jvm will read this line
					}
					System.out.println(i); // 1 2
				}
				//System.out.println("jvm control");
	}

}
