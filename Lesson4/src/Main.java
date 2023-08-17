import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

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

        System.out.printf("Результат выполнения: %.4f%n", calculator.calculate(num1, num2, operation));

        scanner.close();
    }
}