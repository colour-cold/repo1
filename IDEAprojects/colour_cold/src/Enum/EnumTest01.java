package Enum;

/*
    在开发中可能遇到一个方法的执行过包括三种情况、四种情况或者更多
    这时布尔类型无法满足需求，那么就需要使用java中的枚举类型

    总结：
        1.枚举是一种引用数据类型
        2.枚举类型的语法：
            enum 枚举类型名称 {
                枚举值1，枚举值2
            }
        3.结果只有两种情况建议使用布尔类型，结果超过两种并且还是可以一枚一枚列举出来的，建议使用枚举类型
          例如：颜色、四季、星期等
 */
public class EnumTest01 {
    public static boolean method(int a, int b) {
        try {
            int c = a / b;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //此方法可以用enum改写
    enum result {
        SUCCESS, FAIL
    }

    //将上述方法返回值改成result类型
    public static result methodNew(int a, int b) {
        try {
            int c = a / b;
            return result.SUCCESS;
        } catch (Exception e) {
            return result.FAIL;
        }
    }

    public static void main(String[] args) {
        boolean result = method(10, 2);
        System.out.println(result == true ? "计算成功" : "计算失败");

        EnumTest01.result result1 = methodNew(10, 2);
        System.out.println(result1 == EnumTest01.result.SUCCESS ? "计算成功" : "计算失败");
    }
}
