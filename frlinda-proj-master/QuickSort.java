import java.util.Random;


//This is a sorting class based on the sorting algorithm quicksort.

public class QuickSort {

    private double myArray[];
    private int length;

    /**
     * Constructor for QuickSort. Stores the given array as a global variable.
     *
     * @param myArray
     */

    public QuickSort(double myArray[]) {
        this.myArray = myArray;
        this.length = myArray.length;
        sort(0, length, length);
    }

    /**
     * Partitions the list so that elements smaller than the pivot p are moved
     * to the left of p and elements larger than p are moved to the right.
     * Elements equal to p are moved to middle, next to p.
     * Sorts the two subslices of the original array recursively.
     * Uses insertionssort for smaller subslices for improved performance.
     * @param low
     * @param high
     * @param length
     */
    private void sort(int low, int high, int length) {
        if (length < 20){
            insertionSort(low, high-1);
        }
        else {
            double p = myArray[pivot(low, high-1)];
            int mid = low;
            while (mid < high) {
                // Invariant:
                // - myArray[:low] < p
                // - myArray[low:mid] = p
                // - myArray[mid:high] = unknown
                // - myArray[high:] > p
                double a = myArray[mid];
                if (a < p) {
                    myArray[mid] = myArray[low];
                    myArray[low] = a;
                    low++;
                    mid++;
                }
                if (a == p) mid++;
                if (a > p) {
                    myArray[mid] = myArray[high - 1];
                    myArray[high - 1] = a;
                    high--;
                }
            }
            sort(0, low, low);
            sort(high, myArray.length, length - high);
        }
    }

    /**
     * Implementation of the sorting algorithm insertionsort.
     * Loops through the list from start to finish and makes sure that all
     * elements preceding the iteration variable are in sorted order.
     * @param low
     * @param high
     */
    private void insertionSort(int low, int high){
        int holePosition;
        double key;
        for (int j = low + 1; j < high + 1; j++){
            // Invariant: myArray[j:] contain the same elements
            // as the original slice but in sorted order.
            key = myArray[j];
            holePosition = j;

            while (holePosition > low && myArray[holePosition-1] > key){
                myArray[holePosition] = myArray[holePosition-1];
                holePosition = holePosition - 1;
            }
            myArray[holePosition] = key;
        }
    }

    /**
     * Generates a random pivot in the range of the list length.
     * @param low
     * @param high
     * @return
     */
    public static int pivot(int low, int high){
        Random generator = new Random();
        return generator.nextInt((high-low) + 1) + low;
    }

}