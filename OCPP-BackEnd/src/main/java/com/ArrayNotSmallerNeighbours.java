package com;

import java.util.ArrayList;

public class ArrayNotSmallerNeighbours {

    public static void main(String[] args) {
        int [] array = {2,1,4,1,5};
        ArrayList arrayList = new ArrayList();
        for(int i=0;i<array.length; i++) {
            if(i==0){
                if(array[i]>array[i+1])
                    arrayList.add(array[i]);
                continue;
            }
            if(i==array.length-1) {
                if(array[i]>array[i-1])
                    arrayList.add(array[i]);
                continue;
            }
            if(array[i]>array[i-1] && array[i]>array[i+1])
                arrayList.add(array[i]);
        }
        arrayList.stream().forEach(i->System.out.println(i));

    }
}
