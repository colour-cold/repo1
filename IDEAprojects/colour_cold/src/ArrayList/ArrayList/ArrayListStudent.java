package ArrayList.ArrayList;

import java.util.ArrayList;

public class ArrayListStudent {


    public static void main(String[] args) {
        Student one = new Student("卢本伟", 20);
        Student two = new Student("赌怪", 20);
        Student three = new Student("五五开", 20);
        ArrayList<Student> list = new ArrayList<>();
        one.setName("冷色调");
        list.add(one);
        list.add(two);
        list.add(three);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(list.get(i).getName());
        }
    }
}
