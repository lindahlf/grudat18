//Fred Lindahl, grudat18, uppg 3.3

/**
 * This program sorts an array of integers, putting all negative numbers first in the array.
 */
public class inPlace {

    /**
     * Takes an array of integers and sorts all negative numbers to the first part of the array.
     * @param myArray
     * @return myArray
     *
     * Time complexity (expected): f(n) = n
     * Note that every element is accessed only once.
     */
    public static int[] negativeFirst(int[] myArray){
        int i = 0;
        int j = myArray.length - 1;
        while (i<j){
            // Invariant: elements before i are either negative or null.
            // Elements after j are either positive or null.
            if(myArray[i] > 0){
                while(myArray[j] > 0 && j>i) j--;
                int temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
                i++;
            }
            else i++;
        }
        return myArray;
    }
}
