package ForTest;

/**
 * 编写程序模拟一个酒店管理系统，预定房间，退房......
 */

public class HotleAdministration {
    class Room {
        String number;
        String type;    //标准间 双人间 豪华间
        boolean isUse;  //true表示占用，false表示空闲
    }

    class Hotle {
        //规定酒店 5层，每层10个房间
        //1，2层是标准间
        //3.4层是双人间
        //5是豪华间
        Room[][] rooms;

        //无参数
        Hotle() {
            this(5, 10);
        }

        //有参数
        Hotle(int rows, int cols) {
            rooms = new Room[rows][cols];
            /*
            room[0][0]
            room[4][9]
             */
        }

        class Test {
        }
    }

}
