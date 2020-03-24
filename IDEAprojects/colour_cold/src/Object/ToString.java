package Object;
//Object中的toString方法就是要被重写的
//sun在Object类中设计toString方法的目的，返回java对象的字符串表示形式
//在现实的开发过程中，Object中的toString方法已经不够用了因为Object中的toString方法是用来重写的

public class ToString {
    public static void main(String[] args) {
        //创建一个Object类型的对象
        Object o1 = new Object();
        //调用toString方法
        String ostr = o1.toString();
        System.out.println(ostr);//java.lang.Object@1b6d3586
        //创建一个person类型的对象
        Person p1 = new Person("刘皮尺", 50);
        //调用toString方法
        String pstr = p1.toString();
        System.out.println(pstr);//Object.Person@4554617c

    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写toString方法
    //根据项目需求而定，显示格式，Person[nname=刘皮尺，age=10]
    public String toString() {
        return "Person[name=" + name + ",age=" + age + "]";
    }
}

