package test;

import org.junit.Assert;
import org.junit.Test;
public class ArrayDeletionTest {

	@Test
	public void deletionTest1() {
		ArrayDeletion obj1 = new ArrayDeletion();
		int [] array = new int[5];
		int[] selfMade = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		obj1.delete(array,3);
		selfMade[0] = 10;
		selfMade[1] = 20;
		selfMade[2] = 30;
		selfMade[3] = 50;
		selfMade[4] = -1;
		Assert.assertArrayEquals(selfMade, array);
	}

}	
