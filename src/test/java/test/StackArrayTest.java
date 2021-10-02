package test;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class StackArrayTest {

	@Test
	public void pushTest1() {
		StackArray stack1 = new StackArray();
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
		while(j != stack1.addPointer) {
			Assert.assertEquals(stack1.array[j],selfMade.get(j).intValue());
			j++;
		}
	}
	
	@Test
	public void popTest1() {
		StackArray stack1 = new StackArray();
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
		int j = 0;
		while(j != stack1.addPointer) {
			Assert.assertEquals(stack1.array[j],selfMade.get(j).intValue());
			j++;
		}
	}

}
