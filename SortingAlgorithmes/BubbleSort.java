package org.krzywdek19.SortingAlgorithmes;

import org.krzywdek19.ArrayProcessor;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] array, boolean increasing) {
        boolean isSorted = false;
        for (int i = 0; i < array.length - 1; i++) {
            if(isSorted){
                break;
            }
            isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    ArrayProcessor.swap(array,j,j+1);
                    isSorted = false;
                }
            }
        }
    }
}
