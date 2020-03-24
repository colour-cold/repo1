public class HelloWorld {
    static int k = 100;
    static char xx;

    public static void main(String[] args) {
        int x = 100;
        System.out.println("HelloWorld");
        System.out.println(k);
        System.out.println(x);
        char Y = '\t';
        char m = '\\';
        char n = '\'';
        System.out.print('A');
        System.out.print(Y);
        System.out.println('B');
        System.out.println(m);
        System.out.println(n);
        System.out.println('\u4e2d');
        System.out.println(xx + 1);
        double d = 10.0 / 3;
        System.out.println(d);
        int b = 10;
        b = b + 10;
        System.out.println(b);
        byte c = 5;
        //c =c+5;//编译报错，因为c+5为int类型，c为byte类型。
        c += 5;//可执行，其等同于：c = (byte)(c+5) 并不等同于 c = c + 5;
        System.out.println(c);
        //根据布尔类型确定的true或false决定，若是true则选择表达式前者作为输出结果，若为false则选择表达式后者作为输出结果
        boolean sex = true;
        char y = sex ? '男' : '女';
        System.out.println(y);
        sex = false;
        y = sex ? '男' : '女';
        System.out.println(y);
    }

    public static void dosome() {
        System.out.println(k);
    }
}