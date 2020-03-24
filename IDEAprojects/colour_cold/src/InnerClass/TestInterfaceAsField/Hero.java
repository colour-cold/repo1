package InnerClass.TestInterfaceAsField;

public class Hero {
    private String name;
    private Skill skill;

    public void attack() {
        System.out.println(name + "使用了技能");
        skill.use();
    }

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
