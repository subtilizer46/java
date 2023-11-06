package com.stackroute.generics;

import java.util.Comparator;

public class LargestObject {
    public <T extends Number> T findLargestNumber(T numberOne, T numberTwo, T numberThree) {
        Comparator<T> comparator = (a, b) -> {
            double difference = a.doubleValue() - b.doubleValue();
            return Double.compare(difference, 0.0);
        };

        T largestNumber = numberOne;
        if (comparator.compare(numberTwo, largestNumber) > 0) {
            largestNumber = numberTwo;
        }
        if (comparator.compare(numberThree, largestNumber) > 0) {
            largestNumber = numberThree;
        }

        return largestNumber;
    }
}

