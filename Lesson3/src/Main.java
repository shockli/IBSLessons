import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите утилиту:\n" +
                "1 - меняет отрицательный и минимальный положительный элементы массива\n" +
                "2 - формируется сладкий подарок"
        );
        String mode = scanner.next();
        if("1".equals(mode)){
            SwapElements.launch();
        }else if("2".equals(mode)){
            GiftMaker.launch();
        }else{
            System.out.println("Утилита не найдена!");
        }

        scanner.close();
    }
}