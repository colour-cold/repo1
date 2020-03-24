package MethodOverride.HongBaoTest;

import java.util.ArrayList;
import java.util.Random;

public class Leader extends User {

    public Leader() {
    }

    public Leader(String name, int money) {
        super(name, money);
        show();
    }

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> sendNormal(int sendMoney, int count) {

        for (int i = 0; i < count; i++) {
            list.add(sendMoney / count);
        }
        int nowMoney = this.getMoney() - sendMoney;
        System.out.println(this.getName() + "发了一个红包，还剩余额:" + nowMoney);
        return list;
    }

    public ArrayList<Integer> sendRandom(final int sendMoney, final int count) {
        int leftMoney = sendMoney;
        int leftCount = count;
        Random r = new Random();
        //前n-1随机，最后一份就是剩下的钱
        for (int i = 0; i < count - 1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2);
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }
        list.add(leftMoney);
        int nowMoney = this.getMoney() - sendMoney;
        System.out.println(this.getName() + "发了一个红包，还剩余额:" + nowMoney);
        return list;
    }
}
