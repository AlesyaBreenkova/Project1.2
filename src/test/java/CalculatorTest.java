import StaticClassesEnumsExeptions.Calculator;
import StaticClassesEnumsExeptions.Calculator.Type;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeAll
    public static void classSetUp() {
        System.out.println("Before-all method");

    }

    @AfterAll
    public static void classTearDown() {
        System.out.println("After-all method");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Before-each method");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("After-each method");
    }

    static Stream<Arguments> dataProvider() {

        return Stream.of(

                Arguments.of(2, 2, 4, Type.SUMMARY),
                Arguments.of(2, 2, 1, Type.DIVISION),
                Arguments.of(2, 2, 4, Type.MULTIPLICATION),
                Arguments.of(4, 2, 2, Type.SUBSTRACTION)


        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest(double a, double b, double expectedResult, Type type) {

        double actualResult = Calculator.calculate(a,b,type);
        assertEquals(expectedResult, actualResult);


    }


    @Test

    public void summaryTest() {
        double a = 5;
        double b = 6;
        double expectedResult = 11;

        double actualResult = Calculator.calculate(a, b, StaticClassesEnumsExeptions.Calculator.Type.SUMMARY);

        assertEquals(expectedResult, actualResult, "Summary result is incorrect");
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 27, 10985974, -907778979})

    public void summaryParamsTest(int a) {

        double b = 6;
        double expectedResult = b + a;

        double actualResult = Calculator.calculate(a, b, Type.SUMMARY);
        assertEquals(expectedResult, actualResult, "Actual result is incorrect");
    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)

    public void calculatorTypeTests(Calculator.Type type) {
        double a = 25;
        double b = 2;


        double actualResult = Calculator.calculate(a, b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult > 0);


    }

    @Test

    public void divisionTest() {

        double a = 10;
        double b = 2;
        double expectedResult = 5;

        double actualResult = Calculator.calculate(a, b, StaticClassesEnumsExeptions.Calculator.Type.DIVISION);
        //assertNull(actualResult, "Null value has been returned");
        assertNotNull(actualResult, "Actual result is valid");
        assertEquals(expectedResult, actualResult, "Division result is in correct");
        assertTrue(expectedResult == actualResult);
        assertTrue(actualResult > 0);
        assertFalse(actualResult == 0);

    }

    @Test
    @DisplayName("Nullpointer exception test")

    public void errorTest() {

        double a = 10;
        double b = 2;
        double expectedResult = 5;

        assertThrows(NullPointerException.class, () -> {
            Calculator.calculate(a, b, null);
        });
    }

}



