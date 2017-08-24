package com.dong.sortdemo;

import java.util.Arrays;

public class SortDemo {

	/**
	 * @param sortDemo
	 * @author Dong
	 */
	
	private static int[] array;
	
	public static void main(String[] args) {
		
		initData();
		
//		insertSort();
		
//		selectSort();
		
//		bubbleSort();
		
		quickSort();

	}

	/*
	 * 使用随机数，初始化初始数组
	 */
	private static void initData() {
		array = new int[20];
		for (int i = 0; i < array.length; i++) {
			int num = (int)(Math.random()*100);
			array[i] = num;
		}
		System.out.println("初始数组为："+Arrays.toString(array));
	}

	/*
	 * 插入排序
	 */
	private static void insertSort() {	
		SortUtils.insertSort(array);
		System.out.println("插入排序后："+Arrays.toString(array));
	}
	
	/*
	 * 选择排序
	 */
	private static void selectSort() {	
		SortUtils.selectSort(array);
		System.out.println("选择排序后："+Arrays.toString(array));
	}
	
	/*
	 * 冒泡排序
	 */
	private static void bubbleSort() {	
		SortUtils.bubbleSort(array);
		System.out.println("冒泡排序后："+Arrays.toString(array));
	}
	
	/*
	 * 快速排序
	 */
	private static void quickSort() {	
		SortUtils.quickSort(array, 0 ,array.length-1);
		System.out.println("快速排序后："+Arrays.toString(array));
	}

}
