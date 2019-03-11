package com.qinfengsa.sort.impl;

import com.qinfengsa.sort.ISort;

/**
 * 插入排序
 * @author qinfengsa
 * @date 2019/3/7 20:01
 */
public class InsertionSort implements ISort {

	@Override
	public int[] sort(int[] sortArray) {
		System.out.println("插入排序");
		//假设前i个元素有序，第 i+1 个元素 和 前i个元素从后往前比，然后插入合适的位置，之后的元素一次后移
		int sortLength = sortArray.length  ;
		int curIndex;
		for (int i = 1;i < sortLength; i++ ) {
			curIndex = i;
			int tmpVal = sortArray[i];
			for(int j = i - 1; j >= 0; j--) {
				if (tmpVal < sortArray[j]) {
					sortArray[j + 1] = sortArray[j]; // 向后移动
					curIndex = j;
				}
			}

			sortArray[curIndex] = tmpVal;
		}
		return sortArray;
	}


}
