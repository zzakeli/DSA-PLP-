package DSAPLP4;

import java.util.Arrays;

public class SortingClass {

    public void bubbleSort(int[] num) {

        System.out.println("This a bubble sort.");
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + ". " + Arrays.toString(num));
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        // for (int i = 0; i < num.length; i++) {
        // for (int j = i + 1; j < num.length; j++) {
        // if (num[j] < num[i]) {
        // temp = num[j];
        // num[j] = num[i];
        // num[i] = temp;
        // }
        // }
        // System.out.println(Arrays.toString(num));
        // }
    }

    public void selectionSort(int[] num) {

        System.out.println("This is a selection sort.");
        int temp = Integer.MIN_VALUE;
        int smallestNum = Integer.MIN_VALUE;
        int position = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + ". " + Arrays.toString(num));
            boolean arrayInOrder = true;
            smallestNum = num[i];
            for (int j = i; j < num.length; j++) {
                if (num[j] <= smallestNum) {
                    smallestNum = num[j];
                    position = j;
                    arrayInOrder = false;
                }
            }
            if (arrayInOrder == true) {
                break;
            }
            temp = num[i];
            num[i] = smallestNum;
            num[position] = temp;
        }
    }

    public void insertionSort(int[] num) {

        System.out.println("This is an insertion sort.");
        int temp = 0;
        int counter = 0;
        for (int i = 0; i < num.length; i++) {
            counter = i + 1;
            while (num[counter] < num[i]) {
                temp = num[counter];
                num[counter] = num[i];
                num[i] = temp;
                counter--;
            }
        }
    }

    public void exit() {
        System.out.println("Exiting the program.");
    }
}
