package app;

public class Game {

    private int num;

    private double sum;

    protected Game(int num, double sum) {
        this.num = num;
        this.sum = sum;
    }

    protected int getNum() {
        return num;
    }

    protected void setNum(int num) {
        this.num = num;
    }

    protected double getSum() {
        return sum;
    }

    protected void setSum(double sum) {
        this.sum = sum;
    }
}