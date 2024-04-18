package com.jackw
package structureTests

import structures.Node

import org.junit.jupiter.api.Assertions.{assertEquals, assertNull}
import org.junit.jupiter.api.Test

class NodeTest {
  @Test private[structureTests] def whenNodeIsInitialisedWithValue_thenGetValueReturnsThatValue(): Unit = {
    val nodeA = new Node(10)
    assertEquals(10, nodeA.getValue)
  }

  @Test private[structureTests] def whenNodeIsInitialisedWithValueAndThenUpdated_thenGetValueReturnsUpdatedValue(): Unit = {
    val nodeA = new Node(10)
    nodeA.setValue(20)
    assertEquals(20, nodeA.getValue)
  }

  @Test private[structureTests] def whenSetNextNodeCalled_thenNodeAfterCurrentIsAsExpected(): Unit = {
    val nodeA = new Node(10)
    val nodeB = new Node(20)
    nodeA.setNextNode(nodeB)
    assertEquals(nodeB, nodeA.getNextNode)
  }

  @Test private[structureTests] def whenPreviousNextNodeCalled_thenNodeBeforeCurrentIsAsExpected(): Unit = {
    val nodeA = new Node(10)
    val nodeB = new Node(20)
    nodeA.setPreviousNode(nodeB)
    assertEquals(nodeB, nodeA.getPreviousNode)
  }

  @Test private[structureTests] def whenGetNextNodeCalledAndNextNodeIsNull_thenNullIsReturned(): Unit = {
    val nodeA = new Node(10)
    assertNull(nodeA.getNextNode)
  }

  @Test private[structureTests] def whenGetPreviousNodeCalledAndNextNodeIsNull_thenNullIsReturned(): Unit = {
    val nodeA = new Node(10)
    assertNull(nodeA.getPreviousNode)
  }
}
