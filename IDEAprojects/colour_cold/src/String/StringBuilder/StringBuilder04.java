package String.StringBuilder;

/*
    StringBuilder和String可以相互转换
        String->StringBuilder可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
        StringBuilder->String可以使用StringBuilder中的toString方法
            public String toString()   将当前StringBuilder对象转换为Sting对象
 */
public class StringBuilder04 {
    public static void main(String[] args) {
        //String->StringBuilder
        String str = "colour";
        StringBuilder sb = new StringBuilder(str);
        sb.append("-cold");
        System.out.println(sb);
    }
}
