package com.jackw
package structures

import java.util.logging.Logger

class LinkedList(node: Node)
{
  private[structures] val logger = Logger.getLogger("Main")

  private var firstNode: Node = node
  private var lastNode: Node = node
  private var listLength = 1

  // Setters and Getters for LinkedList values
  def getFirstNode: Node = firstNode

  private def setFirstNode(firstNode: Node): Unit = {
    this.firstNode = firstNode
  }

  def getLastNode: Node = lastNode

  private def setLastNode(lastNode: Node): Unit = {
    this.lastNode = lastNode
  }

  def getListLength: Int = listLength

  // Method to increment ListLength by 1
  private def incrementListLength(): Unit = {
    this.listLength += 1
  }

  // Method to decrement ListLength by 1
  private def decrementListLength(): Unit = {
    this.listLength -= 1
  }

  // Append a node to the end of the LinkedList
  def appendNode(node: Node): Unit = {
    // Point the previousNode property to the current last node
    node.setPreviousNode(this.getLastNode)
    // Update the value of nextNode for the current last node to point at the new node
    this.getLastNode.setNextNode(node)
    // this.lastNode.setNextNode(node); would also work here
    // I opted to use setters and getters where possible in this example
    // Update the value of lastNode to be the newly appended node
    this.setLastNode(node)
    // Increment the node counter
    this.incrementListLength()
  }

  // Append a node to the end of the LinkedList
  def appendNodeByValue(value: Int): Unit = {
    // Create a new node
    val node = new Node(value)
    // Point the previousNode property to the current last node
    node.setPreviousNode(this.getLastNode)
    // Update the value of nextNode for the current last node to point at the new node
    this.getLastNode.setNextNode(node)
    // Update the value of lastNode to be the newly appended node
    this.setLastNode(node)
    // Increment the node counter
    this.incrementListLength()
  }

  // Insert a node at the beginning of the LinkedList
  def prependNode(node: Node): Unit = {
    // Set the next node value for the new node to point at the current first node
    node.setNextNode(this.getFirstNode)
    // Set the previous node for the current first node to be the new node
    this.getFirstNode.setPreviousNode(node)
    // Set a new firstNode for the LinkedList object
    this.setFirstNode(node)
    // Increment the node counter
    this.incrementListLength()
  }

  // Insert a node at the beginning of the LinkedList
  def prependNodeByValue(value: Int): Unit = {
    // Create a new node
    val node = new Node(value)
    // Set the next node value for the new node to point at the current first node
    node.setNextNode(this.getFirstNode)
    // Set the previous node for the current first node to be the new node
    this.getFirstNode.setPreviousNode(node)
    // Set a new firstNode for the LinkedList object
    this.setFirstNode(node)
    // Increment the node counter
    this.incrementListLength()
  }

  // Method to "pop" or "dequeue" the first node from the LinkedList
  def removeFirstNode(): Unit = {
    // Output the data from the first node
    logger.info("Removed node value: " + this.getFirstNode.getValue)
    // Set the first node to point at the next node for the existing first node
    this.setFirstNode(this.getFirstNode.getNextNode)
    // Set the previous node for the new start node to null
    this.getFirstNode.setPreviousNode(null)
    // Decrement the list length
    this.decrementListLength()
  }

  // Method to "pop" or "dequeue" the last node from the LinkedList
  def removeEndNode(): Unit = {
    // Output the data from the first node
    logger.info("Removed node value: " + this.getLastNode.getValue)
    // Set the first node to point at the next node for the existing first node
    this.setLastNode(this.getLastNode.getPreviousNode)
    // Set the next node for the new end node to null
    this.getLastNode.setNextNode(null)
    // Decrement the list length
    this.decrementListLength()
  }

  // Method to step through a linked list, printing the node values
  def printLinkedList(): Unit = {
    var formattedLogMessage: String = null
    logger.info("Linked list values:")
    // Check that the first node is not NULL
    if (this.getFirstNode != null) {
      // Get the current node as the fist node
      var currentNode = this.getFirstNode
      var counter = 0
      // While there is a value in nextNode, print the current node value and update currentNode to be nextNode
      while (currentNode.getNextNode != null) {
        formattedLogMessage = String.format("%s: %s", counter, currentNode.getValue)
        logger.info(formattedLogMessage)
        currentNode = currentNode.getNextNode
        counter += 1
      }
      // As the loop will exit when the last node is reached, we must output the value of lastNode here
      formattedLogMessage = String.format("%s: %s", counter, currentNode.getValue)
      logger.info(formattedLogMessage)
    }
  }
}

