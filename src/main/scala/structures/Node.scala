package com.jackw
package structures

// Standard Node class for modelling an item in a LinkedList
class Node(private var value: Int)
{
  private var previousNode: Node = null
  private var nextNode: Node = null

  // Setters and Getters for Node values
  def setPreviousNode(previousNode: Node): Unit = {
    this.previousNode = previousNode
  }

  def getPreviousNode: Node = previousNode

  def getNextNode: Node = nextNode

  def setNextNode(nextNode: Node): Unit = {
    this.nextNode = nextNode
  }

  def getValue: Int = value

  def setValue(value: Int): Unit = {
    this.value = value
  }
}
