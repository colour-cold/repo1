package Thread.Test;

import TCPIP.Case.Server;

public class Test {
    public static void main(String[] args) {
        RunnableTest run = new RunnableTest();
        Thread mt1 = new Thread(run);
        Thread mt2 = new Thread(run);
        Thread mt3 = new Thread(run);
        mt1.start();
        mt2.start();
        mt3.start();

    }
}
