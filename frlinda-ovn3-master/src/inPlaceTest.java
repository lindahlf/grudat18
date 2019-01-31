import static org.junit.Assert.*;

public class inPlaceTest {

    @org.junit.Test
    public void negativeFirst() {
        int[] testArray = {-1, 1, 1, 1, -1, -1, 1, -1};
        int[] fooArray = {-1, -1, -1, -1, 1, 1, 1, 1};
        assertArrayEquals(fooArray, inPlace.negativeFirst(testArray));
        int[] testArray2 = {-1, 1, -1, 1, -1, -1, 1, -1, 1, 1, -1, -1};
        int[] fooArray2 = {-1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1};
        assertArrayEquals(fooArray2, inPlace.negativeFirst(testArray2));
        int[] testArray3 = {0, 0, 0, 0};
        int[] fooArray3 = {0, 0, 0, 0};
        assertArrayEquals(fooArray3, inPlace.negativeFirst(testArray3));
        int[] testArray4 = {-3, 4, 5, -3, -5 , 3};
        int[] fooArray4 = {-3, -5, -3, 5, 4, 3};
        assertArrayEquals(fooArray4, inPlace.negativeFirst(testArray4));

    }
}