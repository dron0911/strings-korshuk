package com.belhard.util;

import java.util.Random;

public class ArrayUtil {
	// create arrays
	public static int[] randomArrayOfInt(int n) {
		Random random = new Random();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		return array;
	}

	public static double[] randomArrayOfDouble(int n) {
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {

			array[i] = Math.random() * 10 - 5;
		}
		return array;
	}

	// find minimum value in array
	public static int findArrayMin(int[] array) {
		int min = array[0];
		for (int mas : array) {
			if (min > mas) {
				min = mas;
			}
		}
		return min;
	}

	// create arrays of arrays
	public static int[][] randomArrOfArrOfInt(int n) {
		Random random = new Random();
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		return array;
	}

	// bubble sort in ascending order
	public static int[] bubbleSort(int[] array) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			int temp;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return array;
	}

	// selection sort in descending order
	public static int[] selectionSort(int[] array) {
		int max, temp;
		for (int i = 0; i < array.length - 1; i++) {
			max = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[max]) {
					max = j;
				}
			}
			temp = array[i];
			array[i] = array[max];
			array[max] = temp;
		}
		return array;
	}

	// insertion sort in ascending order
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}
		return array;
	}

	// shell sorting in ascending order
	public static int[] shellSorting(int[] array) {
		int h = 1;
		int n = array.length;
		while (h < n / 3)
			h = 3 * h + 1;
		while (h >= 1) {
			for (int i = h; i < array.length; i++) {
				for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
					int temp = array[j];
					array[j] = array[j - h];
					array[j - h] = temp;
				}
			}
			h = h / 3;
		}
		return array;
	}
}
