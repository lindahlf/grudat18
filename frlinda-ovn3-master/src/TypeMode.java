//Fred Lindahl, grudat18, uppg 3.2

import java.util.HashMap;
/**
 * This program finds the mode of an array of integers.
 */
public class TypeMode {

    /**
     * Finds the most occurring number from an array of integers (mode) using a HashMap. Returns an array with the mode
     * and how many times it occurs in the given array.
     * @param myArray
     * @return mode
     *
     * Time complexity (expected): f(n) = n;
     * 
     */

    public static int[] findMode(int[] myArray){
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < myArray.length; i ++){
            if (myMap.get(myArray[i]) == null){
                myMap.put(myArray[i], 1);
            }
            else{
                myMap.put((myArray[i]), myMap.get(myArray[i]) + 1);
            }
        }
        int maxValue = 0;
        int maxKey = 0;
        for (int entry : myMap.keySet()) {
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
        int[] mode = {maxKey, maxValue};
        return mode;
    }
}
