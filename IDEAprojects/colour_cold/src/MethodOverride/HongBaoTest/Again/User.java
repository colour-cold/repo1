package MethodOverride.HongBaoTest.Again;

public class User {
    private String name;
    private int money;

    public void show() {
        System.out.println(this.getName() + "余额为:" + this.getMoney());
    }

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
