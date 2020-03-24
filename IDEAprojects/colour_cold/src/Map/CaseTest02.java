package Map;

import java.util.*;

/*
   斗地主综合案例
    1.准备牌54张，存储到一个集合中
        特殊牌：大王、小王
        其他52张牌：
                定义一个集合，存储4种花色♠、♥、♣、♦
                定义一个集合，存储13个序号：2、A、K...3
        循环嵌套遍历两个集合，组装52张牌

        再定义一个map集合key值为牌的索引0，1，2....53
                        value值为牌 大王 小王 ♣2....

    2.洗牌
        使用map.getSet()把key值存到一个集合中然后使用集合工具类Collections的方法
        static void shuffle(List<?> list)会随机打乱集合中元素的顺序


    3.发牌
        要求：1人17张牌，剩余三张作为底牌，一人一张轮流发牌，集合的索引(0-53)%3
        定义4个集合，存储三个玩家的牌与底牌
        索引%3有三个值(0、1、2) 0%3=0 1%3=1 2%3=2
        索引>=51 改发底牌

    4.使用Collections中的方法sort(List<E> list)

    5.看牌
        遍历一个集合到另外一个集合的key
        通过key找value

 */
public class CaseTest02 {
    public static void main(String[] args) {
        ArrayList<String> listFlower = new ArrayList<>();
        listFlower.add("♠");
        listFlower.add("♥");
        listFlower.add("♣");
        listFlower.add("♦");

        ArrayList<String> listNum = new ArrayList<>();
        listNum.add("3");
        listNum.add("4");
        listNum.add("5");
        listNum.add("6");
        listNum.add("7");
        listNum.add("8");
        listNum.add("9");
        listNum.add("10");
        listNum.add("J");
        listNum.add("Q");
        listNum.add("K");
        listNum.add("A");
        listNum.add("2");


        ArrayList<String> listCard = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (String s : listFlower) {
                listCard.add(s + listNum.get(i));
            }
        }
        Collections.addAll(listCard, "小王", "大王");

        //2.洗牌
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < listCard.size(); i++) {
            map.put(i, listCard.get(i));
        }//{0 = ♠3.....53 = 大王}

        ArrayList<Integer> list = new ArrayList();
        for (Integer i : map.keySet()) {
            list.add(i);
        }//[0,1,..,53]

        Collections.shuffle(list);

        //3.发牌
        ArrayList<Integer> listPlayer1 = new ArrayList<>();
        ArrayList<Integer> listPlayer2 = new ArrayList<>();
        ArrayList<Integer> listPlayer3 = new ArrayList<>();
        ArrayList<Integer> listPlayer4 = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            if (i % 3 == 0 && i <= 50) {
                listPlayer1.add(list.get(i));
            }
            if (i % 3 == 1 && i <= 50) {
                listPlayer2.add(list.get(i));
            }
            if (i % 3 == 2 && i <= 50) {
                listPlayer3.add(list.get(i));
            }
            if (i > 50) {
                listPlayer4.add(list.get(i));
            }
        }

        //4.理牌
        Collections.sort(listPlayer1);
        Collections.sort(listPlayer2);
        Collections.sort(listPlayer3);

        //5.查看牌
        showMethod(listPlayer1, map);
        showMethod(listPlayer2, map);
        showMethod(listPlayer3, map);

    }

    private static void showMethod(List<Integer> list, Map<Integer, String> map) {
        for (Integer i : list) {
            String value = map.get(i);
            System.out.print(value + " ");
        }
        System.out.println('\n');
    }
}