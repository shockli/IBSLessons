import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)  {
        String fileName = "Lesson5/resources/input.txt"; // ������� ���� � ������ �������� �����

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder content = new StringBuilder();

            //��������� ����� �� �����.
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }

            reader.close();

            String[] words = content.toString().split(" ");

            //������������� � ���������� �������.
             Arrays.sort(words);

            TreeMap<String, Integer> wordCount = new TreeMap<>();

            //��������� ������� ��� ������ ����� ����������� � �����
            for (String word : words) {
                word = word.toLowerCase(); // ������ ������� ��� ����� ���� ��� ����� ��������
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            String mostCommonWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                String word = entry.getKey();
                int count = entry.getValue();
                //������� ���������� �� �������
                System.out.println(word + ": " + count);

                if (count > maxCount) {
                    mostCommonWord = word;
                    maxCount = count;
                }else if(count == maxCount){
                    mostCommonWord += ", " + word;
                }
            }

            System.out.println("����� ������ �����: " + mostCommonWord + ", ���������� ����������: " + maxCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}