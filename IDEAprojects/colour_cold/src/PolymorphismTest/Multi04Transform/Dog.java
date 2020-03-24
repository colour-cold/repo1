package PolymorphismTest.Multi04Transform;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void protect() {
        System.out.println("看家");
    }
}
