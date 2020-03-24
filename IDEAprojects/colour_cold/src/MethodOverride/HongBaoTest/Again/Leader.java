package MethodOverride.HongBaoTest.Again;

import java.util.ArrayList;

public class Leader extends User {

    public Leader() {
    }

    public Leader(String name, int money) {
        super(name, money);
        show();
    }

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> send(int sendMoney, int count) {
        System.out.println("发了个红包");

        for (int i = 0; i < count; i++) {
            list.add(sendMoney / count);
        }
        return list;
    }
}
