package test;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

import test.StackLinkedList.Node;

public class StackLinkedListTest {

	@Test
	public void pushTest1() {
		StackLinkedList stack1 = new StackLinkedList();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		selfMade.add(30);
		selfMade.add(40);
		selfMade.add(50);
		Node iterationNode = stack1.head;
		int j = selfMade.size()-1;
		while(iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(j).intValue());
			iterationNode = iterationNode.next;
			j--;
		}
	}
	
	@Test
	public void popTest1() {
		StackLinkedList stack1 = new StackLinkedList();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		stack1.pop();
		stack1.pop();
		stack1.pop();
		Node iterationNode = stack1.head;
		int j = selfMade.size()-1;
		while(iterationNode != null) {
			Assert.assertEquals(iterationNode.key,selfMade.get(j).intValue());
			iterationNode = iterationNode.next;
			j--;
		}
	}
	
	@Test
	public void topTest1() {
		StackLinkedList stack1 = new StackLinkedList();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		Node iterationNode = stack1.head;
		Assert.assertEquals(iterationNode.key, stack1.top());
	}
	
	@Test
	public void sizeTest1() {
		StackLinkedList stack1 = new StackLinkedList();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		Node iterationNode = stack1.head;
		int count = 0;
		while (iterationNode != null) {
			count++;
			iterationNode = iterationNode.next;
		}
		Assert.assertEquals(count, stack1.getSize());
	}

}
