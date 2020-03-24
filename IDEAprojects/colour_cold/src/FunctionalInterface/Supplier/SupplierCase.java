package FunctionalInterface.Supplier;

import java.util.function.Supplier;

/*
    求数组中元素的最大值
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值
        提示：接口的泛型请使用java.util.Integer类
 */
public class SupplierCase {
    //定义一个方法，用于获取int数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer
    public static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int类型的数组，并赋值
        int[] array = {1, 5, 6, 3, 2, 8, 0};
        Integer result = getInteger(() -> {
            //调用getInteger方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
            int max = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        });
        System.out.println(result);
    }
}
