package com.wuzh.strategy;

public class SelectionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("使用选择排序");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
