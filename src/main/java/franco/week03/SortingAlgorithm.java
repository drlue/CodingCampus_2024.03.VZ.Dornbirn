package franco.week03;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithm {
    public static void main(String[] args) {
        //create an array with random number for test

        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
       // System.out.println("original array\n" + Arrays.toString(numbers));
        // selectionSort(numbers);
        //bubbleSort(numbers);

        //System.out.println(Arrays.toString(numbers));
        //  System.out.println("sort array");
        //Check the time in ms.
        long start= System.currentTimeMillis();
        quickSort(numbers,0, numbers.length-1);
        long end =System.currentTimeMillis();
        System.out.println("Runtime:  " + (end -start) + "ms");
        //System.out.println(Arrays.toString(numbers));

    }

    public static void selectionSort(int[] numbers) {
        int arrLength = numbers.length;
        //first loop no need to go to the last as swap will not be possible
        //arrLength-1
        for (int i = 0; i < arrLength - 1; i++) {
            //min initialize at first value
            //indexOfmin is the index for later to be swap
            int min = numbers[i];
            int indexOfMin = i;
            //inner loop will start one past starting position
            //i+1
            for (int j = i + 1; j < arrLength; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            //swap method is down
            swap(numbers, i, indexOfMin);
        }
    }

    //parameter array, lowIndex=o and highIndex=array.length -1(last index)
    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        //to deal where is only 1 element left
        //it don't do anything it just returned
        if (lowIndex >= highIndex) {
            return;
        }

        // pivot to point at the last number of array-(last index)
        int pivot = array[highIndex];
        //initialize pointer lp at lowest index and hp at highest index
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        //create a function that move both to each other
        //when true we will be out of this loop
        while (leftPointer < rightPointer) {
            //inner while loop
            //go from the left until we found num greater than pivot
            //or hit the rightPointer
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            //go from the right until we found a num less than the pivot
            //or hit the leftPointer
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        //recall our function to the partition left at the left
        //again array as para,low index which is still o and
        //highIndex which leftPointer -1
        quickSort(array, lowIndex, leftPointer - 1);
        //now for the right part of it
        quickSort(array, leftPointer + 1, highIndex);
    }

    public static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

    public static void bubbleSort(int[] array) {
        int count = 0;
       // int swapped = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                count++;
                if (array[j + 1] < array[j]) {
//                    swapped = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = swapped;
                    swap(array, j, j + 1);
                }
            }
           // System.out.println(Arrays.toString(array) + "count " + count);
        }
    }
}
