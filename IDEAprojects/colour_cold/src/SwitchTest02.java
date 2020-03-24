public class SwitchTest02 {
    /*
    假设系统给定考生成绩，请判断该考生的成绩等级

    1.有效考生成绩 【0-100】

    2考试成绩可能带有小数

    3.考试成绩和等级之间的对照关系：
    【90-100】A
    【80-90}  B
    .....
    [0-60]    E

    4.以上需求必须采用switch语句完成，不能采用if

    窍门 ： （int）（成绩/10）
     */
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("输入考生成绩:");
        double num = s.nextDouble();
        int grade = (int) (num / 10);
        switch (grade) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("B");
                break;
            case 9:
            case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("输入成绩有误");
        }
    }
}
