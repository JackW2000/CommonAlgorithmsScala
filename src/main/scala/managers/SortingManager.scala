package com.jackw
package managers

import sorting.*

// Manager class used to access all sorting algorithms from a single entry point
class SortingManager {
  def bubbleSort(arr: Array[Int]): Array[Int] = BubbleSort.bubbleSort(arr)

  def insertionSort(arr: Array[Int]): Array[Int] = InsertionSort.insertionSort(arr)

  def mergeSort(arr: Array[Int]): Array[Int] = MergeSort.mergeSort(arr)

  def quickSort(arr: Array[Int]): Array[Int] = QuickSort.quickSort(arr, 0, arr.length - 1)

  def selectionSort(arr: Array[Int]): Array[Int] = SelectionSort.selectionSort(arr)
}
