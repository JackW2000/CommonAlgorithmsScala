package com.jackw
package searching

object BinarySearch { // Pass in the array, the value to search for, the start index of the array, and the end index of the array
  // Binary search:
  // - Assumes input is already sorted
  // - Splits the array in half using the midpoint
  // - Halves the dataset each iteration
  // - Discards one half of the set based on where values are less than or larger than the value being searched for
  // Time Complexity: Best - O(1) Average - O(log(n)) Worst - O(log(n))
  def binarySearch(arr: Array[Int], searchFor: Int, startIndex: Int, endIndex: Int): Int = {
    // Check that there is more than one value in the array (low != high)
    if (endIndex >= startIndex) {
      val mid = startIndex + (endIndex - startIndex) / 2
      // Check if the value being searched for is found at the midpoint of the input array
      // If it is - return the value of the midpoint as this is the index of the value being searched for
      if (arr(mid) == searchFor) return mid
      // Verify whether the value being searched for is less than the value at the midpoint of the array
      // If it is - only look at the values in the first half of the array in the next iteration
      // If it is not - the value is either in the second half of the array, or is not present in the array at all
      // By providing index values to this method, we are able to call the method recursively to whittle down the array
      if (arr(mid) > searchFor) return binarySearch(arr, searchFor, startIndex, mid - 1)
      else return binarySearch(arr, searchFor, mid + 1, endIndex)
    }
    // If the value is not found in the input array, return -1
    -1
  }
}

