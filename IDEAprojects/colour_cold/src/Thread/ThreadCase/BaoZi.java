package Thread.ThreadCase;

/*
    资源类:包子类
        设置包子的属性
            皮
            馅
            包子的状态：有：true
                       没有：false
 */
public class BaoZi {
    private String s1;

    private String s2;

    private boolean isExistence;

    public BaoZi() {
    }

    public BaoZi(String s1, String s2, boolean isExistence) {
        this.s1 = s1;
        this.s2 = s2;
        this.isExistence = isExistence;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public boolean isExistence() {
        return isExistence;
    }

    public void setExistence(boolean existence) {
        isExistence = existence;
    }
}
