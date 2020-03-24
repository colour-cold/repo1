package BallGame;

import javax.swing.*;
import java.awt.*;


public class BallGame extends JFrame {
    /**
     * 加载图片
     */
    Image ball = Toolkit.getDefaultToolkit().getImage("C:\\Users\\冷色调\\Desktop\\java图片\\baiqiu.jpg");
    Image desk = Toolkit.getDefaultToolkit().getImage("C:\\Users\\冷色调\\Desktop\\java图片\\qiuzhuo.jpg");
    double x = 100;//小球起始横坐标
    double y = 100;//小球起始纵坐标
    //boolean right = true;
    double degree = 3.14 / 3;//起始方向弧度等于60

    /**
     * 画窗口的方法
     */
    public void paint(Graphics g) {
        System.out.println("窗口被画了一次！");
        g.drawImage(desk, 0, 0, null);//(0,0)为鼠标所在之处的坐标
        g.drawImage(ball, (int) x, (int) y, null);
        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);
        if (y > 500 - 40 - 30 || y < 40 + 40) {
            degree = -degree;
        }
        if (x > 856 - 40 - 30 || x < 40) {
            degree = 3.14 - degree;
        }
//        if (right) {
//            x += 10;
//        } else {
//            x -= 10;
//        }
//        if (x > 856 - 40 - 30) {
//            right = false;
//        }
//        if (x < 40){
//            right = true;
//        }
    }

    /**
     * 窗口加载
     */
    void launchFrame() {
        setSize(856, 500);
        setLocation(50, 50);
        setVisible(true);
        /**
         * 重画窗口（更新窗口）
         */
        while (true) {
            repaint();
            try {
                Thread.sleep(40);//每40ms重画一次窗口
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //mian方法程序入口
    public static void main(String[] args) {
        System.out.println("小游戏开始");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
