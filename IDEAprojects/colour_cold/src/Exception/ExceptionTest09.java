package Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    异常的注意事项
    多个异常如何处理
        1.多个异常分别处理
        2.多个异常一次捕获，多次处理
            注意事项:
                一个try多个catch，catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
        3.多个异常一次捕获一次处理
        4.运行时异常不处理交给JVM
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        //1.多个异常分别处理
        int[] array1 = new int[3];
        try {
            int a = array1[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3);
        try {
            int b = list1.get(3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + "2");
        }

        //2.多个异常一次捕获，多次处理
        int[] array2 = new int[3];

        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3);

        try {
            int a = array2[3];
            int b = list2.get(3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //3.多个异常一次捕获一次处理
        int[] array3 = new int[3];

        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 1, 2, 3);

        try {
            int a = array3[3];
            int b = list3.get(3);
        } catch (Exception e) {
            System.out.println(e);
        }

        //4.不处理
        int[] array4 = new int[3];
        int a = array4[3];

        List<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4, 1, 2, 3);
        int b = list4.get(3);
    }
}
