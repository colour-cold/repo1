package Object;
/*
    关于Object中的equals方法：
    Object中的equals方法：
            public boolean equals (object obj){
                return (this == obj)
            }
             以下代码将o2传给了“object obj”且因为o1调用的equals所以this就是o1
             所以程序变为
             public boolean equals (o2){
                return (o1 == o2)
            }
            两边如果是引用类型，则比较内存地址，地址相同则是true反之是false
            因o1，o2内存地址不同，所以false


 */


import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        boolean b1 = o1.equals(o2);//false
        System.out.println(b1);
        Star s1 = new Star(100, "张三丰");
        Star s2 = new Star(100, "张三丰");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));//当改写后此处现在为true
    }
}

class Star {
    int id;
    String name;

    Star(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Object中的equals方法比较的是内存地址，但是在现实业务逻辑中比较的应该是内容所以需要重写。
    //根据需求重写equals方法，如果身份证与名字相同则是同一个人
    public boolean equals(Object obj) {
        if (obj == null) return false;//此处若obj的值为空，则直接得到答案，提高效率
        if (this == obj) return true;//此处若直接判断内存地址相等则可以直接得到答案，提高效率

        if (obj instanceof Star) {
            Star s = (Star) obj;//强制类型转换将obj转为Star形式
            if (s.id == id && name.equals(s.name)) {
                return true;
            }
        }
        return false;
    }

//    使用IDEA自带的方法
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return id == star.id &&
                Objects.equals(name, star.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }*/
}
