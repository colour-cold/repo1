package Exception;

/*
    throw关键字
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因");
    注意：
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是其子类对象，我们可以不处理，交给JVM处理(打印异常对象，中断程序)
                NullPointerException是一个运行期异常，我们不用处理，默认交给JVM处理
                ArrayIndexOutOfBoundsException是一个运行期异常，不用我们处理，交给JVM
            throw关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常，要么throws，要么try..。catch
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int e = getElement(array, 3);
        System.out.println(e);
    }

    /*
        创建一个方法，获取数组指定索引处的元素
        (工作中)首先必须对方法传递过来的参数进行合法校验
        如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
     */
    private static int getElement(int[] array, int index) {
        //如果数组array的值是null，那么我们就抛出空指针异常，告知方法的调用者"传递的数组的值是null"
        if (array == null) {
            throw new NullPointerException("传递的数组的值是null");
        }

        /*
            还可以对传递过来的参数index进行合法性校验，如果index的范围不在数组的索引范围内
            那么我们就抛出数组索引越界异常，告知方法的调用者"传递的索引超出了数组的使用范围"
         */


        if (index < 0 || index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }
        int ele = array[index];
        return ele;
    }
}
