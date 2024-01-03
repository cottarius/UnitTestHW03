import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathFunctionTest {
    private MathFunction mathFunction;

    @BeforeEach
    void setup() {
        mathFunction = new MathFunction();
    }

    @Test
    public void testEvenOddNumber_EvenTrue() {
        boolean isEven = mathFunction.evenOddNumber(4);
        Assertions.assertTrue(isEven);
    }
    @Test
    public void testEvenOddNumber_OddFalse() {
        boolean isEven = mathFunction.evenOddNumber(7);
        Assertions.assertFalse(isEven);
    }
    @Test
    void numberInInterval_From25to100_True() {
        boolean isInInterval = mathFunction.numberInInterval(50);
        Assertions.assertTrue(isInInterval);
    }
    @Test
    void numberInInterval_LessThan25_False() {
        boolean isInInterval = mathFunction.numberInInterval(10);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_EqualTo25_False() {
        boolean isInInterval = mathFunction.numberInInterval(25);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_GreaterThan100_False() {
        boolean isInInterval = mathFunction.numberInInterval(150);
        Assertions.assertFalse(isInInterval);
    }
}
