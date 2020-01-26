package com.epam.tasks;

public class main1 {

      public static void main (String [] args ) {
        int[] array1 = {19, 98, -28, 0, 83, 579, -3, -78, 65, 80, 0, -679, -56}, pos, neg;
        int positive = 0, negative = 0;

        for (int i : array1) {
            if (i >= 0) {
                positive++;
            } else {
                negative++;
            }
        }

        pos = new int[positive];
        neg = new int[negative];

        positive = 0;
        negative = 0;

        for (int i : array1) {
            if (i >= 0) {
                pos[positive] = i;
                positive++;
            } else {
                neg[negative] = i;
                negative++;
            }
        }

        System.out.print("Starter array: ");
        for (int i : array1) {
            System.out.print(" " + i);
        }

        System.out.print("\nPositive array: ");
        for (int i : pos) {
            System.out.print(" " + i);
        }

        System.out.print("\nNegative array: ");
        for (int i : neg) {
            System.out.print(" " + i);
        }

    }
}