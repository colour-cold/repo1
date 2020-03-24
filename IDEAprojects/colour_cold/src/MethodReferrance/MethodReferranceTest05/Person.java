package MethodReferrance.MethodReferranceTest05;

/*
    通过this引用本类的成员方法
 */
public class Person {
    //定义一个买房子的方法
    public void buyHouse() {
        System.out.println("买一套四合院");
    }

    //定义一个结婚的方法，参数传递Rich接口
    public void marry(Rich r) {
        buyHouse();
    }

    //定义一个行动的方法
    public void move() {
        //调用结婚的方法，方法的参数Rich是一个函数式接口，传递Lambda表达式用this.成员方法调用本类买房子方法
        marry(() -> this.buyHouse());

        /*
            使用方法引用优化Lambda表达式
            this是已经存在的
            本类的成员方法buyHouse也是已经存在的
            所以我们可以直接使用this引用本类的成员方法buyHouse
         */
        marry(this::move);
    }

    public static void main(String[] args) {
        new Person().move();
    }
}
