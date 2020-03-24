package TestClassAsField;

public class Test {
    public static void main(String[] args) {
        //创建英雄
        Hero hero = new Hero();
        hero.setName("冷色调");

        //创建一个武器
        Weapon weapon = new Weapon("树枝");
        //给英雄装备此武器
        hero.setWeapon(weapon);

        hero.attack();

    }
}
