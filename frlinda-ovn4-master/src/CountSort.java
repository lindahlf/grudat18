//Fred Lindahl, grudat18, uppg 4.2

/**
 * This program sorts an array of positive integers using counting sort. 
 */

public class CountSort {

    /**
     * An implementation of counting sort that sorts an array of n positive integers.
     * For all elements it holds that 0 ≤ x_i ≤ k
     *
     * @param myArray
     * @return a sorted array in ascending order with the same elements as myArray
     *
     * Time complexity: f(n) = n + k
     */
    public static int[] sort(int[] myArray){
        int max = -1;
        for (int i: myArray){
            if (i > max){
                max = i;
            }
        }
        int[] countArray = new int[max+1];
        for (int i = 0; i < myArray.length; i++){
            countArray[myArray[i]] ++;
        }
        for (int i = 1; i < countArray.length; i++){
            countArray[i] = countArray[i] + countArray[i-1];
        }
        int[] sortedArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++){
            countArray[myArray[i]]--;
            sortedArray[countArray[myArray[i]]] = myArray[i];
        }
        return sortedArray;
    }
}
