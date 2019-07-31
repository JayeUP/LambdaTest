package com.lambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * <h1>练习：集合信息筛选</h1>
 * 数组当中有多条“姓名+性别”的信息如下，请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合
 * ArrayList 中，需要同时满足两个条件：
 * 1. 必须为女生；
 * 2. 姓名为4个字。
 */
public class Demo17PracticePredicate {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> list = filter(s -> "女".equals(s.split(",")[1]),
                s -> s.split(",")[0].length() == 4,
                array);
        System.out.println(list.toString());
    }

    private static List<String> filter(Predicate<String> one,Predicate<String> two,String[] array) {
        List<String> list = new ArrayList<>();
        for (String info : array) {
            if (one.and(two).test(info)){
                list.add(info);
            }
        }
        return list;
    }
}
