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
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		selfMade.add(30);
		Node test = list1.head;
		test.key = 1;
	}

}
