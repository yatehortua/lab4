
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void testadd() {
	MyLinkedList<Integer> test = new MyLinkedList<Integer>();
	LinkedList<Integer> real = new LinkedList<Integer>();
	test.add(0);
	real.add(0);
	test.add(5);
	real.add(5);
	assertEquals(real.size(), test.size());
	assertEquals(real.get(1), test.get(1));
	assertEquals(real.get(0), test.get(0));
    }

    @Test
    public void testAdd() {
	MyLinkedList<Integer> test = new MyLinkedList<Integer>();
	LinkedList<Integer> real = new LinkedList<Integer>();
	test.add(0);
	real.add(0);
	test.add(5);
	real.add(5);
	assertEquals(real.get(0), test.get(0));
	assertEquals(real.get(1), test.get(1));
	test.add(1, 2);
	real.add(1, 2);
	assertEquals(real.size(), test.size());
	assertEquals(real.get(0), test.get(0));
	assertEquals(real.get(1), test.get(1));
	assertEquals(real.get(2), test.get(2));

    }

    @Test
    public void testGet() {
	MyLinkedList<Integer> test = new MyLinkedList<Integer>();
	LinkedList<Integer> real = new LinkedList<Integer>();
	test.add(0);
	real.add(0);
	test.add(5);
	real.add(5);
	test.add(1, 2);
	real.add(1, 2);
	assertEquals(real.size(), test.size());
	assertEquals(real.get(0), test.get(0));
	assertEquals(real.get(1), test.get(1));
	assertEquals(real.get(2), test.get(2));
    }

    @Test
    public void testset() {
	MyLinkedList<Integer> test = new MyLinkedList<Integer>();
	LinkedList<Integer> real = new LinkedList<Integer>();
	test.add(0);
	real.add(0);
	test.add(2);
	real.add(2);
	test.add(5);
	real.add(5);
	test.set(1, 3);
	real.set(1, 3);
	assertEquals(real.size(), test.size());
	assertEquals(real.get(0), test.get(0));
	assertEquals(real.get(1), test.get(1));
	assertEquals(real.get(2), test.get(2));
    }

    @Test
    public void testremove() {
	MyLinkedList<Integer> test = new MyLinkedList<Integer>();
	LinkedList<Integer> real = new LinkedList<Integer>();
	test.add(0);
	real.add(0);
	test.add(2);
	real.add(2);
	test.add(5);
	real.add(5);
	test.remove(1);
	real.remove(1);
	assertEquals(real.size(), test.size());
	assertEquals(real.get(0), test.get(0));
	assertEquals(real.get(1), test.get(1));
	assertEquals(real.get(2), test.get(2));
    }

}