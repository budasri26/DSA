package com.java.ArrayList;

public class ThirdMaximum {
	public static void main(String[] args) {

        int[] arr = {10, 20, 5, 40, 30};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second) {
                third = second;
                second = num;
            }
            else if (num > third) {
                third = num;
            }
        }

        System.out.println("Third Maximum Number = " + third);
    }
}


