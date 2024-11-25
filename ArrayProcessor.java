package org.krzywdek19;

import org.krzywdek19.SortingAlgorithmes.SortingAlgorithm;

import java.util.Random;

public class ArrayProcessor {
    public static void fillArrayWithNumbers(int[] array, int bound){
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            int randomNumber = random.nextInt(bound);
            if(random.nextBoolean()){
                randomNumber *= -1;
            }
            array[i] = randomNumber;
        }
    }

    public static void printSortPrint(int [] array, boolean increasing, SortingAlgorithm sortingAlgorithm){
        int minValue = findMinOrMax(array, true);
        int maxValue = findMinOrMax(array, false);

        printBound(150);
        System.out.println("Before sorting: ");
        printArray(array);

        long actualTime = System.currentTimeMillis();
        sortingAlgorithm.sort(array, increasing);
        long elapsedTime = System.currentTimeMillis() - actualTime;
        System.out.println("After sorting: ");
        printArray(array);
        System.out.println();
        System.out.println("Used sorting: " + sortingAlgorithm.getClass().getSimpleName());
        System.out.println("Sorted " + (increasing? "increasing" : "decreasing"));
        System.out.println("Array length: " + array.length);
        System.out.println("Value bound: " + minValue + " " + maxValue);
        System.out.println("Elapsed time: " + elapsedTime + "ms");
        printBound(150);
    }

    private static void printArray(int[] array){
        int rowCounter = 0;
        for (int i : array){
            System.out.print(i + " ");
            rowCounter++;
            if(rowCounter == 20){
                System.out.println();
                rowCounter = 0;
            }
        }
        System.out.println();
    }

    private static int findMinOrMax(int[] array, boolean isMin){
        int value = array[0];
        for (int i : array){
            if(isMin){
                if(value < i){
                    value = i;
                }
            }else {
                if (value > i) {
                    value = i;
                }
            }
        }
        return value;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printBound(int size){
        for(int i = 0; i < size; i++){
            System.out.print("=");
        }
        System.out.println();
    }
}
