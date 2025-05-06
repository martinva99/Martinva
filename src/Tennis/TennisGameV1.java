package Tennis;

public class TennisGameV1 implements TennisGame {

    private int marcadorJ1 = 0;
    private int marcadorJ2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGameV1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void ganarPunto(String playerName) {
        if (playerName == "player1")
            marcadorJ1 += 1;
        else
            marcadorJ2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (marcadorJ1 == marcadorJ2)
        {
            switch (marcadorJ1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (marcadorJ1 >=4 || marcadorJ2 >=4)
        {
            int minusResult = marcadorJ1 - marcadorJ2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = marcadorJ1;
                else { score+="-"; tempScore = marcadorJ2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}