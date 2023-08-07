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
     * @param с Тип операции (1 - сложение, 2 -вычитание, 3- деление, 4-умножение )
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

        System.out.println("Выберите тип операции:\n" +
                "1 - сложение\n" +
                "2 - вычитание\n" +
                "3 - деление\n" +
                "4 - умножение");

        String operation = scanner.next();
        switch (operation) {
            case "1":
                // Вычисление суммы
                double sum = Double.parseDouble(num1) + Double.parseDouble(num2);
                System.out.printf("Сумма: %.4f%n", sum);
                break;
            case "2":
                // Вычитание
                double subtraction = Double.parseDouble(num1) - Double.parseDouble(num2);
                System.out.printf("Разность: %.4f%n", subtraction);
                break;
            case "3":
                double division = Double.parseDouble(num1) / Double.parseDouble(num2);
                System.out.printf("Результат деления: %.4f%n", division);
                break;
            case "4":
                double multiplication  = Double.parseDouble(num1) * Double.parseDouble(num2);
                System.out.printf("Результат умножения: %.4f%n", multiplication);
                break;
            default:
                System.out.println("Операция не найдена!");
        }

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