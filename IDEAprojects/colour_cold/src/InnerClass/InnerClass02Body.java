package InnerClass;


public class InnerClass02Body {

    public class Heart {
        public void beat() {
            System.out.println("心脏跳动");
            System.out.println(name);//正确写法
        }
    }

    //外部类成员变量
    private String name;

    //外部类方法
    public void methodBody() {
        System.out.println("外部类方法");
        new Heart().beat();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
