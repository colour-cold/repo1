package TestClassAsField;

public class Hero {
    private String name;
    private Weapon weapon;

    public void attack() {
        System.out.println(name + "用" + weapon.getCode() + "超神了");
    }

    public Hero() {
    }

    public Hero(String name, Weapon weapon) {
        this.weapon = weapon;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
