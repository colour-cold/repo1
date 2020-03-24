package IO.Test09.ObjectOutputStream09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream：对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
        ObjectOutputStream(OutputStream out) 创建写入指定OutputStream的ObjectOutputStream
        参数：
            OutputStream out：字节输出流

    特有的成员方法：
        void writeObject(Object obj) 将指定的对象写入ObjectOutputStream

    使用步骤：
        1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        3.释放资源

    static关键字：静态关键字
        静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
        被static修饰符的成员变量不能被序列化的，序列化的都是对象
        private static int gae;
        oos.writeObject(new Person("冷色调",18));
        Object o = ois.readObject();
        Person{name="冷色调",age=0};

     transient关键字：瞬态关键字
        被transient修饰成员变量，不能被序列化
        private transient int age;
        oos.writeObject(new Person("冷色调",18));
        Object o = ois.readObject();
        Person{name="冷色调",age=0}

 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\IO\\Test09\\ObjectOutputStream09\\person.txt"));

        //2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        oos.writeObject(new Person("冷色调", 18));

        //3.释放资源
        oos.close();
    }
}
