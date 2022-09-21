import lesson8.DayOfTheWeek;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DaysOfTheWeekTest {

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

                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday"),
                Arguments.of(0, "The number should be equal or larger than 1"),
                Arguments.of(8, "The number should be equal or smaller than 7")
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest(Integer dayNumber, String day) {

        DayOfTheWeek days = new DayOfTheWeek();
        String actualResult = days.getDay(dayNumber);

        assertEquals(day, actualResult);
    }


    @Test
    @DisplayName("Testing exception when argument is null")
    public void ExceptionTest() {

        DayOfTheWeek days = new DayOfTheWeek();
        Integer dayNumberNull = null;

        assertThrows(NullPointerException.class, () -> {
            days.getDay(dayNumberNull);
        });
    }



}



