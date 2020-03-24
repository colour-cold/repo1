package Static.Test01;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.method();
        p1.methodStatic();//正确但不推荐
        Person.methodStatic();//正确且推荐
    }
}
