package com.qinfengsa.sort.impl;


import com.qinfengsa.sort.ISort;
import com.qinfengsa.util.SortUtils;

import javax.tools.JavaCompiler;

/**
 * 冒泡排序
 * @author qinfengsa
 * @date 2019/3/5 16:52
 */
public class BubbleSort implements ISort {

	@Override
	public int[] sort(int[] sortArray) {
		System.out.println("冒泡排序");
		int sortLength = sortArray.length - 1 ;
		for (int i = 0;i < sortLength ; i++ ) {
			for(int j = 0; j < sortLength - i ; j++) {
				//相邻元素比较，把最大的元素移到最后 [sortLength - i]
				if (sortArray[j] > sortArray[j+ 1]) {
					SortUtils.swap(sortArray,j,j + 1);
				}
			}
		}
		return sortArray;

	}
}
