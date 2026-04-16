package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TravelCustomerMain {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("이순신", 40, 100));
        customerList.add(new TravelCustomer("김유신", 20, 100));
        customerList.add(new TravelCustomer("홍길동", 13, 50));

        // 1. 전체 명단 출력
        System.out.println("= 1. 고객 명단 추가된 순서대로 출력 =");
        customerList.forEach(x -> System.out.println(x));
        // 2. 이름만 출력
        System.out.println("= 2. 이름만 출력 =");
       customerList.stream()
               .map(x -> x.getName())
               .forEach(x -> System.out.println(x));
        // 3. 총 여행 비용
        System.out.println("= 3. 총 여행 비용 =");
        int totalPrice = customerList.stream()
                .mapToInt(x -> x.getPrice())
                .sum();
        System.out.println("총 경비: " + totalPrice);
        // 4. 20세 이상 이름만 오름차순
        System.out.println("= 4. 20세 이상 이름만 오름차순 =");;
        customerList.stream()
                .filter(x -> x.getAge() >= 20)
                .map(x -> x.getName())
                .sorted()
                .forEach(x -> System.out.println(x));
        // 5. 20세 이상 전체 내림차순
        System.out.println("= 5. 20세 이상 전체 내림차순 =");
        customerList.stream()
                .filter(x -> x.getAge() >= 20)
                .sorted(Comparator.comparing(TravelCustomer::getName).reversed())
                // Comparator.comparing(기준 필드) -> 오름차순
                // .reversed()를 붙이면 내림차순으로 변함.
                .forEach(x -> System.out.println(x));
    }
}
