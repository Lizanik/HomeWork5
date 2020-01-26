package com.epam.tasks;

import java.util.Arrays;
public class main2 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        int[] arr2 = new int[11];
        System.out.println("Первый массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Второй массив");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (-10 + Math.random() * 20);
            System.out.print(arr2[i] + "\t");
        }
    }
}