package MethodReferrance.MethodReferranceTest06;

/*
    类的构造器(构造方法)引用
 */
public class PersonBuild {
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名创建Person对象
    public static void method(String name, PersonBuilder pb) {
        Person p = pb.buildPerson(name);
        System.out.println(p.getName());
    }

    public static void main(String[] args) {
        //调用method方法，方法的参数PersonBuilder接口是一个函数式接口，可以传递Lambda表达式
        method("冷色调", name -> new Person(name));

        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name)已经存在
            创建对象已经存在new
            就可以使用Person引用new创建对象
         */
        method("冷色调", Person::new);
    }
}
