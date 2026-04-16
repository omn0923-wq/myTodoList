package stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sumValue = Arrays.stream(arr).sum();
        System.out.println(sumValue);
        System.out.println("count: " + Arrays.stream(arr).count());
        Arrays.stream(arr).forEach(x -> System.out.println(x));
    }
}