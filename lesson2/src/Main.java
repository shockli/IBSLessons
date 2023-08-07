import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите утилиту:\n" +
                "1 - калькулятор\n" +
                "2 - поиск самого длинного слова в массиве"
        );
        String mode = scanner.next();
        if("1".equals(mode)){
            Calculator calculator = new Calculator();
            calculator.launch(args);
        }else if("2".equals(mode)){
            LongestWordFinder longestWordFinder = new LongestWordFinder();
            longestWordFinder.launch(args);
        }else{
            System.out.println("Утилита не найдена!");
        }

        scanner.close();
    }
}