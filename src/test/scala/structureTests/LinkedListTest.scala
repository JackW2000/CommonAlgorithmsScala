package com.jackw
package structureTests

import structures.{LinkedList, Node}

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LinkedListTest {
  @Test private[structureTests] def whenAppendNodeCalled_thenNodeAddedToLinkedList(): Unit = {
    val nodeA = new Node(10)
    val link = new LinkedList(nodeA)
    link.printLinkedList()
    link.appendNode(new Node(20))
    assertEquals(10, link.getFirstNode.getValue)
    assertEquals(20, link.getLastNode.getValue)
    assertEquals(2, link.getListLength)
  }

  @Test private[structureTests] def whenPrependNodeCalled_thenNodeAddedToLinkedList(): Unit = {
    val nodeA = new Node(10)
    val link = new LinkedList(nodeA)
    link.printLinkedList()
    link.prependNode(new Node(20))
    assertEquals(10, link.getLastNode.getValue)
    assertEquals(20, link.getFirstNode.getValue)
    assertEquals(2, link.getListLength)
  }

  @Test private[structureTests] def whenRemoveFirstNodeCalled_thenFirstNodeRemovedFromLinkedList(): Unit = {
    val nodeA = new Node(10)
    val link = new LinkedList(nodeA)
    link.printLinkedList()
    link.prependNode(new Node(20))
    assertEquals(10, link.getLastNode.getValue)
    assertEquals(20, link.getFirstNode.getValue)
    assertEquals(2, link.getListLength)
    link.removeFirstNode()
    assertEquals(10, link.getFirstNode.getValue)
    assertEquals(1, link.getListLength)
  }

  @Test private[structureTests] def whenRemoveEndNodeCalled_thenEndNodeRemovedFromLinkedList(): Unit = {
    val nodeA = new Node(10)
    val link = new LinkedList(nodeA)
    link.printLinkedList()
    link.prependNode(new Node(20))
    assertEquals(10, link.getLastNode.getValue)
    assertEquals(20, link.getFirstNode.getValue)
    assertEquals(2, link.getListLength)
    link.removeEndNode()
    assertEquals(20, link.getFirstNode.getValue)
    assertEquals(1, link.getListLength)
  }

  @Test private[structureTests] def whenAppendNodeByValueCalled_thenNodeAddedToLinkedList(): Unit = {
    val nodeA = new Node(10)
    val link = new LinkedList(nodeA)
    link.printLinkedList()
    link.appendNodeByValue(20)
    assertEquals(10, link.getFirstNode.getValue)
    assertEquals(20, link.getLastNode.getValue)
    assertEquals(2, link.getListLength)
  }

  @Test private[structureTests] def whenPrependNodeByValueCalled_thenNodeAddedToLinkedList(): Unit = {
    val nodeA = new Node(10)
    val link = new LinkedList(nodeA)
    link.printLinkedList()
    link.prependNodeByValue(20)
    assertEquals(10, link.getLastNode.getValue)
    assertEquals(20, link.getFirstNode.getValue)
    assertEquals(2, link.getListLength)
  }
}
