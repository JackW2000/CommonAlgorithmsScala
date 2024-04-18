package com.jackw
package searchTests

import managers.SearchingManager
import sorting.MergeSort

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTest {
  private[searchTests] val searchingManager = new SearchingManager
  private[searchTests] val unsortedArr = Array(10, 5, 60, 54, 1, 57, 19, 954, 15, 30)

  @Test private[searchTests] def whenSearchForValueInList_thenSearchIndexCorrectlyReturned(): Unit = {
    MergeSort.mergeSort(unsortedArr)
    val searchIndex = searchingManager.binarySearch(unsortedArr, 54)
    assertEquals(6, searchIndex)
  }

  @Test private[searchTests] def whenSearchForValueNotInList_thenSearchReturnsNegativeOne(): Unit = {
    MergeSort.mergeSort(unsortedArr)
    val searchIndex = searchingManager.binarySearch(unsortedArr, 123)
    assertEquals(-1, searchIndex)
  }
}
