package app;

public class GamblingGame extends Game{

    int num;

    double sum;

    public GamblingGame(int num, double sum) {
        super(num, sum);
        this.num = num;
        this.sum = sum;
    }

    void infoNum(){
        num = getNum();
        System.out.println("\nYour num is " + num + ".");
    }
}