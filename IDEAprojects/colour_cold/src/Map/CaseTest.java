package Map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
    计算一个字符串中每个字符出现的次数
 */
public class CaseTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//      System.out.println(str);

        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0, a = 1; i < str.length(); i++) {
//            if (map.containsKey(str.charAt(i))) {
//                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
//            } else {
//                map.put(str.charAt(i), a);
//            }
//        }
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
