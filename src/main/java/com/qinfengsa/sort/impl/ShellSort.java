package com.qinfengsa.sort.impl;

import com.qinfengsa.sort.ISort;

/**
 * 希尔排序
 * @author qinfengsa
 * @date 2019/3/8 11:05
 */
public class ShellSort implements ISort {


	@Override
	public int[] sort(int[] sortArray) {
		System.out.println("希尔排序");
		int shellNum = sortArray.length/2;
		while (shellNum >= 1) {

			shellShort(sortArray,shellNum);
            shellNum = shellNum/2;
		}


		return sortArray;
	}

	private void shellShort(int[] sortArray,int shellNum) {
		int sortLength = sortArray.length;

		int count = sortLength/shellNum;

		for (int k = 0; k < count; k++) {
			int curIndex;
			for (int i = k + shellNum;i < sortLength; i = i + shellNum) {
				curIndex = i;
				int tmpVal = sortArray[i];
				for(int j = i - shellNum; j >= 0; j = j - shellNum) {
					if (tmpVal < sortArray[j]) {
						// 向后移动
						sortArray[j + shellNum] = sortArray[j];
						curIndex = j;
					}
				}
				sortArray[curIndex] = tmpVal;
			}
		}
	}
}
