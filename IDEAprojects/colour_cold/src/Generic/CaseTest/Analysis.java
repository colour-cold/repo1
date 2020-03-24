package Generic.CaseTest;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例
    1.准备牌54张，存储到一个集合中
        特殊牌：大王、小王
        其他52张牌：
                定义一个集合，存储4种花色♠、♥、♣、♦
                定义一个集合，存储13个序号：2、A、K...3
        循环嵌套遍历两个集合，组装52张牌

    2.洗牌
        使用集合工具类Collections的方法
        static void shuffle(List<?> list)会随机打乱集合中元素的顺序

    3.发牌
        要求：1人17张牌，剩余三张作为底牌，一人一张轮流发牌，集合的索引(0-53)%3
        定义4个集合，存储三个玩家的牌与底牌
        索引%3有三个值(0、1、2) 0%3=0 1%3=1 2%3=2
        索引>=51 改发底牌

    4.看牌
        直接打印，或者遍历玩家的牌与底牌
 */
public class Analysis {
    public static void main(String[] args) {
        //1.准备54张牌
        ArrayList<String> listFlower = new ArrayList<>();
        listFlower.add("♠");
        listFlower.add("♥");
        listFlower.add("♣");
        listFlower.add("♦");

        ArrayList<String> listNum = new ArrayList<>();
        listNum.add("2");
        listNum.add("A");
        listNum.add("K");
        listNum.add("Q");
        listNum.add("J");
        listNum.add("10");
        listNum.add("9");
        listNum.add("8");
        listNum.add("7");
        listNum.add("6");
        listNum.add("5");
        listNum.add("4");
        listNum.add("3");

        ArrayList<Card> listCard = new ArrayList<>();
        for (int i = 0, a = 52; i < 13; i++) {
//            if (i <= 12) {
//                listCard.add(listFlower.get(0) + listNum.get(i));
//            }
//            else if (i > 12 && i <= 25) {
//                listCard.add(listFlower.get(1) + listNum.get(i - 13));
//            }
//            else if (i > 25 && i <= 38) {
//                listCard.add(listFlower.get(2) + listNum.get(i - 26));
//            }
//            else if (i > 38 && i <= 51) {
//                listCard.add(listFlower.get(3) + listNum.get(i - 39));
//            }
            //简便方法，for循环嵌套增强for循环
            for (String s : listFlower) {
                Card c = new Card();
                c.setName(s + listNum.get(i));
                c.setId(a);
                a--;
                listCard.add(c);
            }
        }
        Card Boss = new Card();
        Boss.setId(54);
        Boss.setName("大王");
        listCard.add(Boss);

        Card boss = new Card();
        boss.setId(53);
        boss.setName("小王");
        listCard.add(boss);

//      System.out.println(listCard);//验证步骤查看牌是否正确

        //2.洗牌
        Collections.shuffle(listCard);
//      System.out.println(listCard);//验证步骤，查看洗牌是否完成

        //3.发牌
        ArrayList<Card> listPlayer1 = new ArrayList<>();
        ArrayList<Card> listPlayer2 = new ArrayList<>();
        ArrayList<Card> listPlayer3 = new ArrayList<>();
        ArrayList<Card> listPlayer4 = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            if (i % 3 == 0 && i <= 50) {
                listPlayer1.add(listCard.get(i));
            }
            if (i % 3 == 1 && i <= 50) {
                listPlayer2.add(listCard.get(i));
            }
            if (i % 3 == 2 && i <= 50) {
                listPlayer3.add(listCard.get(i));
            }
            if (i > 50) {
                listPlayer4.add(listCard.get(i));
            }
        }

        //4.看牌

        //未洗牌之前
        //1.直接用增强for循环遍历或者重写toString方法
        System.out.print("1号玩家拿到的牌：");
//        for (Card c : listPlayer1) {
//            System.out.print(c.getName() + ",");
//        }
        System.out.println(listPlayer1);

        System.out.print("2号玩家拿到的牌：");
        System.out.println(listPlayer2);


        System.out.print("3号玩家拿到的牌：");
        System.out.println(listPlayer3);


        System.out.print("底牌:");
        for (Card c : listPlayer4) {
            System.out.print(c.getName() + ",");
        }

        System.out.println('\n');
//        System.out.println(listPlayer1);
//        System.out.println(listPlayer2);
//        System.out.println(listPlayer3);
//        System.out.println(listPlayer4);

        //洗牌后
        //方法一 利用自己写的方法
//        System.out.print("整理后1号玩家的牌：");
//        sortCard(listPlayer1);
//        System.out.println('\n');
//
//        System.out.print("整理后2号玩家的牌：");
//        sortCard(listPlayer2);
//        System.out.println('\n');
//
//        System.out.print("整理后3号玩家的牌：");
//        sortCard(listPlayer3);
//        System.out.println('\n');
//
//        System.out.print("底牌:");
//        for (Card c : listPlayer4) {
//            System.out.print(c.getName() + ",");
//        }

        //方法二，让Person类实现Comparable接口，并重写compareTo方法和toString方法
        Collections.sort(listPlayer1);
        Collections.sort(listPlayer2);
        Collections.sort(listPlayer3);

        System.out.print("整理后1号玩家的牌：");
        System.out.println(listPlayer1);

        System.out.print("整理后2号玩家的牌：");
        System.out.println(listPlayer2);

        System.out.print("整理后3号玩家的牌：");
        System.out.println(listPlayer3);

    }

    //创建一个整理牌方法
//    public static void sortCard(ArrayList<Card> list) {
//        ArrayList<String> listSort = new ArrayList<>();
//        String s = null;
//        while (list.size() > 0) {
//            for (int i = 0,num = 100,a = 0; i < list.size(); i++) {
//                for (; list.get(i).getId() < num; i = 0) {
//                    num = list.get(i).getId();
//                    a = i;
//                    s = list.get(i).getName();
//                }
//                while (i == list.size() - 1) {
//                    System.out.print(s + ",");
//                    list.remove(list.get(a));
//                }
//            }
//        }
//    }
}
