package MethodOverride.HongBaoTest;

public class User {
    private String name;
    private int money;
    private int id;

    public void show() {

        System.out.println(this.name + "的余额为：" + this.money);
    }

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {

        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setMoney(int money) {

        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
