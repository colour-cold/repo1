package PolymorphismTest.Multi04Transform;

/*那么如何才能知道一个父类引用的对象，本来是什么子类？
       格式：
      对象 instanceof 类名称；
      这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例

 */
public class InstanceofTest {
    public static void main(String[] args) {
        Animal animal = new Dog();//本来为一只狗
        animal.eat();//狗吃骨头
        System.out.println("============================");

        setPet(animal);

        System.out.println("============================");

        setPet(new Cat());
    }

    public static void setPet(Animal animal) { //写一个生成宠物的方法
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.protect();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
