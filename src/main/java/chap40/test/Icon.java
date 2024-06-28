package chap40.test;

public enum Icon {
    SPADE("\u2660"),
    HART("\u2665"),
    DIAMOND("\u2666"),
    CLOVER("\u2663");

    private String icon;

    Icon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
