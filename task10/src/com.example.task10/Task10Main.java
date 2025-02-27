package com.example.task10;

public class Task10Main {

    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
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

}