package com.dong.sortdemo;

import java.util.Arrays;

public class SortUtils {


	/*
	 * 交换数组中的两个数
	 */
	public static void changeNum(int[] array, int i, int j){
		if(i > array.length-1 || j>array.length-1)
			return;
		int tmp = 0;
		tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	/*
	 * 插入排序
	 * 插入排序是一种最简单直观的排序算法，工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
	 */
	public static void insertSort(int[] array){
		int j, tmp;
		for (int i = 1; i < array.length; i++) {			
			tmp = array[i];
			for (j = i; j > 0 && array[j-1] > tmp; j--) {				
				array[j] = array [j-1];
			}
			array[j] = tmp;
		}
	}

	/*
	 * 选择排序
	 */
	public static void selectSort(int[] array){
		for (int i = 0; i < array.length; i++) {
			int index = i ;
			int min = array[i];
			for (int j = i; j < array.length; j++) {
				if(array[j] < min){
					min=array[j];
					index = j;
				}
			}
			changeNum(array, i, index);			
		}
	}

	/*
	 * 冒泡排序
	 */
	public static void bubbleSort(int[] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if(array[i]>array[j])
					changeNum(array, i, j);
			}
		}
	}

	/*
	 * 快速排序
	 */
	public static void quickSort(int[] array, int low, int hight){
		if(low < hight){
			int i = low;
			int j = hight;
			int tmp = array[i];
			while(i < j){
				while(i < j&& array[j]>tmp)
					j--;
				if(i<j){
					array[i++] =array[j];//先使用后计算
				}

				while(i < j&& array[i]<tmp)
					i++;
				if(i<j){
					array[j--] =array[i];//先使用后计算
				}

			}
			array[i] = tmp;
			quickSort(array, low, i-1);
			quickSort(array, j+1, hight);

		}
	}
}
