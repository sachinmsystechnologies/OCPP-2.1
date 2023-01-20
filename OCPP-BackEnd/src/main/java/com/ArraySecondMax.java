package com;

public class ArraySecondMax {

    public static void main(String[] args) {
        int  a [] = {6,4,7, 9};
        int max=0,secondMax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max) {
                int temp=a[i];
                secondMax=max;
                max=temp;
            }else if(a[i]>secondMax){
                secondMax =a[i];
            }
        }
        System.out.println(" second max= " + secondMax);
        System.out.println("  max= " + max);

    }
}
