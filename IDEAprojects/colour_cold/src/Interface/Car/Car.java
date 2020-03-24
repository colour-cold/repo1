package Interface.Car;

public class Car {
    Engine e;

    Car(Engine e) {
        this.e = e;
    }

    public void testEngine() {
        e.start();//面向接口调用
    }
}

