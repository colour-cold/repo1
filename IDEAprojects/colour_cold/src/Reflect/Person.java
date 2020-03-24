package Reflect;

public class Person {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person() {
    }

    private Person(String name) {
        this.name = name;
    }

    private Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("恰东西");
    }

    public void drink(String name) {
        System.out.println(name + "喝水");
    }

    private void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
