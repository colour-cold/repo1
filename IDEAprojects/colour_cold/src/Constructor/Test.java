package Constructor;

public class Test {
    public static void main(String[] args) {
        User u = new User(20);
        add(u);//传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是一个java对象的内存地址
        System.out.println(u.age);
    }

    public static void add(User u) {
        u.age++;
        System.out.println(u.age);
    }
}

class User {
    int age;

    public User(int i) {
        age = i;
    }
}
