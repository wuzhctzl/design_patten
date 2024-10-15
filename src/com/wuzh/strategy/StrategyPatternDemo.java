package com.wuzh.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        SortContext context = new SortContext(new BubbleSort());
        context.sort(array); // 使用冒泡排序

        System.out.println("排序后的数组: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        // 重新设置排序策略为选择排序
        context.setSortStrategy(new SelectionSort());
        context.sort(array); // 使用选择排序

        System.out.println("排序后的数组: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
