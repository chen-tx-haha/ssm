package com.chen.demo01;

/**
 * @author chen
 * @date 2020/3/19 20:55
 */
//冒泡排序
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {10, 9, 6, 3, 5, 7};
        //String arr = "7904652";
        sorted(arr);
        //二分法查找索引的位置
        //int i = binarySearch(arr,9);
        //System.out.println(i);
    }

    public static void sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //二分法
    public static int binarySearch(int[] arr, int des) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] > des) {
                high = middle - 1;
            } else if (arr[middle] < des) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return 0;
    }

}
