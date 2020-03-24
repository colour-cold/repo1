package IO.Test09.Case;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
    练习：序列化集合
        当我们想在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合进行序列化和反序列化
 */
public class Case {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\IO\\Test09\\Case\\case.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\IO\\Test09\\Case\\case.txt"));

        Student s1 = new Student("五五开", 18);
        Student s2 = new Student("卢本伟", 18);
        Student s3 = new Student("white", 18);
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);

        oos.writeObject(map);

        Object o = ois.readObject();

        ois.close();

        System.out.println(o);
        Map<Integer, Student> p = (Map<Integer, Student>) o;
        for (Integer key : p.keySet()) {
            Student value = p.get(key);
            System.out.println(key + value.getName() + value.getAge());

        }

        oos.close();
    }


}
