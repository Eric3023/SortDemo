package com.dong.demo.sort;

import java.util.Arrays;

public class SortTest {

    /*
     * 1.冒泡排序
     */
    public static void popSort() {
        int[] array = initData();
        SortUtils.popSort(array);
    }

    /*
     * 快速排序
     */
    public static void quickSort() {
        int[] array = initData();
        SortUtils.quickSort(array, 0 ,array.length-1);
        System.out.println("快速排序后："+Arrays.toString(array));
    }

    /*
     * 插入排序
     */
    public static void insertSort() {
        int[] array = initData();
        SortUtils.insertSort(array);
        System.out.println("插入排序后："+Arrays.toString(array));
    }

    /*
     * 选择排序
     */
    public static void selectSort() {
        int[] array = initData();
        SortUtils.selectSort(array);
        System.out.println("选择排序后："+Arrays.toString(array));
    }

    /*
     * 使用随机数，初始化初始数组
     */
    private static int[] initData() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int num = (int)(Math.random()*50);
            array[i] = num;
        }
        System.out.println("========================================");
        System.out.println(Arrays.toString(array));
        return array;

    }

}
