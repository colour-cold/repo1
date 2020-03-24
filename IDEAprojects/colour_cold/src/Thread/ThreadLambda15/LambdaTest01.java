package Thread.ThreadLambda15;

/*
    编程思想的转换
        在实现多线程的时候真正的是做什么，而不是怎么做，我们只是为了做这件事情不得不创建一个对象
        我们真正希望做的事情是：将run方法体内的代码传送给Thread类知晓

    Lambda表达式的标准格式：
        由三部分组成：
            1.一些参数
            2.一个箭头
            3.一段代码
        格式：
            (参数列表) -> {一些重写方法的代码}
        解释说明格式：
            ()：接口中抽象方法的参数列表，没有参数，就空着，有参数就写出参数，多个参数使用逗号分隔
            ->：传递的意思，把参数传递给方法体{}
            {}：重写接口的抽象方法的方法体
 */
public class LambdaTest01 {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();

        //使用Lambda表达式，实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "新线程创建了");
        }).start();

        //Lambda表达式省略优化
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "新线程创建了")).start();
    }
}
