package app;

import java.util.Scanner;

public class Input {

    public String Run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Do you want to play?
                Y - Yes
                N - No""");
        return sc.nextLine().trim();
    }

    public double Bet(){
        System.out.println("\nEnter your deposit: ");

        Scanner sc = new Scanner(System.in);

        String deposit = sc.nextLine().trim();
        sc.close();
        return Double.parseDouble(deposit);
    }
}
