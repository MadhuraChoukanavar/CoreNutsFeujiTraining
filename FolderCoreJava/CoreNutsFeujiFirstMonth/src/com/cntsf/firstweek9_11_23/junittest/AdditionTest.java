package com.cntsf.firstweek9_11_23.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AdditionTest {

		@ParameterizedTest
	    @ValueSource(ints = { 2, 3, 4, 5 })
	    public void testAddition( int value) {
	        // Given
	        int a = 5;
	        //int b = 7;
	        
	        // When
	        int result = add(a, value);
	        
	        // Then
	        int expectedResult = 8;
	        assertEquals("Working ",expectedResult, result);
	    }

	    // Addition method to be tested
	    public int add(int a, int b) {
	        return a + b;
	    }

}
