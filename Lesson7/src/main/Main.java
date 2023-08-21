import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        Boolean hasErrorMessage = false;

        while (true) {
            try {
                //задержка необходима для того, чтобы в случае ошибки успел вывестись текст ошибки и
                //только потом запускался следующий цикл калькулятора
                if(hasErrorMessage){
                    Thread.sleep(600);
                }
                System.out.print("Введите первое дробное число: ");

                String num1 = scanner.next().replaceAll(",", ".");
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

                double result = calculator.calculate(num1, num2, operation);
                System.out.printf("Результат выполнения: %.4f%n%n", result);
                hasErrorMessage = false;
            } catch (Exception e) {
                System.err.printf("Ошибка: %s%n", e.getMessage());
                hasErrorMessage = true;
            }
        }
    }
}