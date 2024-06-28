package chap40.test;

public class Card implements Comparable<Card> {

    private final int rank;
    private final Icon icon;

    public Card(int rank, Icon icon) {
        this.rank = rank;
        this.icon = icon;
    }

    public int getRank() {
        return rank;
    }

    public Icon getIcon() {
        return icon;
    }

    @Override
    public int compareTo(Card o) {
        if (rank != o.rank) {
            return Integer.compare(rank, o.rank);
        } else {
            return icon.compareTo(o.icon);
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", icon=" + icon +
                '}';
    }
}
