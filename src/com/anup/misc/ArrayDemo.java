package com.anup.misc;

public class ArrayDemo {

	//Decleration
	static int[] marks;
	static int val;

	public static void main(String[] args) {
		
		//int val = 100;
		int marks1, marks2, marks3;
		
		
		marks = new int[5];
		marks[0]=55;
		marks[1]=66;
		marks[2]=77;
		marks[3]=88;
		
		
		//int[] marks; 
		
		System.out.println("Value: "+ val);
		System.out.println("Marks: "+marks);
		
		float[] appraisalRatings = {3.75f, 4.7f, 4.9f, 3.8f};
		System.out.println(appraisalRatings[2]);
		
		float[] appraisalRating = new float[4];
		appraisalRating[0] = 3.75f;
		appraisalRating[1] = 4.7f;
		appraisalRating[2] = 4.9f;
		appraisalRating[3] = 3.8f;
		
		
		
		
	}

}
