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

    public String calcSumA(double sum){
        sum = sum * 1.25;
        return "Your win is " + sum + ".";
    }

    public String calcSumB(double sum){
        sum = sum * 1.2;
        return "Your win is " + sum + ".";
    }

    public String calcSumC(double sum){
        sum = sum * 1.9;
        return "Your win is " + sum + ".";
    }
}