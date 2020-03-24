public class SwitchTest01 {
    /*
        使用switch语句实现+、-、*、/
        实现思路：
        1.选择所有数据从键盘输入
        2.使用switch语句进行判断
        3.需要从控制台输入三次
                *第一个数字
                * 运算符
                * 第二个数字
        最终在控制台上是这样的一个场景：
            欢迎使用简单计算器系统
            请输入第一个数字：
            请输入运算符：
            请输入第二个数字：
            运算结果：第一个数字 运算 第二个数字 = 结果
    */
    public static void main(String[] args) {
        System.out.println("欢迎使用简单计算器系统");
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int num1 = s.nextInt();
        System.out.print("请输入运算符：");
        String symbol = s.next();
        System.out.print("请输入第二个数字：");
        int num2 = s.nextInt();
        switch (symbol) {
            case "+":
                System.out.println("计算结果为：" + num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case "-":
                System.out.println("计算结果为：" + num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case "*":
                System.out.println("计算结果为：" + num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case "/":
                System.out.println("计算结果为：" + num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("输入有误");
        }


    }
}
