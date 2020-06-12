package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilsTest {

	@Test
	public void test() {
		MathUtils  mathUtils=new MathUtils();
		int ex=12;
		int ac=mathUtils.add(1, 1);
		assertEquals(ex, ac);
	}

}
