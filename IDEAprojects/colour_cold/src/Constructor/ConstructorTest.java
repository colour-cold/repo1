package Constructor;

public class ConstructorTest {
    private int no;

    private String name;

    public ConstructorTest(int a, String b) {
        no = a;
        name = b;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
