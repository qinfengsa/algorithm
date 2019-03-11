package com.qinfengsa.sort;

import com.qinfengsa.enumtype.SortTypeEnum;
import com.qinfengsa.sort.impl.*;

/**
 * 排序简单工厂
 * @author qinfengsa
 * @date 2019/3/7 16:34
 */
public class JavaSortFactory {
	/**
	 * 排序
	 * @param method 排序方法没加
	 * @return 排序的执行类
	 */
	public static ISort getSortMethod(SortTypeEnum method) {
		switch (method) {
			case BUBBLE_SORT :
				return new BubbleSort();
			case SELECTION_SORT :
				return new SelectionSort();
			case INSERTION_SORT :
				return new InsertionSort();
			case SHELL_SORT :
				return new ShellSort();
			case MERGE_SORT :
				return new MergeSort();
			case QUICK_SORT:
				return new QuickSort();
			case HEAP_SORT:
				return new HeapSort();
			default:
				return null;
		}
	}
}
