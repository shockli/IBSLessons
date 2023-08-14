import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface BasicOperations {

    default double getDivision(String number1, String number2){
        return  Double.parseDouble(number1) - Double.parseDouble(number2);
    }

    default double getSum(String number1, String number2){
        return  Double.parseDouble(number1) + Double.parseDouble(number2);
    }

    default double getSubtraction(String number1, String number2){
        return  Double.parseDouble(number1) - Double.parseDouble(number2);
    }

    default double getMultiplication(String number1, String number2){
        return  Double.parseDouble(number1) * Double.parseDouble(number2);
    }

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
            throw new ArithmeticException("Неверный формат строки, введите значение в виде 123.4567");
        }
    }
}
