import static org.junit.Assert.*;

public class FactorialTest {

    @org.junit.Test
    public void factorial() {
        assertTrue(Factorial.calculation(5) == 120);
        assertTrue(Factorial.calculation(0) == 1);
        assertTrue(Factorial.calculation(1) == 1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void IllegalArgument() {
        Factorial.calculation(-1);
    }
}