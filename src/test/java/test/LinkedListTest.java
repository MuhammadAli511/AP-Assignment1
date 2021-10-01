package test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

import test.LinkedList.Node;


public class LinkedListTest {

	@Test
	public void pushFrontTest1() {
		LinkedList list1 = new LinkedList();
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
		LinkedList list1 = new LinkedList();
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
	public void popFrontTest1() {
		LinkedList list1 = new LinkedList();
		list1.pushBack(10);
		list1.pushBack(20);
		list1.pushBack(30);
		list1.pushBack(40);
		list1.pushBack(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		list1.popFront();
		Node iterationNode = list1.head;
		int i = 0;
		while (iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}
	@Test
	public void popBackTest1() {
		LinkedList list1 = new LinkedList();
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
		list1.popBack();
		Node iterationNode = list1.head;
		int i = 0;
		while (iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}
	
	@Test
	public void popTest1() {
		LinkedList list1 = new LinkedList();
		list1.pushBack(10);
		list1.pushBack(20);
		list1.pushBack(30);
		list1.pushBack(40);
		list1.pushBack(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		selfMade.add(40);
		selfMade.add(50);
		list1.pop(2);
		Node iterationNode = list1.head;
		int i = 0;
		while (iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(i).intValue());
			iterationNode = iterationNode.next;
			i++;
		}
	}
}