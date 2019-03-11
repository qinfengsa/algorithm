package com.qinfengsa.util;

/**
 * 交换元素
 * @author qinfengsa
 * @date 2019/3/7 20:11
 */
public final class SortUtils {

	/**
	 * 数组交换元素
	 * @param sortArray 数组
	 * @param a 下标
	 * @param b 下标
	 */
	public static void swap(int[] sortArray,int a,int b) {
		int tmp = sortArray[a];
		sortArray[a] = sortArray[b];
		sortArray[b] = tmp;
	}

	/**
	 * 数组截取
	 * @param sortArray 数组
	 * @param start 截取开始下标
	 * @param end 截取结束下标
	 * @return 截取后的数组
	 */
	public static int[] subList(int[] sortArray,int start,int end) {
		int[] resultArray = new int[end - start];
		int index = 0;
		for (int i = start; i < end; i++) {
			resultArray[index] = sortArray[i];
			index++;
		}
		return resultArray;
	}

}
