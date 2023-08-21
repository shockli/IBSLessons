import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    @Test
    public void testGetDivision() {
        BasicOperations basicOps = new Calculator();

        // Тест деления
        double result = basicOps.getDivision("10", "2");
        assertEquals(5.0, result, 0.0001); // 3-й аргумент — это дельта для сравнения значений с плавающей запятой.

        // Тест деления на ноль
        try {
            basicOps.getDivision("10", "0");
            fail("Должна быть выброшена ошибка - деление на ноль.");
        } catch (ArithmeticException e) {
            assertEquals("деление на ноль.", e.getMessage());
        }
    }

    @Test
    // Тест суммы
    public void testGetSum() {
        BasicOperations basicOps = new Calculator();
        double result = basicOps.getSum("5.5", "3.5");
        assertEquals(9.0, result, 0.0001);
    }

    @Test
    // Тест вычитания
    public void testGetSubtraction() {
        BasicOperations basicOps = new Calculator();
        double result = basicOps.getSubtraction("8", "4");
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    // Тест умножения
    public void testGetMultiplication() {
        BasicOperations basicOps = new Calculator();
        double result = basicOps.getMultiplication("2.5", "3");
        assertEquals(7.5, result, 0.0001);
    }

    @Test
    // Тест исключений
    public void testExceptions() throws Exception {
        try {
            BasicOperations.checkIsNumber("abc");
            fail("Должна быть выброшена ошибка - NumberFormatException");
        } catch (NumberFormatException e) {
            assertEquals("Неверный формат строки, введите значение в виде 123.4567", e.getMessage());
        }

        Calculator calculator = new Calculator();
        try {
            calculator.calculate("abc", "3", "5");
            fail("Должна быть выброшена ошибка - неподдерживаемая операция:");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("неподдерживаемая операция:"));
        }

        try {
            calculator.calculate("abc", "3", "1");
            fail("Должна быть выброшена ошибка - IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("некорректное число во входных данных:"));
        }

        try {
            calculator.calculate("21", "sdv", "1");
            fail("Должна быть выброшена ошибка - IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("некорректное число во входных данных:"));
        }
    }
}