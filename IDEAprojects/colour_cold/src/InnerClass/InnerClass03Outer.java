package InnerClass;

//如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
public class InnerClass03Outer {
    int num = 10;

    public class Inner {
        int num = 20;

        public void innerMethod() {
            int num = 30;
            System.out.println(num);//30
            System.out.println(this.num);//20
            System.out.println(InnerClass03Outer.this.num);//10
        }
    }
}
