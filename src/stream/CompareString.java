package stream;

import java.util.function.BinaryOperator;

public class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String x, String y) {
        return x.length() >= y.length() ? x : y;
    }
}