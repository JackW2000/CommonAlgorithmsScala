package com.jackw
package sortTests

import managers.SortingManager

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InsertionSortTest {
  private[sortTests] val sortingManager = new SortingManager
  private[sortTests] val unsortedArr = Array(10, 5, 60, 54, 1, 57, 19, 954, 15, 30)
  private[sortTests] var sortedArr: Array[Int] = null

  @Test private[sortTests] def whenUnsortedArrayPassedIntoMethod_thenArrayIsSortedAfterwards(): Unit = {
    sortedArr = sortingManager.insertionSort(unsortedArr)
    assertEquals(1, sortedArr(0))
    assertEquals(5, sortedArr(1))
    assertEquals(10, sortedArr(2))
    assertEquals(15, sortedArr(3))
    assertEquals(19, sortedArr(4))
    assertEquals(30, sortedArr(5))
    assertEquals(54, sortedArr(6))
    assertEquals(57, sortedArr(7))
    assertEquals(60, sortedArr(8))
    assertEquals(954, sortedArr(9))
  }
}
