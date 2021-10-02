package test;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class DequeueImplementationTest {

	@Test
	public void addLeftTest1() {
		DequeueImplementation queue1 = new DequeueImplementation(5);
		queue1.addLeft(10);
		queue1.addLeft(20);
		queue1.addLeft(30);
		queue1.addLeft(40);
		queue1.addLeft(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		int j = 0;
		while(j != queue1.array.length) {
			Assert.assertEquals(queue1.array[j],selfMade.get(j).intValue());
			j++;
		}
	}
	
	@Test
	public void addRightTest1() {
		DequeueImplementation queue1 = new DequeueImplementation(5);
		queue1.addRight(50);
		queue1.addRight(40);
		queue1.addRight(30);
		queue1.addRight(20);
		queue1.addRight(10);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		int j = 0;
		while(j != queue1.array.length) {
			Assert.assertEquals(queue1.array[j],selfMade.get(j).intValue());
			j++;
		}
	}

}
