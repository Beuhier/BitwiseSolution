package com.interview.nine.bitwise;

import java.util.Arrays;

abstract class Bitwise{
	
	public static void main(String[] args){
		//testProgram();
	}
	
//	public static void testProgram() {
//		int a [] = {1,2,3,4,5}; int b [] = {11,12,13,14,15};
//		   System.out.println("Original Array A" + Arrays.toString(a));
//		   System.out.println("Original Array B" + Arrays.toString(b));
//		encodeArray(a, b, 5);
//	}
	
	static int encodeInteger(int x, int n){
		n = n<<(1<<(1<<(1<<1)));
		x = x | n;
		return x;
	}

	static int [] encodeArray(int [] A, int [] B, int n){
		for(int i=0;i<n;i++) {
    	    A[i] = encodeInteger(A[i], B[i]);
		}
	    //System.out.println("Encoded Array A" + Arrays.toString(A));
		return decodeArray(A,n);
	}
	
	static int[] decodeArray(int [] originalArray, int count_of_elements_in_array) {
		final int arrayDecoder = 0b00000000000000001111111111111111;
		int new_a[] = new int[count_of_elements_in_array], new_b[] = new int[count_of_elements_in_array] , a, select;
	    
		for(a = 0; a < count_of_elements_in_array; a++)
	    {
	    	select = originalArray[a];
	    	new_b[a] = select >> 16; 
	    	new_a[a] = select&arrayDecoder;
	    }
		
	   System.out.println("New Array A" + Arrays.toString(new_a));
	   System.out.println("New Array B" + Arrays.toString(new_b));
	   return new_a;
	}
	
}
