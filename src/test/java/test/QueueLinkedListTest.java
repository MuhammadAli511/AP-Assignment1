package test;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

import test.QueueLinkedList.Node;

public class QueueLinkedListTest {

	@Test
	public void enqueueTest1() {
		QueueLinkedList queue1 = new QueueLinkedList();
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
		Node iterationNode = queue1.head;
		int i = 0;
		while(iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}
	
	@Test
	public void dequeueTest1() {
		QueueLinkedList queue1 = new QueueLinkedList();
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		queue1.dequeue();
		queue1.dequeue();
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		Node iterationNode = queue1.head;
		int i = 0;
		while(iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}

}
