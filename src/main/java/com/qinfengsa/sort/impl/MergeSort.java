package com.qinfengsa.sort.impl;

import com.qinfengsa.sort.ISort;
import com.qinfengsa.util.SortUtils;

/**
 * 归并排序
 * @author qinfengsa
 * @date 2019/3/8 15:28
 */
public class MergeSort implements ISort {


	@Override
	public int[] sort(int[] sortArray) {
		System.out.println("归并排序");
		int sortLength = sortArray.length  ;
		int mid = sortLength / 2;
		//int[] alist = SortUtils.subList(sortArray,0,mid);

		sortArray = mergeSort(SortUtils.subList(sortArray,0,mid),SortUtils.subList(sortArray,mid,sortLength));

		return sortArray;
	}

	private int[] mergeSort(int[] leftArray,int[] rightArray) {
		int leftLength = leftArray.length;
		int rightLength = rightArray.length;
		if (leftLength > 1) {
			//mergeSort();
			int mid = leftLength / 2;
			leftArray = mergeSort(SortUtils.subList(leftArray,0,mid),SortUtils.subList(leftArray,mid,leftLength));

		}
		if (rightLength > 1) {
			//mergeSort();
			int mid = rightLength / 2;
			rightArray = mergeSort(SortUtils.subList(rightArray,0,mid),SortUtils.subList(rightArray,mid,rightLength));

		}
		int[] resultList = new int[leftLength + rightLength];
		//合并
		int index = 0;
		int leftIndex = 0,rightIndex = 0;
		// 当 leftArray 和 rightArray 其中一个没有遍历完，（表示没有合并结束）循环
		while (leftIndex < leftLength || rightIndex < rightLength) {
			// leftIndex == leftLength 表示 leftArray
			if (leftIndex == leftLength) {
				resultList[index] = rightArray[rightIndex];
				rightIndex++;
				index++;
				continue;
			}
			if (rightIndex == rightLength) {
				resultList[index] = leftArray[leftIndex];
				leftIndex++;
				index++;
				continue;
			}
			if (leftArray[leftIndex] <= rightArray[rightIndex]) {
				resultList[index] = leftArray[leftIndex];
				leftIndex++;
				index++;
			} else {
				resultList[index] = rightArray[rightIndex];
				rightIndex++;
				index++;
			}


		}


		return resultList;

	}
}
