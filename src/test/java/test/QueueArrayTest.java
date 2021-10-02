package test;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;


public class QueueArrayTest {

	@Test
	public void enqueueTest1() {
		QueueArray queue1 = new QueueArray(5);
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		int i = queue1.removePointer;
		int j = 0;
		while(i != queue1.addPointer - 1) {
			Assert.assertEquals(queue1.array[i],selfMade.get(j).intValue());
			i++;
			j++;
		}
	}
	@Test
	public void enqueueTest2() {
		QueueArray queue1 = new QueueArray(5);
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		queue1.dequeue();
		queue1.enqueue(60);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(60);
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		
		int j = 0;
		while(j != queue1.array.length-1) {
			Assert.assertEquals(queue1.array[j],selfMade.get(j).intValue());
			j++;
		}
		
	}
	
	@Test
	public void dequeueTest1() {
		QueueArray queue1 = new QueueArray(5);
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.enqueue(10);
		System.out.println(queue1.removePointer);
		System.out.println(queue1.addPointer);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		int i = queue1.removePointer;
		int j = 0;
		Assert.assertEquals(queue1.array[i],selfMade.get(0).intValue());
	}

}
