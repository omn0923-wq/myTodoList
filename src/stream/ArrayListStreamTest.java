package stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("Adward");
        list.add("Jack");
        // 전체 출력
        list.forEach(x -> System.out.println(x));
        System.out.println("======");
        // 정렬 후에 출력
        list.stream().sorted().forEach(x -> System.out.println(x));
        System.out.println("======");
        // 각 문자열의 길이를 출력
        list
                .stream()
                .map(x -> x.length())
                .filter(x -> x >= 5)
                .forEach(x -> System.out.println(x));
        System.out.println("======");
        // 정수 리스트 합계
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            intList.add(i);
        }
        int sum = intList.stream()
                .mapToInt(x -> x.intValue())
                .sum();
    }
}