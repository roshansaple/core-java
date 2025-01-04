package com.array.examples;


public class ArrayUtil {
    public void getArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println("index["+ i + "] "+arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayUtil n = new ArrayUtil();
        n.getArray(new int[] {2,3,4,5,6,7,8,9});
    }
}