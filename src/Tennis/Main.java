package Tennis;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome TO TENNIS GAME!"+"\n");

        TennisGame partido1 = new TennisGameV2("antonio", "jose");
        partido1.ganarPunto("antonio");

        System.out.println(partido1.getScore(""));

    }
}
