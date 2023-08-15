import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)  {
        String fileName = "Lesson5/resources/input.txt"; // Укажите путь к вашему входному файлу

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder content = new StringBuilder();

            //Прочитать слова из файла.
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }

            reader.close();

            String[] words = content.toString().split(" ");

            //Отсортировать в алфавитном порядке.
             Arrays.sort(words);

            TreeMap<String, Integer> wordCount = new TreeMap<>();

            //Посчитать сколько раз каждое слово встречается в файле
            for (String word : words) {
                word = word.toLowerCase(); // Убрать регистр для учета слов без учета регистра
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            String mostCommonWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                String word = entry.getKey();
                int count = entry.getValue();
                //Вывести статистику на консоль
                System.out.println(word + ": " + count);

                if (count > maxCount) {
                    mostCommonWord = word;
                    maxCount = count;
                }else if(count == maxCount){
                    mostCommonWord += ", " + word;
                }
            }

            System.out.println("Самое частое слово: " + mostCommonWord + ", количество повторений: " + maxCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}