package LambdaExpressionExp_2;

import java.util.*;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        System.out.println("--- Array List Print ---");
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        strings.forEach(s -> System.out.println(s));


        
        List<Integer> numbers = Arrays.asList(8, 1, 2, 5, 7, 9, 4, 6, 3, 0);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println("--- Sorted Number List with for ---");
        for (int i = 0; i < sortedNumbers.size(); i++) {
            System.out.println(sortedNumbers.get(i));
        }

        System.out.println("--- Sorted Number List with Lambda ---");
        sortedNumbers.forEach(s -> System.out.println(s));

        


        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> sortedWords = words.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        System.out.println("--- Sorted Words List with for ---");
        for (int i = 0; i < sortedWords.size(); i++) {
            System.out.println(sortedWords.get(i));
        }

        System.out.println("--- Sorted Words List with Lambda ---");
        sortedWords.forEach(s -> System.out.println(s));




        System.out.println("--- HashMap Print with Lambda ---");
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.forEach((k, v) -> System.out.println(k + " -> " + v));


        System.out.println("--- List Filter EvenNumber with Lambda ---");
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbersList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);



        System.out.println("--- String List Convert To Integer List with Lambda ---");
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integerList = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(integerList);

        System.out.println("--- Array UpperCase with Lambda ---");
        List<String> wordList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> uppercaseWords = wordList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseWords);

        System.out.println("--- Array UpperCase with Lambda ---");
        List<String> wordList2 = Arrays.asList("appLe", "baNaNa", "CheRry", "dAte", "elDerBerry");
        List<String> lowercaseWords = wordList2.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowercaseWords);

        System.out.println("--- Use Reduce ---");
        List<Integer> numberList2 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numberList2.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);


        System.out.println("--- Grouping Length with Lambda ---");
        List<String> wordList3 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> groups = wordList3.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groups);


        System.out.println("--- Handle Null Value with Lambda ---");
        List<String> list = Arrays.asList("apple", null, "banana", "cherry", null);
        List<String> filteredList = list.stream()
                .filter(s -> s != null)
                .collect(Collectors.toList());
        System.out.println(filteredList);


        System.out.println("--- ParallelStream ---");
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum2 = numberList.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum2);


        System.out.println("--- Optional Class with Lambda ---");
        Optional<String> optional = Optional.of("testsss");
        Optional<Integer> result = optional.map(s -> s.length());
        System.out.println(result.get());
    }
}
