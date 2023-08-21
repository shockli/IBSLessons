/**
 * Программа для сложения дробных чисел, введенных пользователем в консоли.
 */
public class Calculator implements BasicOperations {
    /**
     * Метод для сложения двух дробных чисел.
     * @author Alexandr Pautov
     * @param a Первое дробное число.
     * @param b Второе дробное число.
     * @param с Тип операции (1 - сложение, 2 -вычитание, 3- деление, 4-умножение )
     * @return Сумма двух дробных чисел.
     */
    public double calculate(String num1, String num2, String operation) throws Exception {
        try {
            switch (operation) {
                case "1":
                    return getSum(num1, num2);
                case "2":
                    return getSubtraction(num1, num2);
                case "3":
                    return getDivision(num1, num2);
                case "4":
                    return getMultiplication(num1, num2);
                default:
                    throw new IllegalArgumentException("неподдерживаемая операция: " + operation);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("некорректное число во входных данных: " + e.getMessage());
        } catch (ArithmeticException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }
}