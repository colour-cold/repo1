package ToString;

public class ToString {
    String name;
    int age;

    public ToString() {
    }

    public ToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void method01(ToString str) {

        class Inner {

            @Override
            public String toString() {
                return "ToString{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        Inner inner = new Inner();
        System.out.println(inner.toString());
    }


}
