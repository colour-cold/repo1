package Object;

//java中比较两个字符串是否一致，不能用“==”
//只能调用String类的equals方法
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        System.out.println(s1 == s2);//false

        //String已经重写了Object中的equals方法，比较的是内容
        System.out.println(s1.equals(s2));//true
    }
}
