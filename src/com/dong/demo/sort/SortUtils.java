package com.dong.demo.sort;

import java.util.Arrays;

/**
 * 交换排序：
 * 1.冒泡排序
 * 2.快速排序
 * <p>
 * 插入排序：
 * 3.直接插入排序
 * 4.堆排序
 * <p>
 * 选择排序：
 * 5.简单选择排序
 * 6.希尔排序
 * <p>
 * 7.归并排序
 * 8.基数排序
 */

public class SortUtils {

    /*
     * 1.冒泡排序
     *
     * 实现思路：
     * 它重复地走访要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来；
     * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成；
     *
     * 时间复杂度O(n^2)
     */
    public static void popSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    changeNum(array, j, j + 1);
                }
            }
        }
    }

    /*
     * 2.快速排序
     *
     * 实现思路：
     * 通过一趟排序将要排序的数据分割成独立的两部分：分割点左边都是比它小的数，右边都是比它大的数。
     *
     * 时间复杂度：
     * 最优情况：O(n*lgn)
     * 最坏情况：O(n^2)
     */
    public static void quickSort(int[] array, int low, int height) {
        if (array == null || array.length <= 0 || low >= height) return;
        //确定主元
        int i = low;
        int j = height;
        int base = array[i];

        while (i < j) {
            //从后往前
            while (i < j && array[j] > base) j--;
            if (i < j) array[i++] = array[j];
            //从前往后
            while (i < j && array[i] < base) i++;
            if (i < j) array[j--] = array[i];
        }
        array[i] = base;
        //递归
        quickSort(array, low, i - 1);
        quickSort(array, i + 1, height);
    }

    /*
     * 3.直接插入排序
     * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
     *
     * 时间复杂度：O(n^2)
     * 最优情况：O(n)
     * 最坏情况：O(n^2)
     */
    public static void insertSort(int[] array) {
        int j, tmp;
        //遍历无序队列
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            //遍历有序队列（从后往前）
            for (j = i; j > 0 && array[j - 1] > tmp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }

    /*
     * 5.直接选择排序
     *
     * 时间复杂度O(n^2)
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (index != i) changeNum(array, i, index);
        }
    }
    

    /*
     * 交换数组中的两个数
     */
    public static void changeNum(int[] array, int i, int j) {
        if (i > array.length - 1 || j > array.length - 1)
            return;
        int tmp = 0;
        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
