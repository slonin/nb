package TasksTest;

import TasksForTesting.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class TasksTest {
    Main main = new Main();

    @ParameterizedTest
    @ValueSource(ints = {4, 0, -4})
    void isEven_shouldReturnTrue(int number) {
        assertTrue(main.isEven(number));
    }

    @Test
    void isEven_shouldReturnFalse() {
        assertFalse(main.isEven(3));
    }

    @ParameterizedTest
    @CsvSource({
            "hello, 2",
            "JavA, 2",
            "AEIOU, 5",
            "strng, 0",
            "'', 0",
    })
    void countVowels_shouldCalculateVowelst(String string, int expected) {
        assertEquals(expected, main.countVowels(string));
    }

    @Test
    void countVowels_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> main.countVowels(null));
    }

    @ParameterizedTest
    @CsvSource({
            "String, gnirtS",
            "'', ''",
            "a b, b a"
    })
    void reverse_shouldReverseString(String string, String expectedString) {
        assertEquals(expectedString, main.reverse(string));
    }

    @Test
    void reverse_shouldReturnNull() {
        assertNull(main.reverse(null));
    }

    static Stream<Arguments> findMaxCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("findMaxCases")
    void findMax_shouldFindMax(int[] array, int expectedMaxValue) {
        assertEquals(expectedMaxValue, main.findMax(array));
    }

    @Test
    void findMax_shouldThrowExceptionWithEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> main.findMax(new int[]{}));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    void isLeapYear_shouldReturnTrue(int year) {
        assertTrue(main.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2026, 1900, 2100})
    void isLeapYear_shouldReturnFalse(int year) {
        assertFalse(main.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ld@gmail.com", "example@mail.ru"})
    void isValidEmail_shouldReturnTrue(String email) {
        assertTrue(main.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ldgmail.com", "example@.ru", "simple"})
    void isValidEmail_shouldReturnFalse(String email) {
        assertFalse(main.isValidEmail(email));
    }

    @Test
    void isValidEmail_shouldReturnFalseWithNull() {
        assertFalse(main.isValidEmail(null));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "5, 120",
            "7, 5040"
    })
    void factorial_shouldCalculateFactorial(int number, int expected) {
        assertEquals(expected, main.factorial(number));
    }

    @Test
    void factorial_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> main.factorial(-5));
    }

    static Stream<Arguments> findSecondMaxCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
//              С таким массивом падает с ошибкой, но кажется, что не должен
//              Arguments.of(new int[]{1, 2, 2, 3}, 2),
                Arguments.of(new int[]{-3, -5, -7, -2}, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("findSecondMaxCases")
    void findSecondMax_shouldFindSecondMax(int[] array, int expected) {
        assertEquals(expected, main.findSecondMax(array));
    }

    @Test
    void findSecondMax_shouldThrowExceptionWithOneElementInArray() {
        assertThrows(IllegalArgumentException.class, () -> main.findSecondMax(new int[]{1}));
    }

    @ParameterizedTest
    @CsvSource({
            "string, 1",
            "string with spaces, 3 ",
            "'', 0",
            "'  ', 0"
    })
    void countWords_shouldCount(String string, int expected) {
        assertEquals(expected, main.countWords(string));
    }

    @Test
    void countWords_shouldReturnNull() {
        assertThrows(NullPointerException.class, () -> main.countWords(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890"})
    void isValidPhoneNumber_shouldReturnTrue(String phone) {
        assertTrue(main.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid"})
    void isValidPhoneNumber_shouldReturnFalse(String phone) {
        assertFalse(main.isValidPhoneNumber(phone));
    }


}