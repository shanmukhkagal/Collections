import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Hp
 *
 */
public class LinkedListTest {

	@Test
	public void GivenLinkedListTest() {
		Node<Integer> firstNode = new Node <~>(key: 56);
		Node<Integer> secondNode = new Node <Integer>(key: 30);
		Node<Integer> thirdNode = new Node <~>(key: 70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean res = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(res);
		}
	
	@Test
	public void GivenLinkedListTestAddedOnTop() {
		Node<Integer> firstNode = new Node <~>(key: 56);
		Node<Integer> secondNode = new Node <~>(key: 30);
		Node<Integer> thirdNode = new Node <~>(key: 70);
		LinkedList linkedlist = new LinkedList();
		LinkedList.add(firstNode);
		LinkedList.add(secondNode);
		LinkedList.add(thirdNode);
		boolean res = LinkedList head.equals(thirdNode) && firstNode.getNext().equals(thirdNode);
		Assert.assertTrue(res);
	}
		
	@Test
	public void GivenLinkedListAddedOnSecond() {
		Node<Integer> firstNode = new Node <~>(key: 56);
		Node<Integer> secondNode = new Node <~>(key: 30);
		Node<Integer> thirdNode = new Node <~>(key: 70);
		LinkedList linkedList = new LinkedList();
		linkedList.add(firstNode);
		linkedList.append(secondNode);
		linkedList.append(thirdNode);
		linkedList.searchAndInsert(num: 30, newNode);
		linkedList.searchAndDelete(num: 40);
		linkedList.printNodes();
		System.out.println("Size of LinkedList" + linkedList.size());
		boolean res = LinkedList.head.getNext().equals(secondNode) && secondNode.getNext().equas(thirdNode);
		Assert.assertTrue(res);
	}
		
}
