package test;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import test.CircularLinkedList.Node;


public class CircularLinkedListTest {

	@Test
	public void pushFrontTest1() {
		CircularLinkedList list1 = new CircularLinkedList();
		list1.pushFront(10);
		list1.pushFront(20);
		list1.pushFront(30);
		list1.pushFront(40);
		list1.pushFront(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(50);
		selfMade.add(40);
		selfMade.add(30);
		selfMade.add(20);
		selfMade.add(10);
		Node iterationNode = list1.head;
		int i = 0;
		while (iterationNode.next != list1.head) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
		Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
	}
	
	@Test
	public void pushBackTest1() {
		CircularLinkedList list1 = new CircularLinkedList();
		list1.pushBack(10);
		list1.pushBack(20);
		list1.pushBack(30);
		list1.pushBack(40);
		list1.pushBack(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		Node iterationNode = list1.head;
		int i = 0;
		while (iterationNode.next != list1.head) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
		Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
	}

}
