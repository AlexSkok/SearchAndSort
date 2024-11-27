package app;

import java.util.Arrays;

import static app.ArrayUtils.binarySearch;
import static app.ArrayUtils.mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 1, 76, 33, 11, 23};
        System.out.println("Вхідний масив: " + Arrays.toString(arr));
//        merge-------------
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Відсортований масив злиттям: " + Arrays.toString(arr));
//        ---------
//        binary
        int target = 1;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Елемент " + target + " знайдено за індексом " + index);
        } else {
            System.out.println("Елемент " + target + " не знайдено у масиві");
        }

    }
}