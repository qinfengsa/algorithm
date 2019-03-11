package com.qinfengsa.sort.impl;

import com.qinfengsa.sort.ISort;

/**
 * 快速排序
 * @author qinfengsa
 * @date 2019/3/9 14:09
 */
public class QuickSort implements ISort {
	@Override
	public int[] sort(int[] sortArray) {
		System.out.println("快速排序");
		int sortLength = sortArray.length - 1 ;
		quickSort(sortArray,0,sortLength);
		return sortArray;
	}
	/**
	 * 快速排序的核心思路：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
	 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列
	 * 通过一次排序把 数据 分为两部分(以一个基数A为准，通常选择第一个元素) 左边比A小 右边比A大 然后对左右两部分在进行（快速排序）递归
	 */
	private void quickSort(int[] sortArray,int start,int end) {
		if (start < end) {
			int midIndex = getMidIndex(sortArray,start,end);
			quickSort(sortArray,start,midIndex - 1);
			quickSort(sortArray,midIndex + 1, end);
		}

	}

	/**
	 * 通过一趟排序将要排序的数据分割成 两部分，返回中间的序号
	 * @param sortArray 排序数组
	 * @param start 开始节点
	 * @param end 结束节点
	 * @return 中间值的序号
	 */
	private int getMidIndex(int[] sortArray,int start,int end) {
		int i = start,j = end;
		//以第一个数组元素作为关键数据，赋值给key
		int key = sortArray[i];
		//重复，直到i=j；
		while (i < j) {
			//从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]的值赋给A[i]
			while (i < j && sortArray[j] >= key) {
				j--;
			}
			sortArray[i] = sortArray[j];
			//从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]的值赋给A[j]；
			while (i < j && sortArray[i] <= key ) {
				i++;
			}
			sortArray[j] = sortArray[i];

		}
		//把key放在i,j相遇的位置 之后 ，[i]位置之前都比key小，之后都比key大
		sortArray[i] = key;

		return i;
	}
}
