package Test.Test01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
    测试分类：
        1.黑盒测试：不需要写代码，给输入值，看程序是否能够输出期望的值
        2.白盒测试：需要写代码的。关注程序具体的执行流程

    junit使用：白盒测试
        步骤：
            1.定义一个测试类(测试用例)
                建议：
                    测试类名：被测试的类名Test
                    包名：xxx.xxx.test
            2.定义测试方法：可以独立运行
                建议：
                    方法名：test测试的方法名
                    返回值：void
                    参数列表：空参
            3.给方法加@Annotation.Test.Test
            4.导入junit依赖环境

         判定结果：
            红色：失败
            绿色：成功
            一般我们会使用所断言操作来处理结果
                Assert.assertEquals(期望的结果，输出的结果)

         补充：
            @Before
                修饰的方法会在测试方法之前被自动执行
            @After
                修饰的方法会在测试方法执行之后被自动执行
 */

public class Test01 {
    /*
        测试add方法
     */
    @Before
    public void init() {
        System.out.println("init初始化执行");
    }

    @After
    public void close() {
        System.out.println("close关闭执行");
    }

    @Test
    public void addTest() {
        //1.创建计算器对象
        Calculator c = new Calculator();
        //2.调用add方法
        int result = c.add(1, 2);
        //3.断言 我断言这个结果为3
        Assert.assertEquals(3, result);
    }

    /*
        测试sup方法
     */
    @Test
    public void sup() {
        //1.创建计算器对象
        Calculator c = new Calculator();
        //2.调用sup方法
        int result = c.sup(1, 2);
        //3.断言 我断言这个结果为3
        Assert.assertEquals(-1, result);
        System.out.println("sup方法已执行");
    }

}
