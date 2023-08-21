import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите первое дробное число: ");
                String num1 = scanner.next().replaceAll(",", ".");

                System.out.print("Введите второе дробное число: ");
                String num2 = scanner.next().replaceAll(",", ".");

                System.out.println("Выберите тип операции:\n" +
                        "1 - сложение\n" +
                        "2 - вычитание\n" +
                        "3 - деление\n" +
                        "4 - умножение");
                String operation = scanner.next();

                double result = calculator.calculate(num1, num2, operation);
                System.out.printf("Результат выполнения: %.4f%n%n", result);
            } catch (Exception e) {
                System.err.printf("Ошибка: %s%n", e.getMessage());
            }
        }
    }
}