package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        String[] words = {"Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Один"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        System.out.println(map);
        System.out.println("");

        System.out.println("Задание 2:");

        Phonebook pb = new Phonebook();

        pb.add("Семенов", "+79888777666");
        pb.add("Иванов", "+79777666555");
        pb.add("Сидоров", "+79666555444");
        pb.add("Сидоров", "+79555444333");

        System.out.println(pb.get("Сидоров"));
    }
}