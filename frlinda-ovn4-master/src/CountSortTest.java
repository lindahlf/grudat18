import static org.junit.Assert.*;

public class CountSortTest {

    @org.junit.Test
    public void sort() {
        int[] testArray1 = {10, 23, 1, 4, 1, 2, 7, 5, 2};
        int[] sortedArray1 = {1, 1, 2, 2, 4, 5, 7, 10, 23};
        assertArrayEquals(sortedArray1, CountSort.sort(testArray1));
        int[] testArray2 = {};
        int[] sortedArray2 = {};
        assertArrayEquals(sortedArray2, CountSort.sort(testArray2));
        int[] testArray3 = {100000, 1, 1, 1, 1, 1, 1};
        int[] sortedArray3 = {1, 1, 1, 1, 1, 1, 100000};
        assertArrayEquals(sortedArray3, CountSort.sort(testArray3));

    }
}