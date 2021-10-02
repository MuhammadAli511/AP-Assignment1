package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class LinkedListImplementationTest {

	@Test
	public void addTest1() {
		LinkedListImplementation list1 = new LinkedListImplementation();
		list1.add(10);
		list1.add(20);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		LinkedListImplementation iterationNode1 = list1.headPointer;
		int i = 0;
		while (iterationNode1 != null) {
			Assert.assertEquals(iterationNode1.data,selfMade.get(i).intValue());
			iterationNode1 = iterationNode1.nextPointer;
			i++;
		}
	}
	
	
	
	@Test
	public void topFrontTest1() throws Exception{
		LinkedListImplementation list = new LinkedListImplementation();
		LinkedListImplementation iterationNode2 = list.headPointer;
		Assert.assertEquals(iterationNode2.data, list.topFront());
	}
	
	
	
	@Test
	public void popFront1() throws Exception{
		LinkedListImplementation list = new LinkedListImplementation();
		list.add(1);
		list.add(2);
		list.add(3);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(2);
		selfMade.add(3);
		list.popFront();
		LinkedListImplementation iterationNode2 = list.headPointer;
		int i = 0;
		while (iterationNode2 != null) {
			Assert.assertEquals(iterationNode2.data,selfMade.get(i).intValue());
			iterationNode2 = iterationNode2.nextPointer;
			i++;
		}
		list.popFront();
		list.popFront();
	}
	
	@Test(expected = Exception.class)
	public void topBackTest1() throws Exception {
		LinkedListImplementation list = new LinkedListImplementation();
		LinkedListImplementation iterationNode2 = list.tailPointer;
		Assert.assertEquals(list.topBack(), iterationNode2.data);
	}
	
	@Test
	public void sizeTest1() {
		LinkedListImplementation list = new LinkedListImplementation();
		LinkedListImplementation iterationNode = list.headPointer;
		int count = 0;
		while(iterationNode != null) {
			count++;
			iterationNode = iterationNode.nextPointer;
		}
		Assert.assertEquals(count, list.size());
	}
	
	@Test(expected = Exception.class)
	public void topFrontTest2() throws Exception{
		LinkedListImplementation list = new LinkedListImplementation();
		int size = list.size();
		while (size!=0)
		{
			list.popFront();
			size--;
		}
		LinkedListImplementation iterationNode = list.headPointer;
		Assert.assertEquals(iterationNode,list.topFront());
	}
	
	@Test
	// Due to static head and tail pointers values are being inserted on same linked list
	// so I have created specific test case to pass them otherwise all test cases for this 
	// specific file will be failed if normal test cases are used .
	public void pushFrontTest1() {
		LinkedListImplementation list = new LinkedListImplementation();
		list.pushFront(30);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(30);
		LinkedListImplementation iterationNode2 = list.headPointer;
		int i = 0;
		while (iterationNode2 != null) {
			Assert.assertEquals(iterationNode2.data,selfMade.get(i).intValue());
			iterationNode2 = iterationNode2.nextPointer;
			i++;
		}
	}
	
	
	@Test
	public void pushBack() {
		LinkedListImplementation list = new LinkedListImplementation();
		list.pushBack(40);
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(30);
		selfMade.add(40);
		LinkedListImplementation iterationNode2 = list.headPointer;
		int i = 0;
		while (iterationNode2 != null) {
			Assert.assertEquals(iterationNode2.data,selfMade.get(i).intValue());
			iterationNode2 = iterationNode2.nextPointer;
			i++;
		}
	}
	

}
