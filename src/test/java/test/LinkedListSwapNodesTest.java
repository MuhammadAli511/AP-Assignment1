package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import test.LinkedListSwapNodes.Node;

public class LinkedListSwapNodesTest {

	@Test
	public void pushFrontTest1() {
		LinkedListSwapNodes list1 = new LinkedListSwapNodes();
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
		while (iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}
	
	@Test
	public void pushBackTest1() {
		LinkedListSwapNodes list1 = new LinkedListSwapNodes();
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
		while (iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}
	
	@Test
	public void swapTest1() {
		LinkedListSwapNodes list1 = new LinkedListSwapNodes();
		list1.pushBack(10);
		list1.pushBack(20);
		list1.pushBack(30);
		list1.pushBack(40);
		list1.pushBack(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(50);
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(10);
		list1.swap();
		Node iterationNode = list1.head;
		int i = 0;
		while (iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}

}
