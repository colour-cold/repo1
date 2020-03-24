public class IfTest {
    public static void main(String[] args) {
        /*需求：假设系统给定一个考生的成绩，成绩可能带有小数点，
                根据学生的成绩判断该学生的成绩等级；
                【90 - 100】A
                【80-90）   B
                [70-80)     C
                [60-70)     D
                [0-60)      E
                以上的逻辑判断采用if语句完成，应该如何写？

        double point = 36.5;
        if (point >= 90 && point <= 100) {
            System.out.println("该学生等级为A");
        }
        if (point >= 80 && point < 90) {
            System.out.println("该学生等级为B");
        }
        if (point >= 70 && point < 80) {
            System.out.println("该学生等级为C");
        }
        if (point >= 60 && point < 70) {
            System.out.println("该学生等级为D");
        }
        if (point >= 0 && point < 60) {
            System.out.println("该学生等级为E");
        }
        //以上方式可以完成需求但效率较低，因为每一个if系统都需要对其做出判断。*/

        // 键盘输入：
        //1.第一步：创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        //2.第二步：调用Scanner对象的next（）方法开始接受用户键盘输入
        //          当程序执行到这里会停下来等待用户的输入
        //          当用户输入的时候，并且最终敲回车键的时候，输入的信息会自动赋值给userInputContent
        //          程序执行到这里，用户输入的信息已经存到内存中了
        //String str = s.next();//          接受文本---以字符串的形式接收
        int num = s.nextInt();//接收数字，以int形式接收
        //将内存中的数据输出到控制台
        System.out.println("您输入了:" + num);


        double score = num;
        if (score < 0 || score > 100) {
            System.out.println("成绩不合法");
        } else if (score >= 90) {
            System.out.println("A");//因为若程序能执行到这足以说明score是<=100的所以不用写成score >= 90 && score <= 100;
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }


    }
}
