package com.stream.test;

import java.util.ArrayList;
import java.util.List;

/**
 * allMatch：Stream 中全部元素符合传入的 predicate，返回 true
 * anyMatch：Stream 中只要有一个元素符合传入的 predicate，返回 true
 * noneMatch：Stream 中没有一个元素符合传入的 predicate，返回 true
 * 它们都不是要遍历全部元素才能返回结果。例如 allMatch 只要一个元素不满足条件，就 skip 剩下的所有元素，返回 false。
 */
public class Demo13StreamMatch {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "name" + 1, 10));
        persons.add(new Person(2, "name" + 2, 21));
        persons.add(new Person(3, "name" + 3, 34));
        persons.add(new Person(4, "name" + 4, 6));
        persons.add(new Person(5, "name" + 5, 55));
        boolean isAllAdult = persons.stream().allMatch(p -> p.getAge() > 18);
        System.out.println("All are adult? " + isAllAdult);
        boolean isThereAnyChild  = persons.stream().anyMatch(p -> p.getAge() < 12);
        System.out.println("Any child? " + isThereAnyChild);
    }
}
