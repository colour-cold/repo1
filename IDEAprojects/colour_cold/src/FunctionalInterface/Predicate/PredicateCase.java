package FunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
    数组当中有多条“姓名+性别”的信息如下，通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中
    需要同时满足两个条件：
    1.必须为女生
    2.姓名为4个字
 */
public class PredicateCase {
    public static boolean checkArray(String[] array, Predicate<String[]> pre1, Predicate<String[]> pre2) {
        return pre1.and(pre2).test(array);
    }

    public static void main(String[] args) {
        //创建数组
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "冷色调,男"};
        //创建集合
        List<String> list = new ArrayList<>();
        //用循环判断数组的每个元素
        for (int i = 0; i < 4; i++) {
            final int a = i;//设置一个i的final备用值，因为使用Lambda表达式时，Lambda的线程去使用i时，i的线程可能已经将i销毁了，会有可能lambda去找一个不存在的值
            //判断数组的内容是否是女生，且名字是四个字
            //使用split将元素按照","分割形成新的数组，这个数组的0号索引就是名字，1号索引就是性别，然后分别对其进行相应判断
            boolean result = checkArray(array, array1 -> array[a].split(",")[1].equals("女"), array1 -> array[a].split(",")[0].length() == 4);
            //查看result值是
            System.out.println(result);
            if (result == true) {
                list.add(array[a]);
            }
        }
        System.out.println(list);
    }
}
