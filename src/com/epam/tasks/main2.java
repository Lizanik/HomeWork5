package com.epam.tasks;

import java.util.Arrays;
public class main2 {
        static int[] make() {
            int[] arr = new int[11];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (-10 + Math.random() * 20);
            }
            return arr;
        }
        static int [] sum(int[] arr1, int[] arr2) {
            int[] arr = new int[arr1.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr1[i] + arr2[i];
            }
            return arr;
        }
        public static void main(String[]args) {
            int[] arr1 = make();
            int[] arr2 = make();
            System.out.println("First array" + Arrays.toString (arr1));
            System.out.println("Second aray" +Arrays.toString( arr2));
            System.out.println("Sum " + Arrays.toString (sum (arr1, arr2)));
        }
    }
