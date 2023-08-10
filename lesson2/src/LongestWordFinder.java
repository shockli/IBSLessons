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

        ArrayList<String> sortWordList = sortWordList(worlList);
        int maxLength = sortWordList.get(0).length();

        ArrayList<String> longestWords = new ArrayList<>();

        for (String word : sortWordList) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            } else {
                break; // Поскольку список отсортирован, можно выйти после достижения слов меньшей длины
            }
        }

        System.out.printf("Самое длинное слово в массиве: %s", longestWords.toString().replaceAll("\\[|\\]", ""));
        scanner.close();

    }

    public static ArrayList<String> sortWordList(ArrayList<String> words) {
        if (words == null || words.isEmpty()) {
            return null;
        }
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });
        return words;
    }

    public static void isInteger(String number){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(number);
        if (!matcher.matches()) {
            throw new ArithmeticException("Неверный формат строки, строка может содержать только положительные числа");
        }
    }
}
