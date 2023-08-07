import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWordFinder {
    public void launch(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);

        String arrayLength =  scanner.next();
        isInteger(arrayLength);

        ArrayList<String> worlList = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(arrayLength); i++){
            System.out.print("Введите слово: ");
            worlList.add(scanner.next());
        }
        System.out.printf("Самое длинное слово в массиве: %s", findLongestWord(worlList));
        scanner.close();

    }

    public static String findLongestWord(ArrayList<String> words) {
        if (words == null || words.isEmpty()) {
            return null;
        }
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });
        return words.get(0);
    }

    public static void isInteger(String number){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(number);
        if (!matcher.matches()) {
            throw new ArithmeticException("Неверный формат строки, строка может содержать только положительные числа");
        }
    }
}
