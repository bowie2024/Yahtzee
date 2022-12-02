public class Yahtzee {
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;
    public Yahtzee() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }

    public void roll() {
        this.die1.roll();
        this.die2.roll();
        this.die3.roll();
        this.die4.roll();
        this.die5.roll();
    }

    public void roll(int dieNumber) {
        if(dieNumber==1) {
            this.die1.roll();
        }else if(dieNumber == 2) {
            this.die2.roll();
        }else if(dieNumber == 3) {
            this.die3.roll();
        }else if(dieNumber == 4) {
            this.die4.roll();
        }else if(dieNumber == 5) {
            this.die5.roll();
        }
        return;
    }

    public void summarize() {
        int[] allValues= {die1.getValue(),die2.getValue(),die3.getValue(),die4.getValue(),die5.getValue()};
        int howMany;
        for (int i=1;i <=6;i++) {
            howMany=0;
            for (int a=0; a< allValues.length; a++) {
                if(i==allValues[a]) {
                    howMany++;
                }
            }
            System.out.println(i+"-"+howMany+";");
        }
    }

    public String toString() {
        return "Dice Values:"+die1.getValue()+die2.getValue()+die3.getValue()+die4.getValue()+die5.getValue();
    }
}



