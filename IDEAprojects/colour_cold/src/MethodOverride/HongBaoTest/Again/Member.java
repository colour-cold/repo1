package MethodOverride.HongBaoTest.Again;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    static int num;
    int id = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
        show();
        id = ++num;
        list.add(id);
    }

    public void receive(ArrayList<Integer> list1) {
        if (list.contains(id)) {
            int index = new Random().nextInt(list1.size());
            this.setMoney(this.getMoney() + list1.get(index));
            list1.remove(index);
            list.remove(list.indexOf(id));
            System.out.println(this.getName() + "现在的余额为:" + this.getMoney());
        } else {
            System.out.println("别贪");
        }
    }
}
