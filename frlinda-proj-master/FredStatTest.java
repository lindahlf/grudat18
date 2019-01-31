import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class FredStatTest {

    @org.junit.Test
    public void mode() {
        double[] someArray = {4, 6, 8, 5, 74, 14, 13, 5, 16, 16, 4};
        double correctMode = 4;
        double testMode = FredStat.mode(someArray);
        assertTrue(correctMode == testMode);
        double[] someArray2 = {4, 4, 6, 8, 5, 74, 14, 13, 5, 16, 16, 4};
        double correctMode2 = 4;
        double testMode2 = FredStat.mode(someArray2);
        assertTrue(correctMode2 == testMode2);
        double[] someArray3 = {};
        double correctMode3 = 0;
        double testMode3 = FredStat.mode(someArray3);
        assertTrue(correctMode3 == testMode3);
    }

    @org.junit.Test
    public void mean() {
        double[] someArray = {4.5, 2.2, 6, 6, 3, 3, 3, 5, 6, 73, 45, 23, 65, 53, 1, 3, 34, 5, 9, 76, 86, 63, 8, 2, 3, 9, 64, 74, 87, 83, 84, 91, 94, 99, 100, 101, 83.2};
        double correctMean = 42.07837837837838;
        assertTrue(correctMean == FredStat.mean(someArray));

        double[] anotherArray = {6, 354, 3, 5, 534, 34, 234, 34, 23, 45, 9834, 72, 2782, 723, 7823, 2378, 2.3, 0.101, 1.010101, 892789.01, 1, 1, 1, 1};
        double rightMean = 38236.684212541666;
        assertTrue(rightMean == FredStat.mean(anotherArray));

    }

    @org.junit.Test(expected = NullPointerException.class)
    public void nullMean(){
        double[] nullArray = {};
        FredStat.mean(nullArray);
    }

    @org.junit.Test()
    public void median() {
        double[] oneArray = {-1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        double correctMedian = 0.0;
        assertTrue(correctMedian == FredStat.median(oneArray));

        double[] someArray = {4.5, 2.2, 6, 6, 3, 3, 3, 5, 6, 73, 45, 23, 65, 53, 1, 3, 34, 5, 9, 76, 86, 63, 8, 2, 3, 9, 64, 74, 87, 83, 84, 91, 94, 99, 100, 101, 83.2};
        double rightMedian = 34.0;
        assertTrue(rightMedian == FredStat.median(someArray));
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void nullMedian(){
        double[] nullArray = {};
        FredStat.median(nullArray);
    }

    @org.junit.Test
    public void sortArray() {

        //Case 1
        double[] testArray = {4.5, 2.2, 6, 6, 3, 8.8, 42, 5, 6, 73, 45, 23, 65, 53, 1, 3, 34, 5, 9, 76, 8.6, 63, 8, 2, 3, 9, 64, 4.5, 2.2, 6, 6.2, 3, 3.7, 3, 5, 6, 73, 4.5, 23, 6.5, 53, 1, 3, 34, 5, 9, 76, 8.6, 63, 8, 2, 3, 9, 64};
        double[] testArray2 = {4.5, 2.2, 6, 6, 3, 8.8, 42, 5, 6, 73, 45, 23, 65, 53, 1, 3, 34, 5, 9, 76, 8.6, 63, 8, 2, 3, 9, 64, 4.5, 2.2, 6, 6.2, 3, 3.7, 3, 5, 6, 73, 4.5, 23, 6.5, 53, 1, 3, 34, 5, 9, 76, 8.6, 63, 8, 2, 3, 9, 64};
        QuickSort sorter = new QuickSort(testArray);
        Arrays.sort(testArray2);
        String a = Arrays.toString(testArray2);
        String b = Arrays.toString(testArray);
        assertEquals(a,b);

        //Case 2
        double[] doubles = new double[100];
        Random r = new Random();
        for (int i = 0; i < doubles.length; i++) { //Generates a randomly distributed array of doubles
            doubles[i] = r.nextGaussian();
        }
        double[] duplicate = doubles;
        QuickSort randSorter = new QuickSort(doubles);
        Arrays.sort(duplicate);
        String c = Arrays.toString(duplicate);
        String d = Arrays.toString(doubles);
        assertEquals(c,d);

        //Case 3
        double[] doubles2 = new double[100];
        Random s = new Random();
        for (int i = 0; i < doubles2.length; i++) {
            doubles2[i] = s.nextGaussian();
        }
        double[] duplicate2 = doubles2;
        QuickSort randSorter2 = new QuickSort(doubles2);
        Arrays.sort(duplicate2);
        String e = Arrays.toString(duplicate2);
        String f = Arrays.toString(doubles2);
        assertEquals(e,f);
    }

    @org.junit.Test
    public void max() {
        double[] someArray = {100, 101, 101001, 1010101010};
        double correctMax = 1010101010;
        assertTrue(correctMax == FredStat.max(someArray));

        double[] anotherArray = {-1, -1, -10101, -1011, -101001101};
        double rightMax = -1;
        assertTrue(rightMax == FredStat.max(anotherArray));
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void nullMax(){
        double[] nullArray = {};
        FredStat.max(nullArray);
    }

    @org.junit.Test
    public void min() {
        double[] someArray = {100, 101, 101001, 1010101010};
        double correctMin = 100;
        assertTrue(correctMin == FredStat.min(someArray));

        double[] anotherArray = {-1, -1, -10101, -1011, -101001101};
        double rightMin = -101001101;
        assertTrue(rightMin == FredStat.min(anotherArray));
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void nullMin(){
        double[] nullArray = {};
        FredStat.min(nullArray);
    }

    @org.junit.Test
    public void range() {
        double[] someArray = {0, 100};
        double correctRange = 100;
        assertTrue(correctRange == FredStat.range(someArray));

        double[] anotherArray = {-100, 100};
        double rightRange = 200;
        assertTrue(rightRange == FredStat.range(anotherArray));
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void nullRange(){
        double[] nullArray = {};
        FredStat.range(nullArray);
    }
}