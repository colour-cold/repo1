package PolymorphismTest;

//主人类
public class Master {
    public static void main(String[] args) {
        //主人喂🐱和🐶
        Master Colour_cold = new Master();
        /*
        //方法1
         Cat miao = new Cat();
         Dog shit = new Dog();
         Colour_cold.feed(miao);
         Colour_cold.feed(shit);
         */
        /*
        //方法2
         Colour_cold.feed(new Cat());
         Colour_cold.feed(new Dog());
         */
        /*
        //方法3
        Pet a1 = new Cat();
        Pet a2 = new Dog();
        if (a1 instanceof Cat){
            Colour_cold.feed(new Cat());
        }
        else {
            Colour_cold.feed(new Dog());
        }
        if (a2 instanceof Cat){
            Colour_cold.feed(new Cat());
        }
        else {
            Colour_cold.feed(new Dog());
        }
        */


    }

    public void feed(Pet pet) {
        pet.eat();
    }
}
