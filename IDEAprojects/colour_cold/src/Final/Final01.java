package Final;

/*
    final关键字代表最终，不可改变的

    常见四种用法：
    1.可以用来修饰一个类
    格式：
    public final class 类名称 {
        ...
    }
    含义：当前这个类不能有任何的子类（太监类）
    注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子）

    2.可以用来修饰一个方法
    当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写。
    格式：
    修饰符 final 返回值类型 方法名称(参数列表) {
        方法体
    }
    注意事项：对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾。
    3.还可以用来修饰一个局部变量
    4.还可以用来修饰一个成员变量
 */
public class Final01 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10
        num1 = 20;
        System.out.println(num1);//20

        //一旦使用final修饰局部变量，那么这个变量就不能进行更改
        //"一次赋值，终生不变"
        final int num2 = 200;
        System.out.println(num2);//200
        //错误写法，不能改变。
//        num2 = 100;

        //正确写法：只要保证有唯一一次赋值即可
        final int num3;
        num3 = 10;
        System.out.println("===============================");

        //对于基本类型来说，不可变的是变量当中的数据不可改变
        //对于引用类型来说，不可改变的是变量当中的地址值不可改变
        Student stu1 = new Student("冷色调");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        stu1 = new Student("colour-cold");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        System.out.println("=============================");
        final Student stu2 = new Student("也是冷色调");
        System.out.println(stu2);
        System.out.println(stu2.getName());
        //错误写法！final的引用类型变量，其中的地址值不可改变
//        stu2 = new Student("123456")；
        stu2.setName("还是冷色调");
        System.out.println(stu2);
        System.out.println(stu2.getName());
    }
}
