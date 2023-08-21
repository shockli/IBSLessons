import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Интерфейс, предоставляющий базовые арифметические операции и проверку числовых строк.
 */
public interface BasicOperations {

    /**
     * Выполняет деление двух чисел.
     *
     * @param number1 Первое число.
     * @param number2 Второе число.
     * @return Результат деления.
     * @throws ArithmeticException Если происходит деление на ноль.
     */
    default double getDivision(double number1, double number2){
        double result = number1  / number2;
        if (Double.isFinite(result)) {
            return  result;
        } else {
            throw new ArithmeticException("деление на ноль.");
        }
    }

    /**
     * Выполняет сложение двух чисел.
     *
     * @param number1 Первое число.
     * @param number2 Второе число.
     * @return Результат сложения.
     */
    default double getSum(double number1, double number2){
        return  number1 + number2;
    }

    /**
     * Выполняет вычитание двух чисел.
     *
     * @param number1 Первое число.
     * @param number2 Второе число.
     * @return Результат вычитания.
     */
    default double getSubtraction(double number1, double number2){
        return number1 - number2;
    }

    /**
     * Выполняет умножение двух чисел.
     *
     * @param number1 Первое число.
     * @param number2 Второе число.
     * @return Результат умножения.
     */
    default double getMultiplication(double number1, double number2){
        return number1 * number2;
    }

    /**
     * Проверяет, является ли переданная строка числовым значением.
     *
     * @param number Строка для проверки.
     * @throws NumberFormatException Если строка не соответствует числовому формату.
     */
    static void checkIsNumber(String number){
        /*
            ^ - начало строки.
            -? - необязательный знак минуса для отрицательных чисел.
            \d+ - одна или более цифр (целая часть числа).
            (\.\d+)? - необязательная десятичная часть, состоящая из точки . и одной или более цифр.
            $ - конец строки.
        */
        Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
        Matcher matcher = pattern.matcher(number);
        if (!matcher.matches()) {
            throw new NumberFormatException("Неверный формат строки, введите значение в виде 123.4567");
        }
    }
}
