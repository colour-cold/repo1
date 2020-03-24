package PolymorphismTest.MultiCaseTest;

/*
    这是个笔记本类
 */
public class Laptop {

    public void powerOn() {
        System.out.println("开机");
    }

    public void powerOff() {
        System.out.println("关机");
    }

    public void useDevice(USB usb) {
        usb.On();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }
        usb.Off();
    }
}
