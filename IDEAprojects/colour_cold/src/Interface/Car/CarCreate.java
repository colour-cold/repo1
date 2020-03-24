package Interface.Car;

public class CarCreate {
    public static void main(String[] args) {
        //1.生产引擎
        Engine e = new Engine1();
        //2.汽车生产
        Car c = new Car(e);
        //3.引擎测试
        c.testEngine();
        //4.换发动机
        c.e = new Engine2();
        //5.再测试
        c.testEngine();

    }
}

