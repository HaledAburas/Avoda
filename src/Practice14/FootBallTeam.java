package Practice14;

public class FootBallTeam {

    static String name;
    static String country;
    static String[] players;
    static int teamrate;
    static int serialNum = 0;

    public FootBallTeam(String name, String country, int teamrate) {
        FootBallTeam.name = name;
        FootBallTeam.country = country;
        players = new String[11];
        FootBallTeam.teamrate = teamrate;
        ++serialNum;
    }

    public void changeRating(int d) {
        teamrate = d;
    }

    public void addplayer(String name) {
        for (int i = 0; i < players.length; ++i) {
            if (players[i] == null) {
                players[i] = name;
                break;
            }
        }
    }
}
