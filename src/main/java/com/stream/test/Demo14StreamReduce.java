package com.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Demo14StreamReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 求和1
        /*Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum);*/

        // 求和2
        /*Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println(sum.get());*/

        IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .limit(3)
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));

        System.out.println();
        System.out.println("*********************************");

//        A7B7C7
//        A8B8C8
//        A9B9C9
        IntStream.range(1, 10)
                .skip(6)
                .peek(x -> System.out.print("\nA" + x))
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));

        System.out.println();
        System.out.println("*********************************");

//        A1
//        A2
//        A3
//        A4
//        A5
//        A6
//        A7B7C7
//        A8B8C8
//        A9B9C9
        IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .skip(6)
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));

        System.out.println();
        System.out.println("*********************************");

//        A1B1
//        A2B2
//        A3B3
//        A4B4
//        A5B5
//        A6B6
//        A7B7C7
//        A8B8C8
//        A9B9C9
        IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .peek(x -> System.out.print("B" + x))
                .skip(6)
                .forEach(x -> System.out.print("C" + x));
    }
}
