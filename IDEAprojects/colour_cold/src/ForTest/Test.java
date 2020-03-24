package ForTest;

public class Test {
    public static void main(String[] args) throws StackException {
        Stack s = new Stack();


        User u1 = new User("张三", 10);
        User u2 = new User("辣鸡", 11);
        User u3 = new User("小果", 12);
        User u4 = new User("冷色调", 13);
        User u5 = new User("哈皮", 14);
        try {
            s.push(u1);
            s.push(u2);
            s.push(u3);
            s.push(u4);
            s.push(u5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "[User:" + "name:" + name + "age:" + age + "]";
    }
}
