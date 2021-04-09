package com.interview.nine.bitwise;

public class BitwiseSolution{
	
	public static void main(String[] args){
		
	}

	public static int [] encodeArray(int [] A, int [] B, int n){
		for(int i=0;i<n;i++) {
    	    A[i] = encodeInteger(A[i], B[i]);
		}
	
		return decodeArray(A,n);
	}
	
	static int encodeInteger(int x, int n){
		n = n<<(1<<(1<<(1<<1)));
		x = x | n;
		return x;
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
	   return new_a;
	}
	
}
