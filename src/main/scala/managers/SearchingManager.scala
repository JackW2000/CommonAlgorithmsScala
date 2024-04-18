package com.jackw
package managers

import searching.{BinarySearch, LinearSearch}

// Manager class used to access all searching algorithms from a single entry point
class SearchingManager {
  def linearSearch(arr: Array[Int], searchFor: Int): Int = LinearSearch.linearSearch(arr, searchFor)

  def binarySearch(arr: Array[Int], searchFor: Int): Int = BinarySearch.binarySearch(arr, searchFor, 0, arr.length)
}
