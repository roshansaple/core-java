package com.array.examples;

public class FindMinimumNumber {
    public int findMinNumber(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 1, 5, 7, 3, 4, 6};
        FindMinimumNumber fm = new FindMinimumNumber();
        System.out.println(fm.findMinNumber(num));
    }
}


