public class Yahtzee
{
    private Die6 dieValue;
    //private int[] dice = new int[5];
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int six;

    private Die6[] dice;
    public Yahtzee() {
        int i ;
        for (i = 0; i<=5; i++) {
            dice[i] = new Die6();
        }
    }

    public void roll() {
        for (int i=0; i<dice.length; i++) {
            dice[i].roll();
        }
    }

    public void roll(int dieNumber) {
        dice[dieNumber].roll();
        //      this.dice[dieNumber - 1] = dieValue.rollAndGetValue();
    }

    public String toString() {
        return "{" + dice[0].getValue() + ", " + dice[1].getValue() + ", " + dice[2].getValue() 
        + ", " + dice[3].getValue() + ", " + dice[4].getValue() + "}";
    }

    public String summarize() {
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        five = 0;
        six = 0;
        int i = 0;
        while (i < 5) {
            if (dice[i].getValue() == 1) {
                one += 1;
            } else if (dice[i].getValue() == 2) {
                two += 1;
            } else if (dice[i].getValue() == 3) {
                three += 1;
            } else if (dice[i].getValue() == 4) {
                four += 1;
            } else if (dice[i].getValue() == 5) {
                five += 1;
            } else {
                six += 1;
            }
            i++;
        }
        return "1-" + one + "; 2-" + two + "; 3-" + three 
        + "; 4-" + four + "; 5-" + five + "; 6-" + six;
    }
}

