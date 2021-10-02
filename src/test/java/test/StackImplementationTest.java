package test;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

import test.StackLinkedList.Node;

public class StackImplementationTest {

	@Test
	public void pushTest1() throws Exception{
		StackImplementation stack1 = new StackImplementation(5);
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
		int j = 0;
		while(j != stack1.topPointer) {
			Assert.assertEquals(stack1.arraytostoreStack[j],selfMade.get(j).intValue());
			j++;
		}
	}
	
	@Test
	public void popTest1() throws Exception{
		StackImplementation stack1 = new StackImplementation(5);
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		stack1.push(50);
		stack1.pop();
		stack1.pop();
		stack1.pop();
		List<Integer> selfMade = new ArrayList<Integer>();
		selfMade.add(10);
		selfMade.add(20);
		int j = 0;
		while(j != stack1.topPointer) {
			Assert.assertEquals(stack1.arraytostoreStack[j],selfMade.get(j).intValue());
			j++;
		}
	}
	
	@Test
	public void topTest1() throws Exception{
		StackImplementation stack1 = new StackImplementation(3);
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		int j = stack1.topPointer;
		Assert.assertEquals(stack1.arraytostoreStack[j], stack1.top());
	}
	
	@Test
	public void sizeTest1()  throws Exception{
		StackImplementation stack1 = new StackImplementation(3);
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		Assert.assertEquals(3, stack1.size());
	}

}
