/**
 * Класс для хранения результатов вычисления калькулятора.
 * Этот класс содержит информацию о введенных числах, операции и результате вычисления.
 * а также может содержать информацию об ошибках, если таковые возникли во время вычисления.
 *
 * @author Alexandr Pautov
 * @param num1 Первое дробное число.
 * @param num2 Второе дробное число.
 * @param operation Тип операции (1 - сложение, 2 - вычитание, 3 - деление, 4 - умножение).
 * @param error Исключение, если возникла ошибка во время вычисления.
 */

public class Calculation {

    private String num1;
    private String num2;
    private double result;
    private String operation;
    private Exception error;

    public Calculation(String num1, String num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setError(Exception error) {
        this.error = error;
    }

    //Можно использовать для вывода всей истории вызовов калькулятора,
    //в режиме отладки, данный метод позволяет красиво отображать объект вызовов калькулятора - ArrayList<Calculation>
    @Override
    public String toString(){
        String text;
        String operationSymbol =
             (operation.equals("1")) ? " + " :
             (operation.equals("2")) ? " - " :
             (operation.equals("3")) ? " / " :
             (operation.equals("4")) ? " * " : " " + operation + " ";
        if (this.error != null) {
            text = num1 + operationSymbol + num2 + " - ошибка: " + error.getMessage();
        }else{
            text = num1 + operationSymbol + num2 + " = " + this.result;
        }
        return text;
    }
}
