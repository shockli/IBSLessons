package src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Программа для сложения дробных чисел, введенных пользователем в консоли.
 */
public class Main {

    /**
     * Метод для сложения двух дробных чисел.
     * @author Alexandr Pautov
     * @param a Первое дробное число.
     * @param b Второе дробное число.
     * @return Сумма двух дробных чисел.
     */

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое дробное число: ");
        String num1 =  scanner.next().replaceAll(",", ".");
        checkNumber(num1);

        System.out.print("Введите второе дробное число: ");
        String num2 = scanner.next().replaceAll(",", ".");
        checkNumber(num2);

        // Вычисление суммы
        double sum = Double.parseDouble(num1) + Double.parseDouble(num2);

        // Вывод результата с округлением до 4 знаков после запятой
        System.out.printf("Сумма: %.4f%n", sum);

        scanner.close();
    }

    public static void checkNumber(String number){
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
            throw new ArithmeticException("Неверный формат строки, введите значение в виде 123.4567");
        }

    }
}