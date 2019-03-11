package com.qinfengsa.sort.impl;

import com.qinfengsa.sort.ISort;
import com.qinfengsa.util.SortUtils;

/**
 * 堆排序
 * @author qinfengsa
 * @date 2019/3/11 9:46
 */
public class HeapSort implements ISort {

	@Override
	public int[] sort(int[] sortArray) {
		System.out.println("堆排序");
		int sortLength = sortArray.length  ;
		// 循环sortLength - 1次 ，每次通过堆结构 找到最大值，放在相应最后
		for (int i = sortLength ;i > 1; i--) {
			createHeapForMaxValue(sortArray,i);
		}
		return sortArray;
	}

	/**
	 * 构建一个长度为heapLen的堆，通过堆结构把最大值放到顶部（root） 然后和最末尾的元素交换
	 * @param sortArray 排序数组
	 * @param heapLen 堆长度
	 */
	private void createHeapForMaxValue(int[] sortArray,int heapLen) {
		//获取堆 高度（不包含最后一级）
		int heapHeight = (int) Math.floor(Math.log((double)heapLen)/Math.log((double)2));
		//  1 + 2^1 + 2^2 +...+ 2^(n-1) = 2^n - 1
		int heapSize = (int) Math.round(Math.pow((double) 2,(double) heapHeight)) - 1;
		for (int i = heapSize; i > 0; i--) {
			//父节点
			int parentIndex = i - 1;
			//左子节点
			int leftIndex = 2 * parentIndex + 1;
			//右子节点
			int rightIndex = 2 * parentIndex + 2;
			// 如果左、右子节点 大于 父节点，子节点和父节点 交换位置
			if (leftIndex < heapLen && sortArray[leftIndex] > sortArray[parentIndex]) {
				SortUtils.swap(sortArray,leftIndex,parentIndex);
			}
			if (rightIndex < heapLen && sortArray[rightIndex] > sortArray[parentIndex]) {
				SortUtils.swap(sortArray,rightIndex,parentIndex);
			}

		}
		// 最大值已经到达 顶部， 和堆尾 元素交换
		SortUtils.swap(sortArray,0,heapLen - 1);

	}
}
