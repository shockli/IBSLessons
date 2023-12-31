import java.util.Random;

public class SwapElements {
    public static void launch() {
        int[] array = new int[20];
        Random random = new Random();

        // Заполнение массива случайными целыми числами от -10 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        // Поиск максимального отрицательного и минимального положительного элементов
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int maxNegativeIndex = -1;
        int minPositiveIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] > maxNegative) {
                maxNegative = array[i];
                maxNegativeIndex = i;
            }
            if (array[i] > 0 && array[i] < minPositive) {
                minPositive = array[i];
                minPositiveIndex = i;
            }
        }

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Поменять местами максимальный отрицательный и минимальный положительный элементы
        if (maxNegativeIndex != -1 && minPositiveIndex != -1) {
            int temp = array[maxNegativeIndex];
            array[maxNegativeIndex] = array[minPositiveIndex];
            array[minPositiveIndex] = temp;
        }

        System.out.println("\nИзмененный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

