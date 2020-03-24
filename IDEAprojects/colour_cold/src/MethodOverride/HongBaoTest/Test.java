package MethodOverride.HongBaoTest;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Leader leader = new Leader("冷色调", 100000000);

        Member member1 = new Member("lbw", 0);
        Member member2 = new Member("pdd", 0);
        Member member3 = new Member("Xdd", 0);
        Member member4 = new Member("yjj", 0);
        Member member5 = new Member("xxbb", 0);


//        ArrayList<Integer> list1 = leader.sendNormal(100,5);
//        member1.receive(list1);
//        member2.receive(list1);
//        member3.receive(list1);
//        member4.receive(list1);
//        member5.receive(list1);


        ArrayList<Integer> list2 = leader.sendRandom(100, 5);
        member1.receive(list2);
        member2.receive(list2);
        member3.receive(list2);
        member4.receive(list2);
        member5.receive(list2);


    }
}
