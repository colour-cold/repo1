package Generic;

public class Generic03MethodTest {
    public static void main(String[] args) {
        Generic03Method gc = new Generic03Method();
        gc.method01("abc");
        gc.method01(123);
        gc.method01(0.388);
        gc.method01(true);

        gc.method02(1);//静态方法，不建议创建对象使用

        System.out.println("========================");

        //静态方法,通过类名.方法名(参数)可以直接使用
        Generic03Method.method02("abc");
        Generic03Method.method02(1);


    }
}
