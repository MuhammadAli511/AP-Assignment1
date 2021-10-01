package test;

import org.junit.Assert;
import org.junit.Test;
public class ArrayInsertionTest {

	@Test
	// Works fine if complete array is not filled
	public void insertionTest1() {
		ArrayInsertion obj1 = new ArrayInsertion();
		int [] array = new int[5];
		int [] selfMade = new int[5];
		obj1.insert(array,10,0);
		obj1.insert(array,20,1);
		obj1.insert(array,30,2);
		obj1.insert(array,40,3);
		selfMade[0] = 10;
		selfMade[1] = 20;
		selfMade[2] = 30;
		selfMade[3] = 40;
		Assert.assertArrayEquals(selfMade, array);
	}

	@Test
	// Fails if complete array is filled
	public void insertionTest2() {
		ArrayInsertion obj1 = new ArrayInsertion();
		int [] array = new int[5];
		int [] selfMade = new int[5];
		obj1.insert(array,10,0);
		obj1.insert(array,20,1);
		obj1.insert(array,30,2);
		obj1.insert(array,40,3);
		obj1.insert(array,40,4);
		selfMade[0] = 10;
		selfMade[1] = 20;
		selfMade[2] = 30;
		selfMade[3] = 40;
		selfMade[4] = 40;
		Assert.assertArrayEquals(selfMade, array);
	}

}	
