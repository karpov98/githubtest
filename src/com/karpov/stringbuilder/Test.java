package com.karpov.stringbuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = null;
        int[] arr3 = {3,4,5};

        System.out.println(convertArrToString(arr1));
        System.out.println(convertArrToString(arr2));
        System.out.println(convertArrToString(arr3));
        System.out.println(System.currentTimeMillis());

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0 + "s");

        BigDecimal a1 = BigDecimal.valueOf(10.0);
        BigDecimal a2 = BigDecimal.valueOf(3.0);
        System.out.println(a1.divide(a2, 2, RoundingMode.HALF_DOWN));

    }

    public static String convertArrToString(int[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i != arr.length - 1 ? ", " : "");
            }
            sb.append("]");
            return sb.toString();
        } else {
            return null;
        }

    }
}
