package com.example.task11;

public class Task11Main {

    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int getMinIndexNum(int[] arr) {
        int minNum = 0;
        if (arr.length == 0) {
            return 0;
        }
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minNum = i;
                minValue = arr[i];
            }
        }
        return minNum;
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int minIndexNum = getMinIndexNum(arr);
        int firstElement = arr[0];
        arr[0] = arr[minIndexNum];
        arr[minIndexNum] = firstElement;
    }

}