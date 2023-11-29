package app;

import app.util.Randomizer;

public class Play {

    public static void main(String[] args) {

        Input in = new Input();
        Randomizer random = new Randomizer();

        String answer = in.Run();

        if (answer.equals("Y")) {
            System.out.println("Good luck!");
        }
        else if (answer.equals("N")) {
            System.out.println("Good bye.");
            System.exit(0);
        }
        else {
            System.out.println("Incorrect answer.");
            System.exit(0);
        }

        double deposit = in.Bet();

        GamblingGame game = new GamblingGame(0, deposit);

        game.setNum(random.getRandomNum());

        game.setSum(deposit);

        game.infoNum();

        if (game.getNum() < 3) System.out.println(game.calcSumA(game.getSum()));
        else if (game.getNum() >= 3 && game.getNum() <= 7) System.out.println(game.calcSumB(game.getSum()));
        else System.out.println(game.calcSumC(game.getSum()));
    }
}
