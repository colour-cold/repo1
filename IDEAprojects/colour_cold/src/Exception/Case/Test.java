package Exception.Case;

import java.util.*;

/*
    要求：模拟注册，如果用户名已经存在，抛出异常并提示

    分析：
        1.使用数组保存已经注册过的用户名
        2.使用Scanner方法获取用户输入的注册的用户名
        3.定义一个方法，对用户输入的注册的用户名进行判断
 */
public class Test {
    static int i = 2;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();//创建集合存放注册的用户名

        //创建u1的用户名
        UserRegister u1 = new UserRegister();
        u1.setUserName(u1.method());

        //存入set集合
        list.add(u1.getUserName());
        System.out.println("注册成功，你的账号为:" + u1.getUserName());

        //创建u2的用户名
        UserRegister u2 = new UserRegister();
        u2.setUserName(u2.method());

        judgeMethod(list, u2);

        UserRegister u3 = new UserRegister();
        u3.setUserName(u3.method());

        judgeMethod(list, u3);
    }

    //定义一个方法，对用户输入的注册的用户名进行判断
    public static void judgeMethod(List<String> list, UserRegister u) {
        //判断如果list集合已经包含了此用户名则抛出异常，未包含则将此用户名加入集合并告注册成功
        while (list.size() < i) {
            if (!list.contains(u.getUserName())) {
                list.add(u.getUserName());
                System.out.println("注册成功，你的账号为:" + u.getUserName());
            } else {
                try {
                    throw new NameUsedException("你输入的账号已被注册，请重新输入");
                } catch (NameUsedException e) {
                    System.out.println(e);
                    u.setUserName(u.method());
                }
            }
        }
        i++;
    }
}
