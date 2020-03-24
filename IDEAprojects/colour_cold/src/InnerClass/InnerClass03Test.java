package InnerClass;

public class InnerClass03Test {
    public static void main(String[] args) {
        InnerClass03Outer.Inner test = new InnerClass03Outer().new Inner();
        test.innerMethod();
    }
}
