public class IfTest01 {
    /*
    需求：
        判断当前的天气：
            当外面下雨：
                带雨伞：
                    判断性别：
                        当为男生：带一把大黑伞
                        当为女生：带一把小花伞
        当为晴天的时候：
            判断温度：
                当温度超过30℃：
                    当为男生：戴墨镜
                    当为女生：擦防晒霜
     */
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入今天天气为“下雨则输入1”或“晴天则输入2”：");
        int number = s.nextInt();
        if (number == 1) {
            System.out.print("请输入性别为“男则输入1”或“女则输入2”：");
            int sex = s.nextInt();
            if (sex == 1) {
                System.out.println("雨天请带好大黑伞出门");
            } else if (sex == 2) {
                System.out.println("雨天请带好小花伞出门");
            } else {
                System.out.println("输入错误，请重新输入");
            }
        } else if (number == 2) {
            System.out.print("输入当前温度为多少：");
            double num = s.nextInt();
            double tmp = num;
            if (tmp > 30) {
                System.out.print("请输入性别为“男则输入1”或“女则输入2”：");
                int sex = s.nextInt();
                if (sex == 1) {
                    System.out.println("光线刺眼请佩戴墨镜");
                } else if (sex == 2) {
                    System.out.println("请涂抹防晒霜出门");
                } else {
                    System.out.println("输入错误，请重新输入");
                }
            } else {
                System.out.println("路上小心");
            }
        } else {
            System.out.println("输入错误，请正确输入");
        }
    }
}
