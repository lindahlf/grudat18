//Fred Lindahl, grudat18, individuellt projekt

import java.util.HashMap;

/**
 * This package is a statistics library with some basic statistical operations supporting arrays of doubles in Java.
 */

public class FredStat {

    /**
     * Finds the most frequently occurring number from an array of doubles (mode) using a HashMap.
     * Returns the mode.
     * @param myArray
     * @return mode
     *
     * Time complexity (expected): f(n) = n;
     */

    public static double mode(double[] myArray){
        HashMap<Double, Integer> myMap = new HashMap<>();
        for (int i = 0; i < myArray.length; i ++){
            if (myMap.get(myArray[i]) == null){
                myMap.put(myArray[i], 1);
            }
            else{
                myMap.put((myArray[i]), myMap.get(myArray[i]) + 1);
            }
        }
        int maxValue = 0;
        double maxKey = 0;
        for (double entry : myMap.keySet()) {
            if (maxValue == 0){
                maxValue = myMap.get(entry);
                maxKey = entry;
            }
            if (myMap.get(entry) > maxValue) {
                maxValue = myMap.get(entry);
                maxKey = entry;
            }
            if (myMap.get(entry) == maxValue && entry < maxKey) {
                maxValue = myMap.get(entry);
                maxKey = entry;
            }
        }
        return maxKey;
    }

    /**
     * Finds the mean of a given array of doubles.
     * Returns the mean.
     *
     * @param myArray
     * @return mean
     */

    public static double mean(double[] myArray){
        if (myArray.length == 0) throw new NullPointerException();
        double sum = 0;
        for (double var : myArray){
           sum = sum + var;
        }
        return sum/myArray.length;
    }

    /**
     * Finds the median of a given array of doubles.
     * Returns the median.
     *
     * @param myArray
     * @return median
     */

    public static double median(double[] myArray){
        if (myArray.length == 0) throw new NullPointerException();
        QuickSort sorter = new QuickSort(myArray);
        if (myArray.length%2 == 0) { //even amount of elements
            return ((myArray[myArray.length / 2] + myArray[(myArray.length - 1) / 2]) / 2);
        }
         else{ //odd amount of elements
            return myArray[(myArray.length-1)/2];
        }
    }
    /**
     * Sorts a given array of doubles in ascending order. Returns the sorted array.
     * See <class>QuickSort</class> for implementation details.
     *
     * @param myArray
     * @return myArray sorted
     */

    public static double[] sortArray(double[] myArray){
        QuickSort sorter = new QuickSort(myArray);
        return myArray;
    }

    /**
     * Finds the largest value of a given array of doubles. Returns that value.
     *
     * @param myArray
     * @return largest value of myArray
     */

    public static double max(double[] myArray){
        if (myArray.length == 0) throw new NullPointerException();
        double max = myArray[0];
        for (double i : myArray){
            if (i>max) max = i;
        }
        return max;
    }

    /**
     * Finds the smallest value of a given array of doubles. Returns that value.
     *
     * @param myArray
     * @return smallest value of myArray
     */

    public static double min(double[] myArray){
        if (myArray.length == 0) throw new NullPointerException();
        double min = myArray[0];
        for (double i : myArray){
            if (i<min) min = i;
        }
        return min;
    }

    /**
     * Finds the range (difference between the largest and smallest value of a given array of doubles.
     * Returns the range.
     *
     * @param myArray
     * @return range of myArray
     */

    public static double range(double[] myArray){
        if (myArray.length == 0) throw new NullPointerException();
        return max(myArray) - min(myArray);
    }
}
