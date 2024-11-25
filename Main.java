package org.krzywdek19;

import org.krzywdek19.SortingAlgorithmes.BubbleSort;
import org.krzywdek19.SortingAlgorithmes.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List sortingAlgorithmes = new ArrayList<SortingAlgorithm>();
        sortingAlgorithmes.add(new BubbleSort());

        int [] testingArray = new int [10000];
        ArrayProcessor.fillArrayWithNumbers(testingArray, 1000);

        for (int i = 0; i < sortingAlgorithmes.size() ; i++) {
            int [] arrayCopy = Arrays.copyOf(testingArray, testingArray.length);
            ArrayProcessor.printSortPrint(arrayCopy, true, (SortingAlgorithm) sortingAlgorithmes.get(i));
        }

    }
}