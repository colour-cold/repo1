package CaseTest;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("卢本伟", 30);
        Person two = new Person("赌怪", 30);
        Person three = new Person("五五开", 30);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0].name);

    }
}
