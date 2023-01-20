package com;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

    public static void main(String[] args) {

        int[] array = {-1, 4, 2, 5, 3};

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]<array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
            }
        }
    }

        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }

    }
}
