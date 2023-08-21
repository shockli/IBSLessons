import java.util.ArrayList;

/**
 * Программа для сложения дробных чисел, введенных пользователем в консоли.
 */
public class Calculator implements BasicOperations {
    /**
     * Класс для создания калькулятора.
     * @author Alexandr Pautov
     * @param a Первое дробное число.
     * @param b Второе дробное число.
     * @param c Тип операции (1 - сложение, 2 - вычитание, 3 - деление, 4 - умножение).
     * @return double Результат вычисления калькулятора.
     * @throws IllegalArgumentException Если операция не поддерживается или входные данные некорректны.
     * @throws ArithmeticException Если возникает ошибка при арифметических вычислениях.
     */

    //переменная для хранения вызовов калькулятора
    private ArrayList<Calculation> calculations = new ArrayList<>();

    public double calculate(String num1_raw, String num2_raw, String operation) throws Exception {
        Calculation calculation = new Calculation(num1_raw,num2_raw,operation);
        try {
            BasicOperations.checkIsNumber(num1_raw);
            BasicOperations.checkIsNumber(num2_raw);
            double num1 = Double.parseDouble(num1_raw);
            double num2 = Double.parseDouble(num2_raw);

            switch (operation) {
                case "1":
                    calculation.setResult(getSum(num1, num2));
                    break;
                case "2":
                    calculation.setResult(getSubtraction(num1, num2));
                    break;
                case "3":
                    calculation.setResult(getDivision(num1, num2));
                    break;
                case "4":
                    calculation.setResult(getMultiplication(num1, num2));
                    break;
                default:
                    IllegalArgumentException exception = new IllegalArgumentException("неподдерживаемая операция: " + operation);
                    calculation.setError(exception);
                    throw exception;
            }
            return calculation.getResult();
        } catch (NumberFormatException e) {
            IllegalArgumentException exception = new IllegalArgumentException("некорректное число во входных данных: " + e.getMessage());
            calculation.setError(exception);
            throw exception;
        } catch (ArithmeticException e) {
            ArithmeticException exception = new ArithmeticException(e.getMessage());
            calculation.setError(exception);
            throw exception;
        }finally {
            calculations.add(calculation);
        }
    }
    public ArrayList<Calculation> getCalculatorExcecuteHistory(){
        return calculations;
    }
}