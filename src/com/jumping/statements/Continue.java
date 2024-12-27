package com.jumping.statements;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i=1, i=2, i=3, i=4, i=5
				for (int i = 1; i <= 5; i++) { // 1<=5-T,2<=5-T,3<=5-T
		                                       //4<=5-T, 5<=5-T
					if (i == 3) { // 1==3-F, 2==3-F, 3==3-T(equal means same)
								  // 4==3-F , 5==3-F
						continue; // jvm will read this line
					}
					System.out.println(i); // 1 2 4 5
				}
				//System.out.println("jvm control");

	}

}
