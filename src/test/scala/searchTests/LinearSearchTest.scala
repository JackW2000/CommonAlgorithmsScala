package com.jackw
package searchTests

import managers.SearchingManager

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LinearSearchTest {
  private[searchTests] val searchingManager = new SearchingManager
  private[searchTests] val unsortedArr = Array(10, 5, 60, 54, 1, 57, 19, 954, 15, 30)

  @Test private[searchTests] def whenSearchForValueInList_thenSearchIndexCorrectlyReturned(): Unit = {
    val searchIndex = searchingManager.linearSearch(unsortedArr, 54)
    assertEquals(3, searchIndex)
  }

  @Test private[searchTests] def whenSearchForValueNotInList_thenSearchReturnsNegativeOne(): Unit = {
    val searchIndex = searchingManager.linearSearch(unsortedArr, 123)
    assertEquals(-1, searchIndex)
  }
}
