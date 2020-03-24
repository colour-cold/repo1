package Thread.ThreadLambda15.LambdaTest04;

/*
    Lambda表达式有参数有返回值的练习
    需求：
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class LambdaTest04 {
    public static void main(String[] args) {
        invokeCalc(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        //使用Lambda格式
        invokeCalc(120, 130, (int a, int b) -> {
            return a + b;
        });

        //Lambda表达式省略优化
        //使用Lambda格式
        invokeCalc(120, 130, (a, b) -> a + b);

    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
