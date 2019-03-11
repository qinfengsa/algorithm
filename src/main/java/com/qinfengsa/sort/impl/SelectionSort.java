package com.qinfengsa.sort.impl;

import com.qinfengsa.sort.ISort;
import com.qinfengsa.util.SortUtils;

/**
 * SelectionSort 选择排序
 * @author qinfengsa
 * @date 2019/3/7 16:52
 */
public class SelectionSort implements ISort {

	@Override
	public int[] sort(int[] sortArray) {
		System.out.println("选择排序");
		int sortLength = sortArray.length  ;

		int minIndex;
		for (int i = 0; i < sortLength ; i++ ) {
			//前i个元素有序, 从 后面的元素中找到最小元素，然后和 i元素比较（取较小元素）
			minIndex = i;
			for(int j = i + 1; j < sortLength  ; j++) {
				if (sortArray[j] < sortArray[minIndex]) {
					minIndex = j;
				}
			}
			SortUtils.swap(sortArray,i,minIndex);
		}
		return sortArray;

	}
}
