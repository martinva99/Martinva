package Tennis;

public class TennisGameV2 implements TennisGame {

    private int marcadorJ1 = 0;
    private int marcadorJ2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;

    public TennisGameV2(String player1Name, String player2Name) {
        this.nombreJugador1 = player1Name;
        this.nombreJugador2 = player2Name;
    }

    public void ganarPunto(String playerName) {
        if (playerName == "player1")
            marcadorJ1 += 1;
        else
            marcadorJ2 += 1;
    }

    public String getScore(String score) {
        int tempScore=0;
        if (marcadorJ1 == marcadorJ2)
        {
            switch (marcadorJ1)
            {
                case 0:
                    score = "Empate a cero";
                    break;
                case 1:
                    score = "Empate a 15";
                    break;
                case 2:
                    score = "Empate a 30";
                    break;
                default:
                    score = "Empate a 40";
                    break;

            }
        }
        else if (marcadorJ1 >=4 || marcadorJ2 >=4)
        {
            int minusResult = marcadorJ1 - marcadorJ2;
            if (minusResult==1) score ="Ventaja jugador 1";
            else if (minusResult ==-1) score ="Ventaja jugador 2";
            else if (minusResult>=2) score = "Gana jugador 1";
            else score ="Gana jugador 2";
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
                        score+="Cero";
                        break;
                    case 1:
                        score+="15";
                        break;
                    case 2:
                        score+="30";
                        break;
                    case 3:
                        score+="40";
                        break;
                }
            }
        }
        return score;
    }
}
