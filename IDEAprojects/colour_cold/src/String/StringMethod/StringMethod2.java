package String.StringMethod;

/*
    字符串的截取方法
    public String substring(int index)  截取从参数位置一直到字符串末尾，返回新字符串
    public String substring(int begin,int end)  截取从begin开始到end结束中间的字符串
    备注：[begin,end)为左闭右开区间。
 */
public class StringMethod2 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(4);
        System.out.println(str2);//oWorld
        String str3 = str1.substring(5, 10);
        System.out.println(str3);//World
    }
}
