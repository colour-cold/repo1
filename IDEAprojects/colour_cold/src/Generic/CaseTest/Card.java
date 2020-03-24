package Generic.CaseTest;

/*
    给每张牌一个属于自己的id 以便于排大小
 */
public class Card implements Comparable<Card> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Card o) {
        return this.getId() - o.getId();
    }

    @Override
    public String toString() {
        return name;
    }
}
