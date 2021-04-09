package com.interview.nine.bitwise.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.interview.nine.bitwise.BitwiseSolution;

class BitwiseSolutionTest {

	@Test
	void test() {
		int a [] = {1,2,3,4,5}; int b [] = {11,12,13,14,15};
		 Assertions.assertEquals(BitwiseSolution.encodeArray(a, b, 5), a);
	}

}
