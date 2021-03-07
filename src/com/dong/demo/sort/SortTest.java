package com.dong.demo.sort;

import java.util.Arrays;

public class SortTest {

    /*
     * 1.ð������
     */
    public static void popSort() {
        int[] array = initData();
        SortUtils.popSort(array);
    }

    /*
     * ��������
     */
    public static void quickSort() {
        int[] array = initData();
        SortUtils.quickSort(array, 0 ,array.length-1);
        System.out.println("���������"+Arrays.toString(array));
    }

    /*
     * ��������
     */
    public static void insertSort() {
        int[] array = initData();
        SortUtils.insertSort(array);
        System.out.println("���������"+Arrays.toString(array));
    }

    /*
     * ѡ������
     */
    public static void selectSort() {
        int[] array = initData();
        SortUtils.selectSort(array);
        System.out.println("ѡ�������"+Arrays.toString(array));
    }

    /*
     * ʹ�����������ʼ����ʼ����
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
