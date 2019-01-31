import static org.junit.Assert.*;

public class TypeModeTest {

    @org.junit.Test
    public void findMode() {
        int[] someArray = {4, 6, 8, 5, 74, 14, 13, 5, 16, 16, 4};
        int[] correctMode = {4, 2};
        int[] testMode = TypeMode.findMode(someArray);
        assertArrayEquals(correctMode, testMode);
        int[] someArray2 = {4, 4, 6, 8, 5, 74, 14, 13, 5, 16, 16, 4};
        int[] correctMode2 = {4, 3};
        int[] testMode2 = TypeMode.findMode(someArray2);
        assertArrayEquals(correctMode2, testMode2);
        int[] someArray3 = {};
        int[] correctMode3 = {0, 0};
        int[] testMode3 = TypeMode.findMode(someArray3);
        assertArrayEquals(correctMode3, testMode3);

    }
}