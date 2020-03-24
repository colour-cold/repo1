package Generic;

public class Generic02ClassTest {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        Generic02Class gc = new Generic02Class();
        gc.setName("卢本伟");
        Object name = gc.getName();
        System.out.println(name);

        System.out.println("=======================");

        //创建GenericsTest02对象，泛型使用Integer类型
        Generic02Class<Integer> gc2 = new Generic02Class<>();
        gc2.setName(111);
        Integer name1 = gc2.getName();
        System.out.println(name1);

        System.out.println("========================");

        //使用String类型
        Generic02Class<String> gc3 = new Generic02Class();
        gc3.setName("五五开");
        String name2 = gc3.getName();
        System.out.println(name2);
    }
}
