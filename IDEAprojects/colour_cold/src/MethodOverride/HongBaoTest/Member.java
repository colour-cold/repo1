package MethodOverride.HongBaoTest;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    static int count = 0;//计数器
    int id = 0;

    public Member() {
    }

    //创建一个集合，将群成员放入集合，目的是当群成员领取红包后移出集合不让此成员二次收红包
    static ArrayList<Integer> list = new ArrayList<>();

    public Member(String name, int money) {
        super(name, money);
        show();
        id = ++count;
        list.add(id);
    }

    public void receive(ArrayList<Integer> list1) {
        if (list.contains(this.id)) {
            //设置了一个索引，这个索引代表的是从红包中随机抽取一份的那个一份具体是哪一份的数值
            int index = new Random().nextInt(list1.size());
            //现在的余额=原本的余额+从红包中抽取的那份
            this.setMoney(this.getMoney() + list1.get(index));
            //当这一份被抽取后，从集合中删除
            list1.remove(index);
            //此成员从群成员集合中删除，则无法再次领取红包
            list.remove(list.indexOf(id));
            System.out.println(this.getName() + "领取了冷色调的红包,余额为:" + this.getMoney());
        } else {
            System.out.println(this.getName() + "你领过了,贪p");
        }
    }
}
