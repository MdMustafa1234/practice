package com;

public class SumOfArrayElement {
	public static void main(String[] args) {
		
		int[] array= {1,4,5,6,7,8};
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println(sum);
	}

}