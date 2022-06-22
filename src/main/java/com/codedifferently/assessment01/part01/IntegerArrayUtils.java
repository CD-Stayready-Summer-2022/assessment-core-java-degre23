package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {

    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */

    public static Integer getSum(Integer[] intArray){
        int arr[] = new int[] {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        int arr[] = new int[] {1,2,3,4,5};
        int sum = 1;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum * arr[i];
        }
        return sum;
    }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray){
        return null;
    }
}
