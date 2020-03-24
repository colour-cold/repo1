package MethodOverride.HongBaoTest.Again;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Leader leader = new Leader("冷色调", 100000000);

        Member member1 = new Member("lbw", 0);
        Member member2 = new Member("xdd", 0);
        Member member3 = new Member("pdd", 0);
        Member member4 = new Member("yjj", 0);
        Member member5 = new Member("xxbb", 0);

        ArrayList<Integer> list1 = leader.send(100, 5);

        member1.receive(list1);
        member2.receive(list1);
        member2.receive(list1);
        member4.receive(list1);
        member5.receive(list1);
    }
}
