package stream;

import java.util.Arrays;

// 누적, 집계를 할 때 사용하는 연산
public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~~~", "hello", "Good morining", "반갑습니다."};
        String longGreeting = "";
        int longText = greetings[0].length();
        int index = -1;
        for (int i = 0; i < greetings.length; i++) {
            if (greetings[i].length() > longText) {
                longText = greetings[i].length();
                index = i;
            }
        }
        System.out.println(greetings[index]);
        // 1. 람다 형식으로 구현
        String result = Arrays.stream(greetings)
                .reduce("", (x, y) -> {
//                    if (x.length() >= y.length()) return x;
//                      else  return y;
                    return x.length() >= y.length() ? x : y;
                });
        System.out.println(result);
        // 2. 구현 클래스 형식으로 구현
        result = Arrays.stream(greetings)
                .reduce(new CompareString())
                .get();
    }
}