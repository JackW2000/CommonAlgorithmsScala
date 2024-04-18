package com.jackw
package searching

import scala.util.boundary
import scala.util.boundary.break

object LinearSearch { // Declare method to perform the search, taking an array and searchFor as params
  // Linear search:
  // - Input does not need to be sorted
  // - Iterates over the input in order
  // - If the value is found then the index it is found at is returned
  // - If the value is not found then -1 is returned
  // Time Complexity: Best - O(1) Average - O(n) Worst - O(n)
  // NOTE: Best case is when the value is in the first index.
  def linearSearch(arr: Array[Int], searchFor: Int): Int = {
    // Iterate over array in order until fully traversed
    // in Scala, return is deprecated - we use the boundary break API approach instead to return when a criteria is/is not met
    boundary:
      for (i <- arr.indices)
        // Verify whether the value being searched for is held at the current index location
        // If it is - return the index as the value is now found
        // If it is not - continue to the next iteration and perform the check again
        if arr(i) == searchFor then break(i)
      // If the value is not found in the input array then return -1
      -1
  }
}
