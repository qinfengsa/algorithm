package com.qinfengsa.enumtype;

/**
 * 排序类型枚举
 * @author qinfengsa
 * @date 2019/3/11 9:33
 */
public enum SortTypeEnum {

	/**
	 * 冒泡排序
	 */
	BUBBLE_SORT(1),
	/**
	 * 选择排序
	 */
	SELECTION_SORT(2),
	/**
	 * 插入排序
	 */
	INSERTION_SORT(3),
	/**
	 * 希尔排序
	 */
	SHELL_SORT(4),
	/**
	 * 归并排序
	 */
	MERGE_SORT(5),
	/**
	 * 快速排序
	 */
	QUICK_SORT(6),

	/**
	 * 堆排序
	 */
	HEAP_SORT(7);

	int value;

	/**
	 * 排序类型
	 * @param value 排序值
	 */
	SortTypeEnum(int value) {
		this.value = value;
	}

	/**
	 * 获取 排序类型的值
	 * @return 值
	 */
	public int getValue() {
		return value;
	}
}
