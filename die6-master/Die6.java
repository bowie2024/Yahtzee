public class Die6
{
    private int value;
    public Die6() {
        this.roll();
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = (int)(Math.random() * 6) + 1;
    }

    int rollAndGetValue() {
        roll();
        return getValue();
    }

}

