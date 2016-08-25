package coding24;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] num = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(num));

		int small = 0;
		int big = num.length - 1;

		quickSort(num, small, big);
		System.out.println(Arrays.toString(num));
	}

	public static void quickSort(int[] arr, int small, int big) {
		if (arr == null || arr.length == 0)
			return;

		if (small >= big)
			return;

		int middle = small + (big - small) / 2;
		int pivot = arr[middle];

		int i = small, j = big;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (small < j)
			quickSort(arr, small, j);

		if (big > i)
			quickSort(arr, i, small);
	}
}
