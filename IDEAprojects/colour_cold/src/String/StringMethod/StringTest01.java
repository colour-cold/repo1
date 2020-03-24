package String.StringMethod;
/*
    定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串，
    格式参照如下：[world1#world2#world3]
 */


public class StringTest01 {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4"};
        compose(array);
    }

    public static void compose(String[] array) {
        String str1 = "#world";
        String result = null;
        System.out.print("[world");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                result = array[i];
            } else if (i == array.length - 1) {
                result = result.concat(str1.concat(array[i]).concat("]"));
            } else {
                result = result.concat(str1.concat(array[i]));
            }
        }
        System.out.print(result);
    }
}
