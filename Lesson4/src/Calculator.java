import java.util.Scanner;

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

    public void launch(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое дробное число: ");
        String num1 =  scanner.next().replaceAll(",", ".");
        BasicOperations.checkIsNumber(num1);

        System.out.print("Введите второе дробное число: ");
        String num2 = scanner.next().replaceAll(",", ".");
        BasicOperations.checkIsNumber(num2);

        System.out.println("Выберите тип операции:\n" +
                "1 - сложение\n" +
                "2 - вычитание\n" +
                "3 - деление\n" +
                "4 - умножение");

        String operation = scanner.next();
        switch (operation) {
            case "1":
                System.out.printf("Сумма: %.4f%n", getSum(num1, num2));
                break;
            case "2":
                System.out.printf("Разность: %.4f%n", getSubtraction(num1, num2));
                break;
            case "3":
                System.out.printf("Результат деления: %.4f%n", getDivision(num1, num2));
                break;
            case "4":
                System.out.printf("Результат умножения: %.4f%n", getMultiplication(num1, num2));
                break;
            default:
                System.out.println("Операция не найдена!");
        }
        scanner.close();
    }
}