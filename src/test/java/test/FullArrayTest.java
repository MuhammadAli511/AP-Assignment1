package test;

import org.junit.Assert;
import org.junit.Test;

public class FullArrayTest {

	@Test
	// Inserting values in array with increasing index
	public void insertTest1() {
		Array arr = new Array();
		int[] selfMade = new int[100];
		arr.insert(10, 0);
		arr.insert(20, 1);
		arr.insert(30, 2);
		arr.insert(40, 3);
		arr.insert(50, 4);
		selfMade[0] = 10;
		selfMade[1] = 20;
		selfMade[2] = 30;
		selfMade[3] = 40;
		selfMade[4] = 50;
		Assert.assertArrayEquals(selfMade, arr.array);
	}

	// Changing order of insertion for indexes
	@Test
	public void insertTest2() {
		Array arr = new Array();
		int[] selfMade = new int[100];
		arr.insert(10, 0);
		arr.insert(20, 1);
		arr.insert(30, 2);
		arr.insert(40, 4);
		arr.insert(50, 3);
		selfMade[0] = 10;
		selfMade[1] = 20;
		selfMade[2] = 30;
		selfMade[4] = 40;
		selfMade[3] = 50;
		Assert.assertArrayEquals(selfMade, arr.array);
	}

	// Deleting element from array reverses one location back but does not
	// erase last element
	@Test
	public void deleteTest1() {
		Array arr = new Array();
		int[] selfMade = new int[100];
		arr.insert(10, 0);
		arr.insert(20, 1);
		arr.insert(30, 2);
		selfMade[0] = 10;
		selfMade[1] = 30;
		arr.delete(1);
		Assert.assertArrayEquals(selfMade, arr.array);
	}

	// Giving number which is available in array
	@Test
	public void linearSearchTest1() {
		Array arr = new Array();
		arr.insert(10, 0);
		arr.insert(20, 1);
		arr.insert(30, 2);
		arr.insert(40, 3);
		arr.insert(50, 4);
		Assert.assertTrue(arr.linearSearch(30));
	}

	// Giving number which is not available in array
	@Test
	public void linearSearchTest2() {
		Array arr = new Array();
		arr.insert(10, 0);
		arr.insert(20, 1);
		arr.insert(30, 2);
		arr.insert(40, 3);
		arr.insert(50, 4);
		Assert.assertFalse(arr.linearSearch(60));
	}

	// Simple bubble sort
	@Test
	public void bubbleSortTest1() {
		Array arr = new Array();
		int[] selfMade = new int[100];
		arr.insert(30, 0);
		arr.insert(10, 1);
		arr.insert(40, 2);
		arr.insert(50, 3);
		arr.insert(20, 4);
		selfMade[0] = 10;
		selfMade[1] = 20;
		selfMade[2] = 30;
		selfMade[3] = 40;
		selfMade[4] = 50;
		arr.bubbleSort();
		arr.display();
		Assert.assertArrayEquals(selfMade, arr.array);
	}

	// Searching first value with increasing values in array
	@Test
	public void binarySearchTest1() {
		Array arr = new Array();
		arr.insert(10, 0);
		arr.insert(20, 1);
		arr.insert(30, 2);
		arr.insert(40, 3);
		arr.insert(50, 4);
		Assert.assertTrue(arr.binarySearch(10, 0, 4));
	}

	// Searching first value with decreasing values in array
	@Test
	public void binarySearchTest2() {
		Array arr = new Array();
		arr.insert(50, 0);
		arr.insert(40, 1);
		arr.insert(30, 2);
		arr.insert(20, 3);
		arr.insert(10, 4);
		Assert.assertTrue(arr.binarySearch(50, 0, 4));
	}

}
