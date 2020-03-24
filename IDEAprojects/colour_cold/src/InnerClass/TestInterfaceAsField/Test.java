package InnerClass.TestInterfaceAsField;

public class Test {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("冷色调");

        //方法一
        hero.setSkill(new SkillImpl());
        hero.attack();

        //方法二
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("技能无敌已经使用");
            }
        };
        hero.attack();

        //方法三
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("技能无敌已经使用");

            }
        });
        hero.attack();
    }
}
