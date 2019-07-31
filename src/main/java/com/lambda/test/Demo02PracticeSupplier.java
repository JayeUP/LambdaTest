package com.lambda.test;


import java.util.function.Supplier;

/**
 * <h1>练习：求数组元素最大值</h1>
 * 使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。提示：接口的泛型请使用
 * java.lang.Integer 类。
 */
public class Demo02PracticeSupplier {
    // 定一个方法,方法的参数传递Supplier,泛型使用Integer
    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,52,333,23};

        // 调用getMax方法，参数传递Lambda
        int maxNum = getMax(() -> {
            // 计算数组的最大值
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组最大值为：" + maxNum);
    }
}
